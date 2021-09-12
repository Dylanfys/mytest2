package cn.itcast.spring.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TimeLogInterceptor implements MethodInterceptor {
    private static Logger LOGGER = Logger.getLogger(TimeLogInterceptor.class);
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        long beforeTime = System.currentTimeMillis();
        Object proceed = methodInvocation.proceed();
        long endTime = System.currentTimeMillis();
        long runTime = endTime - beforeTime;
        System.out.println(methodInvocation.getThis().getClass().getName() + "类的" + methodInvocation.getMethod().getName() + "方法运行了:" + runTime);
        LOGGER.info(methodInvocation.getThis().getClass().getName()+"类的"+methodInvocation.getMethod().getName()+"方法运行了:"+runTime+"毫秒");
        return proceed;
    }
}
