package com.nettro.nettrobackend.Data;


import java.io.Serializable;

public class LoginInfo implements Serializable
{
    private String _status;
    private String _clientId;
    private String _smsStatus;

    public String get_status()
    {
        return _status;
    }

    public void set_status(String _status)

    {
        this._status = _status;
    }

    public String get_clientId()

    {
        return _clientId;
    }

    public void set_clientId(String _clientId)

    {
        this._clientId = _clientId;
    }

    public String get_smsStatus()

    {
        return _smsStatus;
    }

    public void set_smsStatus(String _smsStatus)

    {
        this._smsStatus = _smsStatus;
    }


}
