package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.entity.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 查询所有账户
     *
     * @return List<Account>
     */
    @Override
    public List<Account> findAll() {
        List<Account> list = accountDao.findAll();
        return list;
    }

    /**
     * 增加账户
     *
     * @param account
     */
    @Override
    public void addAccount(Account account) {
        accountDao.addAccount(account);
        //int i = 1/0;
        accountDao.addAccount(account);
    }

    /**
     * 删除账户
     *
     * @param id
     */
    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }

    /**
     * 修改账户
     *
     * @param account
     */
    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    /**
     * 根据id查询账户信息
     *
     * @param id
     * @return Account
     */
    @Override
    public Account findById(Integer id) {
        Account account = accountDao.findById(id);
        return account;
    }
}
