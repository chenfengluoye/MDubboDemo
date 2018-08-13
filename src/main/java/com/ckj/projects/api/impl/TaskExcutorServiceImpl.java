package com.ckj.projects.api.impl;

import com.ckj.projects.api.Message;
import com.ckj.projects.api.TaskExcutorService;
import org.springframework.stereotype.Service;

/**
 * created by ChenKaiJu on 2018/8/12  20:20
 */
@Service
public class TaskExcutorServiceImpl implements TaskExcutorService {
    @Override
    public String doTask(Message message1, Message message2) {
        return "i am TaskExcutorServiceImpl";
    }
}
