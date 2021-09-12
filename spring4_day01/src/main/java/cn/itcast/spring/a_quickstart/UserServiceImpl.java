package cn.itcast.spring.a_quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements IUserService{
    private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl(IUserDao userDao) {
        this.userDao = userDao;
    }

    public void login() {
		System.out.println("UserServiceImpl-service层被调用了。。。");
		//实例化dao层
		//传统方式
//		IUserDao userDao = new UserDaoImpl();
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao1 = (IUserDao) ac.getBean("userDao");
        userDao.findByUsernameAndPassword();
	}
}