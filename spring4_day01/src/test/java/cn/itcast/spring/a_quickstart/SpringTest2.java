package cn.itcast.spring.a_quickstart;

import cn.itcast.spring.b_xmlnewbean.Bean2;
import cn.itcast.spring.d_xmllifecycle.LifeCycleBean;
import cn.itcast.spring.e_xmlpropertydi.Car;
import cn.itcast.spring.e_xmlpropertydi.Person;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest2 {
    String app = "applicationContext.xml";
    ApplicationContext ac;
    @Before
    public void tt() {
         ac = new ClassPathXmlApplicationContext(app);

    }
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(app);
        Bean2 bean2 = (Bean2) ac.getBean("bean2");
        System.out.println("bean2 = " + bean2);
        Bean2 bean21 = (Bean2) ac.getBean("bean2");
        System.out.println("bean21 = " + bean21);
        Bean2 bean = ac.getBean(Bean2.class);
        System.out.println("bean = " + bean);
    }
    @Test
    public void  t2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext cac;
        LifeCycleBean bean = ac.getBean(LifeCycleBean.class);
        if (ac instanceof ClassPathXmlApplicationContext) {
             cac = (ClassPathXmlApplicationContext) ac;
            cac.close();
        }
    }
    @Test
    public void  t3() {
        Car car = ac.getBean(Car.class);
        System.out.println("car = " + car);
    }
    @Test
    public  void t4() {
        Person person = (Person) ac.getBean("person2");
        System.out.println("person = " + person);
        Person person3 = (Person) ac.getBean("person3");
        System.out.println("person3 = " + person3);
    }

}
