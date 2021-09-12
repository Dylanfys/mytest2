package cn.itcast.spring.proxy;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import javax.jws.Oneway;

@Component
public class MyAspect {
    public void t1() {
        System.out.println("----------");
    }

    public void firstBefore(JoinPoint joinPoint) {

        System.out.println("....第一个前置通知执行了");


    }
    public void firstBefore2() {
        System.out.println("第二个前置通知执行了");

    }

    public void afterReturing(JoinPoint joinPoint, Object returnVal) {
        System.out.println("-++++++++-后置通知-当前下发短信的方法"+"-尊敬的用户，您调用的方法返回余额为：  "+returnVal);
    }

    //环绕通知
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("开启事务");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("关闭事务");
        System.out.println("proceed = " + proceed);
        return proceed;
    }
}
