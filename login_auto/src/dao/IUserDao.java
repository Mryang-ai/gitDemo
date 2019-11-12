package dao;

import entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface IUserDao {
    //查找用户
    @Select("SELECT * FROM `user` WHERE username=#{username} and password=#{password}")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
