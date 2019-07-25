package com.niar.rmi.api;

import com.niar.rmi.dto.query.MessageQueryDTO;
import com.niar.rmi.dto.result.MessageResultDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Authour cheng.wang
 * @Since 2019/7/8
 **/
public interface HelloService extends Remote {
    MessageResultDTO hi(MessageQueryDTO messageQueryDTO) throws RemoteException;
}
