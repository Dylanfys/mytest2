package cn.itcast.spring;

import cn.itcast.spring.proxy.JdkProxyFactory;
import cn.itcast.spring.service.HelloService;
import cn.itcast.spring.proxy.ICustomerService;
import cn.itcast.spring.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {
    @Autowired
    private ProductService productService;
    @Autowired
    private HelloService helloService;
    @Autowired
    private ICustomerService customerService;
    @Test
    public void t1() {
        helloService.sayHello();
        ICustomerService proxy1 = (ICustomerService) new JdkProxyFactory(customerService).getProxyObject();
        proxy1.find();
        System.out.println("----------------------");
        proxy1.save();
    }

    @Test
    public void t2() {
        customerService.save();
        customerService.find();
        productService.save();
        productService.find();
        productService.eat(10);
    }
}
