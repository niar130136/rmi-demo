package com.niar.rmi.consumer;

import com.niar.rmi.api.HelloService;
import com.niar.rmi.dto.query.MessageQueryDTO;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Authour cheng.wang
 * @Since 2019/7/8
 **/
public class RmiConsumerApplication {
    public static void main(String[] args) {
        try {
            Registry registry= LocateRegistry.getRegistry(8009);
            HelloService helloService = (HelloService) registry.lookup("HelloService");
            MessageQueryDTO messageQueryDTO = new MessageQueryDTO("Jack");
            System.out.println(helloService.hi(messageQueryDTO).getGreeting());
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
