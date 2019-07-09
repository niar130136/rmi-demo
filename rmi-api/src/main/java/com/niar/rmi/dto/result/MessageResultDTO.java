package com.niar.rmi.dto.result;

import java.io.Serializable;

/**
 * @Authour cheng.wang
 * @Since 2019/7/8
 **/
public class MessageResultDTO implements Serializable{
    private static final long serialVersionUID = -2064847666737219559L;
    private String greeting;

    public MessageResultDTO(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
