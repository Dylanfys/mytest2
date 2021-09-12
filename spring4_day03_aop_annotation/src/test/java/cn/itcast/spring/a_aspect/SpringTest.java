package cn.itcast.spring.a_aspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SpringTest {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProductService productService;
    @Test
    public void  m1() {
        customerService.save();
        customerService.find();
        productService.save();
        productService.find();
    }
}
