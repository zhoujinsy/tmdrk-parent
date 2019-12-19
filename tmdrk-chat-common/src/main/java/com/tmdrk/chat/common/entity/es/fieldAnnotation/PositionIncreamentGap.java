package com.tmdrk.chat.common.entity.es.fieldAnnotation;

import java.lang.annotation.*;

/**
 * @ClassName PositionIncreamentGap
 * @Description TODO
 * @Author zhoujie
 * @Date 2019/12/18 22:03
 * @Version 1.0
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PositionIncreamentGap {
    int value() default 100; //
    boolean use() default false;   //是否使用
}
