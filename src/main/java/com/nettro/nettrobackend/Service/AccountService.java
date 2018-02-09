package com.nettro.nettrobackend.Service;

import com.nettro.nettrobackend.Data.LoginInfo;
import com.nettro.nettrobackend.Data.User;
import com.nettro.nettrobackend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AccountService
{
    @Autowired
    private UserRepository userRepository;

    public String SendSMS(String PhoneNumber)
    {
        Random random = new Random();
        String _rand=String.format("%04d", random.nextInt(10000));
                                                        //send SMS TO PhoneNumber : rand
        return  _rand;
    }
    public LoginInfo Login(String PhoneNumber)
    {
        LoginInfo loginInfo=new LoginInfo();
        loginInfo.set_clientId(GetIDOrAddUser(PhoneNumber));
        if(loginInfo.get_clientId() == "0")
                                        loginInfo.set_status("Error Connecting To Server,Please Try Again Later");
        else if(2>3)
            loginInfo.set_status("Folan Error");
        else
            loginInfo.set_status("Login Successful");
        return loginInfo;
    }

    private String GetIDOrAddUser(String PhoneNumber)
    {
                                                                //check DB for PhoneNumber if Available --> Return id
                                                                // if Not Able to do so for any reason return 0;
        List<User> users=new ArrayList<>();
//        userRepository.findAll().forEach(users::add);


        User user = new User(PhoneNumber);
        userRepository.save(user);
        return (user.getUser_Id()+"");

    }

    public Boolean EditUser(String NewVariables,int id)
    {
        userRepository.findOne(id).setUser_Name("NewUserName");
        userRepository.findOne(id).setUser_Name("NewUserName");
        userRepository.findOne(id).setUser_Name("NewUserName");
        userRepository.findOne(id).setUser_Name("NewUserName");

        return true;
    }
    public User GetUserInfo(int id)
    {
        return userRepository.findOne(id);
    }
}
