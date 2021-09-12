package cn.itcast.spring.a_ioc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    private ApplicationContext ac;

    @Before
    public void bf() {
       ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void t1() {
        CustomerService customerService = ac.getBean(CustomerService.class);
        System.out.println("customerService = " + customerService);
        customerService.save();
    }
    @Test
    public void t2() {

    }
}
