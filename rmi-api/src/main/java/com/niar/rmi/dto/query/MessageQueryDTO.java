package com.niar.rmi.dto.query;

import java.io.Serializable;

/**
 * @Authour cheng.wang
 * @Since 2019/7/8
 **/
public class MessageQueryDTO implements Serializable{
    private static final long serialVersionUID = 3243759004072052634L;
    private String name;

    public MessageQueryDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
