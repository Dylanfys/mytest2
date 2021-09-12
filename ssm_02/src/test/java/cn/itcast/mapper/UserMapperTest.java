package cn.itcast.mapper;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class UserMapperTest {
    @Autowired
    private UserMapper um;
    @Autowired
    private UserService userService;
    @Test
    public void findUserById() throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis/mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(1l);
        System.out.println("user = " + user);
    }
    @Test
    public void findUserById1() throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        SqlSessionFactory sqlSessionFactor = (SqlSessionFactory) ac.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactor.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User userById = userMapper.findUserById(2l);
        System.out.println("userById = " + userById);

    }
    @Test
    public void findUserById2() throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserMapper userMapper = (UserMapper) ac.getBean(UserMapper.class);
        System.out.println(userMapper.findUserById(3l));

    }
    @Test
    public void findUserById3() throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserMapper userMapper = ac.getBean(UserMapper.class);
        User user = userMapper.findUserById((long) 4);
        System.out.println("user = " + user);
        User um1 = um.findUserById(4l);
        System.out.println("um1 = " + um1);
        System.out.println("--------------------");
        System.out.println(um);
        System.out.println(userMapper);
    }
    @Test
    public void addUser() {
        User user1 = new User();
        user1.setName("用户11");
        user1.setPassword("123456");
        user1.setUserName("admin11");
        user1.setAge(18);
        user1.setSex(1);
        user1.setBirthday(new Date());
        User user2 = new User();
        user2.setName("用户12");
        user2.setPassword("123456");
        user2.setUserName("admin12");
        user2.setAge(18);
        user2.setSex(1);
        user2.setBirthday(new Date());
        userService.addUsers(user1, user2);
    }
}