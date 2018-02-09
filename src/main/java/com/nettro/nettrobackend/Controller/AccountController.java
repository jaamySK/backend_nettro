package com.nettro.nettrobackend.Controller;

import com.nettro.nettrobackend.Data.LoginInfo;
import com.nettro.nettrobackend.Data.User;
import com.nettro.nettrobackend.Service.AccountService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class AccountController
{
    Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/SendSMS/{PhoneNumber}",method = RequestMethod.POST )
    public String SendSMS(@PathVariable String PhoneNumber)
    {
          return accountService.SendSMS(PhoneNumber);
    }

    @RequestMapping(value = "/Login/{PhoneNumber}",method = RequestMethod.POST )
    public LoginInfo Login(@PathVariable("PhoneNumber") String PhoneNumber)
    {
        return  accountService.Login(PhoneNumber);
    }

    @RequestMapping(value="/Account/EditUser/",method = RequestMethod.POST)
    public boolean EditUser()
    {
        return accountService.EditUser("NewVariables",13715523);
    }

    @RequestMapping(value = "/Account/GetUserInfo/{id}",method = RequestMethod.POST)
    public User GetUserInfo(@PathVariable("id") int id)
    {
        return accountService.GetUserInfo(id);
    }










}
