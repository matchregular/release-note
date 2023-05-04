package com.heodae.releasenote.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopController {
    @Before("execution(* com.heodae.releasenote..*.get*(..))")
    public void test(){
        System.out.println("controllere beffofoo!!!!!");
    }
}
