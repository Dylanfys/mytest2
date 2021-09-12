package cn.itcast.spring.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class Person {
    private Car car;

    @Autowired
    public void setCar11(Car car) {

        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "car=" + car +
                '}';
    }
}
