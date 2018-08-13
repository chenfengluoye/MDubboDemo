package com.ckj.projects.api;

/**
 * created by ChenKaiJu on 2018/8/5  17:12
 */
public interface ProviderService {

    public String doService(String msg);

    public String getMsg();

    public String[] getMsgs();

    public Message[] getMsgList();

    public void sendListMsg(Message[] msgs);
}
