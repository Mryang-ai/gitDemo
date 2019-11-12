package com.itheima.service;

import com.itheima.entity.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查询所有账户
     * @return List<Account>
     */
    List<Account> findAll();

    /**
     * 增加账户
     * @param account
     */
    void addAccount(Account account);

    /**
     * 删除账户
     * @param id
     */
    void deleteAccount(Integer id);

    /**
     * 修改账户
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 根据id查询账户信息
     * @param id
     * @return Account
     */
    Account findById(Integer id);
}
