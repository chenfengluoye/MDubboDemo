package com.ckj.projects;

import static org.junit.Assert.assertTrue;

import com.ckj.projects.api.Message;
import com.ckj.projects.api.ProviderService;
import com.ckj.projects.api.TaskExcutorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/testspringCore.xml" })
public class AppTest {

    @Autowired
    ProviderService providerService;

    @Resource
    TaskExcutorService taskExcutorService;

    @Test
    public void testProviderService(){
        System.out.println(providerService.getClass().getName());
        String res=providerService.doService("hello boy!");
        System.out.println(res);
        System.out.println("providerService.getMsg():"+providerService.getMsg());
        Message[] msglist=providerService.getMsgList();
        System.out.println("providerService.getMsgList():"+ Arrays.toString(msglist));
        providerService.sendListMsg(msglist);
        System.out.println("完成。。。");
        System.out.println(taskExcutorService.doTask(new Message(),new Message()));
    }
}
