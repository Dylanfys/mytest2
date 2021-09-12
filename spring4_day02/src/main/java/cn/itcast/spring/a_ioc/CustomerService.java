package cn.itcast.spring.a_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Component注解放置到类上 相当于spring容器中定义：<bean id="customerService" class="cn.itcast.spring.a_ioc.CustomerService">
 * 其中id属性默认bean的名字是类名的小写
 * ——————————————————————————————————————————————————————
 * @Component(value="customerService")//自定义bean的名字 相当于spring容器中定义：<bean id="customer" class="cn.itcast.spring.a_ioc.CustomerService">
 * ——————————————————————————————————————————————————————
 */
@Component(value = "customerService")
public class CustomerService {
    @Resource
    private CustomerDao customerDao;
    //    @Autowired
//    private CustomerDao customerDao2;
    @Autowired
    private Animal dog;

    //保存业务方法
    public void save() {
        dog.eat();

    }

}