package com.ckj.projects.api;

import java.io.Serializable;

/**
 * created by ChenKaiJu on 2018/8/2  20:10
 */
public class Message implements Serializable {

    String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                '}';
    }
}
