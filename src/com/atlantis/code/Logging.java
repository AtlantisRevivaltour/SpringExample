package com.atlantis.code;

import org.aspectj.lang.annotation.*;

/**
 * Created by IntelliJ IDEA
 * Logging class
 * Description: 请添加描述。
 * User: Atlantis
 * Date: 16/7/25
 * Time: 下午10:26
 */
@Aspect
public class Logging {
    @Pointcut("execution(* com.atlantis.code.*.*(..))")
    private void selectAll(){

    }
    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("Going to setUp student profile.");
    }
    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }
    @AfterReturning(pointcut = "selectAll()",returning = "retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString() );
    }
    @AfterThrowing(pointcut = "selectAll()",throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
