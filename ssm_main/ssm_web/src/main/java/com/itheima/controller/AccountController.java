package com.itheima.controller;

import com.itheima.entity.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/find")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/add")
    public String addAccount(Account account){
        accountService.addAccount(account);
        return "forward:/find";
    }

    @RequestMapping("/delete")
    public String deleteAccount(Integer id){
        accountService.deleteAccount(id);
        return "forward:/find";
    }

    @RequestMapping("findById")
    public String findById(Integer id, Model model){
        Account account = accountService.findById(id);
        model.addAttribute("account", account);
        return "update";
    }

    @RequestMapping("/update")
    public String updateAccount(Account account){
        accountService.updateAccount(account);
        return "forward:/find";
    }

}
