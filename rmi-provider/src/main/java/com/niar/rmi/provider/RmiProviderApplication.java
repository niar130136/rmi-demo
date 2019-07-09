package com.niar.rmi.provider;

import com.niar.rmi.provider.remote.HelloServiceImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Authour cheng.wang
 * @Since 2019/7/8
 **/
public class RmiProviderApplication {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(8009);
            HelloServiceImpl helloService = new HelloServiceImpl();
            registry.rebind("HelloService", helloService);
            System.out.println("成功启动RMI提供者服务");
            while (true) {

            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
