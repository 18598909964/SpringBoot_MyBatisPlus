package com.baliyun.utility;

import org.hibernate.validator.HibernateValidator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * 这是数据校验的工具类
 *
 */
public class ValidatorUtility {
    //获取validator对象
    private static Validator validator = Validation.byProvider(HibernateValidator.class).configure().failFast(true).buildValidatorFactory().getValidator();

    //校验函数
    public static<T> boolean valodator(T t){
        Set<ConstraintViolation<T>> validatorResult = validator.validate(t);
        if (validatorResult.size()>0){
            //未通过校验--查看未通过校验的数组
            System.out.println(validatorResult.iterator().next().getMessage()+"校验失败");
            return false;
        }
        return true;
    }
}
