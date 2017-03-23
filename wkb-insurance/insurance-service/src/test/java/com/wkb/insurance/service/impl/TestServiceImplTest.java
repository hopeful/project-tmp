package com.wkb.insurance.service.impl; 

import com.wkb.insurance.ContextBase;
import com.wkb.insurance.common.RedisService;
import com.wkb.insurance.module.User;
import com.wkb.insurance.service.TestService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;

/** 
* TestServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>三月 17, 2017</pre> 
* @version 1.0 
*/ 
public class TestServiceImplTest extends ContextBase {

    @Autowired
    private RedisService<String,String> redisService;

    @Autowired
    private TestService testService;

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /** 
    * 
    * Method: getStr() 
    * 
    */ 
    @Test
    public void testGetStr() throws Exception {

        System.out.println("==================");
//        redisService.set("ss","ddd");
        redisService.del("ss");
        System.out.println("##########");

    }

    @Test
    public void testAdd(){
        User user = new User();
        user.setAccount("albert");
        user.setName("yy");
        Integer id = testService.addUser(user);

        System.out.println(id);

    }



}
