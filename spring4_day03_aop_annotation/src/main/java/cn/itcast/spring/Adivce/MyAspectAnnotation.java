package cn.itcast.spring.Adivce;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspectAnnotation {
    //    @Before("execution(* cn.itcast.spring..*.*(..))")
//    @Before("execution(* cn.itcast.spring.a_aspect.*.*(..))")

    @Pointcut(value = "execution(* cn.itcast.spring.a_aspect.CustomerService.save(..))")
    private void myPointcut1() {

    }
    @Pointcut(value = "bean(*Service)")
    private void myPointcut2() {

    }
    @Pointcut(value = "execution(* cn.itcast.spring.a_aspect.CustomerService.find(..))")

    private void myPointcut3() {

    }



    @Before("myPointcut1()||myPointcut2()||myPointcut3()")
    public void before1() {
        System.out.println("前置方法");
    }

    @AfterReturning(value="bean(*Service)",returning="returnVal")
    public void afterReturning(JoinPoint joinPoint, Object returnVal){
        System.out.println("=======后置通知。。。。。");
    }
}
