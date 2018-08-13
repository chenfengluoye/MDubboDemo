package com.ckj.projects.api.impl;

import com.ckj.projects.api.Message;
import com.ckj.projects.api.ProviderService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.stereotype.Service;

/**
 * created by ChenKaiJu on 2018/8/5  17:12
 */
@Service("providerServiceImpl")
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String doService(String msg) {
        System.out.println("doService:"+msg);
        return msg+"="+msg;
    }

    @Override
    public String getMsg() {
        return "helloy boy";
    }

    @Override
    public String[] getMsgs() {
        String[] strings={"i","you","she"};
        return strings;
    }

    @Override
    public Message[] getMsgList() {

        Message[] messages=new Message[2];
        messages[0]=new Message();
        messages[1]=new Message();
        return messages;
    }

    @Override
    public void sendListMsg(Message[] msgs) {
            for(int i=0;i<msgs.length;i++){
                System.out.println(msgs[i].toString());
            }
    }
}
