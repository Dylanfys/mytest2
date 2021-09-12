package cn.itcast.spring.d_xmllifecycle;

public class LifeCycleBean {
    public LifeCycleBean() {
        System.out.println("LifeCycleBean 空参构造器调用了");

    }
    public void  init() {
        System.out.println("初始化方法执行了");

    }
    public void destroy() {
        System.out.println("销毁方法调用了");

    }
}
