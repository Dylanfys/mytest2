package cn.itcast.spring.proxy;

import com.sun.org.apache.xpath.internal.operations.String;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Data
@AllArgsConstructor
//@NoArgsConstructor

public class JdkProxyFactory {
    private Object target;
    public Object getProxyObject() {
  return        Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("save".equals(method.getName())) {
                    writeLog();
                }
                Object invoke = method.invoke(target, args);


                return invoke;
            }

        });

    }

    private void writeLog() {
        System.out.println("日志方法增强了");

    }

}
