package com.baliyun.utility;

import org.springframework.util.DigestUtils;

/**
 * MD5通用类
 *
 * @author 浩令天下
 * @since 2019.5.16
 *
 */
public class MD5Utility {
    /**
     * MD5方法
     * @param str 明文
     * @return 密文
     * @throws Exception
     */
    //盐，用于混交md5
    private static final String slat = "&%5123***&&%%$$#@";
    public String getMD5(String str) {
        String base = str ;     //不适用加盐加密   +"/"+slat
        System.out.println("密码："+base);
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        System.out.println(md5);
        return md5;
    }

}
