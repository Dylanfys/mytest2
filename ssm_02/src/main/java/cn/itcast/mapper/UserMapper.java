package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    User findUserById(@Param("id") Long id);

    @Select("select * from  tb_user")
    List<User> queryUserList();

    void addUser(User user);
}
