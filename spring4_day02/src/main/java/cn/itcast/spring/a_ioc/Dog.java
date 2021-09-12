package cn.itcast.spring.a_ioc;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
