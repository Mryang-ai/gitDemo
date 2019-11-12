package com.itheima.dao;

import com.itheima.entity.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {
    //查询所有账户
    @Select("select * from account")
    List<Account> findAll();
    //增加账户
    @Insert("insert into account values(null,#{name},#{money})")
    void addAccount(Account account);
    //删除账户
    @Delete("delete from account where id=#{id}")
    void deleteAccount(Integer id);
    //修改账户
    @Update("update account set name=#{name}, money=#{money} where id=#{id}")
    void updateAccount(Account account);
    //根据id查询账户信息
    @Select("select * from account where id=#{id}")
    Account findById(Integer id);
}
