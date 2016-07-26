package com.atlantis.code;

/**
 * Created by IntelliJ IDEA
 * Logging class
 * Description: 请添加描述。
 * User: Atlantis
 * Date: 16/7/25
 * Time: 下午10:26
 */

public class Logging {
    public void beforeAdvice(){
        System.out.println("Going to setUp student profile.");
    }

    public void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString() );
    }
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
