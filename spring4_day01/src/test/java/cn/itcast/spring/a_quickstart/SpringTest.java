package cn.itcast.spring.a_quickstart;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void  test() {
        IUserService userService = new UserServiceImpl(new UserDaoImpl());
        userService.login();
    }
    @Test
    public void  test2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) ac.getBean("userService");
        userService.login();
    }
}
