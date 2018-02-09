package com.nettro.nettrobackend.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DriverDetail
{
    @Id
    int id;
    int user_ID;
    //Status shows if driver's licence is validated or not
    boolean status;

                                                    //Vehicle vehicle;
                                                    // iMMMMMageeeeeeeeeeeee


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getUser_ID()
    {
        return user_ID;
    }

    public void setUser_ID(int user_ID)
    {
        this.user_ID = user_ID;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }
}
