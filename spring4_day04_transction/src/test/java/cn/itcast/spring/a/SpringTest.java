package cn.itcast.spring.a;

import cn.itcast.spring.dao.Person;
import cn.itcast.spring.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {
    @Autowired
    private IAccountService accountService;
    @Autowired
    private Person person;
    @Test
    public void m1() {
        accountService.transfer("tom", "Jack", 100d);
    }
    @Test
    public void m2() {
        System.out.println(person);
    }
}
