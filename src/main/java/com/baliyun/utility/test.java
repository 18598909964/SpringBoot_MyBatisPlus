package com.baliyun.utility;

import com.baliyun.entity.Landlord;

public class test {
    public static void main(String [] args){
        MD5Utility md5Utility = new MD5Utility();
        Landlord landlord = new Landlord();
        landlord.setUserPassword("213412");
        String str = landlord.getUserPassword();
        String md5 = md5Utility.getMD5(str);
        System.out.println("密文"+md5);
    }

}
