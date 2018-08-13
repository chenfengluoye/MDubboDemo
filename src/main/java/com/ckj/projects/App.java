package com.ckj.projects;

import com.ckj.projects.api.Message;
import com.ckj.projects.api.ProviderService;
import com.ckj.projects.api.TaskExcutorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Hello world!
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/springCore.xml" })
public class App {

    @Autowired
    TaskExcutorService taskExcutorService;

    @Autowired
    ProviderService providerService;

    @Test
    public void runtest(){
        System.out.println("测试开始");
        System.out.println(taskExcutorService.getClass().getName());
        String message=taskExcutorService.doTask(new Message(),new Message());
        System.out.println(message);
        String res=providerService.doService("hello");
        System.out.println(res);
    }
}
