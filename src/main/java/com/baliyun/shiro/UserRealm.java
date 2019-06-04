package com.baliyun.shiro;

import com.baliyun.entity.AdminUser;
import com.baliyun.entity.Landlord;
import com.baliyun.entity.Tenant;
import com.baliyun.service.AdminUserService;
import com.baliyun.service.GradeService;
import com.baliyun.service.LandlordService;
import com.baliyun.service.TenantService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/*自定义Realm类*/

public class UserRealm extends AuthorizingRealm {

    @Autowired
    AdminUserService adminUserService;
    @Autowired
    LandlordService landlordService;
    @Autowired
    TenantService tenantService;
    @Autowired
    GradeService gradeService;

    /*执行授权逻辑*/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("这是Realm的授权逻辑");
        //给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //获取当前登录用户
        Subject subject = SecurityUtils.getSubject();
        AdminUser adminUser = (AdminUser) subject.getPrincipal();
        //查询用户权限
//        List<Grade> gradeList = gradeService.selectAdminUserGarde(adminUser);
        //添加资源授权字符串
//        info.addStringPermission(String.valueOf(gradeList.get(0).getId()));
        return info;
    }

    /*执行认证逻辑*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("这是Realm的认证逻辑");
        //获取传递过来的用户名和密码
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        System.out.println(token.getUsername()+"\n"+token.getPassword());
        //给传递的用户进行存值
        AdminUser adminUser = new AdminUser();
        adminUser.setUsername(token.getUsername());
        Landlord landlord = new Landlord();
        landlord.setlPhone(token.getUsername());
        Tenant tenant = new Tenant();
        tenant.setPhone(token.getUsername());

        //查询数据库用户和密码
        List<AdminUser> adminUserList = adminUserService.selectList(new EntityWrapper<AdminUser>()
                .eq("username",adminUser.getUsername()));

        List<Landlord> landlordList = landlordService.selectList(new EntityWrapper<Landlord>()
                .eq("l_phone",landlord.getlPhone()));

        List<Tenant> tenantList = tenantService.selectList(new EntityWrapper<Tenant>()
                .eq("t_phone",tenant.getPhone()));

        System.out.println("管理员"+adminUserList.size()+"\n业主"+landlordList.size()+"\n租客"+tenantList.size());
        if (adminUserList.size()!=0){
            /**管理员
             * 2.判断密码（直接new认证逻辑（AuthenticationInfo）的子类）
             */
            return new SimpleAuthenticationInfo(adminUserList,adminUserList.get(0).getAdminPassword(),"");
        }else if (landlordList.size()!=0){
            /**业主
             * 2.判断密码（直接new认证逻辑（AuthenticationInfo）的子类）
             */
            return new SimpleAuthenticationInfo(landlordList,landlordList.get(0).getlPassword(),"");
        }else if (tenantList.size()!=0){
            /**租客
             * 2.判断密码（直接new认证逻辑（AuthenticationInfo）的子类）
             */
            return new SimpleAuthenticationInfo(tenantList,tenantList.get(0).gettPassword(),"");
        }else {
            System.out.println("用户不存在");
            return null;
        }
    }
}
