package com.nettro.nettrobackend.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User
{
    @Id
    int user_Id;
    String user_PhoneNumber;
    String user_Email;
    String user_Name;
    String user_LastName;
    boolean User_Gender;
    String user_Discription;
    int User_DriverDetail_ForeignKey;
    int User_PassengerDetail_ForeignKey;

    public User(String PhoneNumber)
    {
        this.user_PhoneNumber = PhoneNumber;

                        //this.id =    GENERATE AND UNIQUE ID
    }

    public int getUser_Id()
    {
        return user_Id;
    }

    public void setUser_Id(int user_Id)
    {
        this.user_Id = user_Id;
    }

    public String getUser_PhoneNumber()
    {
        return user_PhoneNumber;
    }

    public void setUser_PhoneNumber(String user_PhoneNumber)
    {
        this.user_PhoneNumber = user_PhoneNumber;
    }

    public String getUser_Email()
    {
        return user_Email;
    }

    public void setUser_Email(String user_Email)
    {
        this.user_Email = user_Email;
    }

    public String getUser_Name()
    {
        return user_Name;
    }

    public void setUser_Name(String user_Name)
    {
        this.user_Name = user_Name;
    }

    public String getUser_LastName()
    {
        return user_LastName;
    }

    public void setUser_LastName(String user_LastName)
    {
        this.user_LastName = user_LastName;
    }

    public boolean isUser_Gender()
    {
        return User_Gender;
    }

    public void setUser_Gender(boolean user_Gender)
    {
        User_Gender = user_Gender;
    }

    public String getUser_Discription()
    {
        return user_Discription;
    }

    public void setUser_Discription(String user_Discription)
    {
        this.user_Discription = user_Discription;
    }

    public int getUser_DriverDetail_ForeignKey()
    {
        return User_DriverDetail_ForeignKey;
    }

    public void setUser_DriverDetail_ForeignKey(int user_DriverDetail_ForeignKey)
    {
        User_DriverDetail_ForeignKey = user_DriverDetail_ForeignKey;
    }

    public int getUser_PassengerDetail_ForeignKey()
    {
        return User_PassengerDetail_ForeignKey;
    }

    public void setUser_PassengerDetail_ForeignKey(int user_PassengerDetail_ForeignKey)
    {
        User_PassengerDetail_ForeignKey = user_PassengerDetail_ForeignKey;
    }
}
