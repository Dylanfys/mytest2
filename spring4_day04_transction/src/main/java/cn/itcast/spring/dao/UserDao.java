package cn.itcast.spring.dao;

import java.util.Arrays;

public class UserDao {
    private String[] stringArray;
    public void setStringArray1(String[] stringArray) {
        this.stringArray = stringArray;
    }
    public String getName() {
        System.out.println("数组stringArray:" + Arrays.toString(stringArray));
        //模拟调用数据库方法获取name
        return "奥巴马";
    }
}
