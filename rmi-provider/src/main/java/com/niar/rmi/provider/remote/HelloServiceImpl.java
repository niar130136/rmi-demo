package com.niar.rmi.provider.remote;

import com.niar.rmi.api.HelloService;
import com.niar.rmi.dto.query.MessageQueryDTO;
import com.niar.rmi.dto.result.MessageResultDTO;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Authour cheng.wang
 * @Since 2019/7/8
 **/
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {

    private static final long serialVersionUID = 3145077143543793501L;

    public HelloServiceImpl() throws RemoteException {
    }

    @Override
    public MessageResultDTO hi(MessageQueryDTO messageQueryDTO) throws RemoteException {
        return new MessageResultDTO("Hello," + messageQueryDTO.getName());
    }
}
