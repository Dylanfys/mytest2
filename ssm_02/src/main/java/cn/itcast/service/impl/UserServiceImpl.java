package cn.itcast.service.impl;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUserList() {
        List<User> users = userMapper.queryUserList();
        return users;
    }

    @Override
    public void addUsers(User user1, User user2) {
        userMapper.addUser(user1);
        int i = 1 / 0;
        userMapper.addUser(user2);
    }
}
