package com.wsh.asset;

import com.wsh.asset.Util.CreateNumber;
import com.wsh.base.controller.UserController;
import com.wsh.base.param.UserParams;
import com.wsh.base.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.ProtectionDomain;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class AssetApplicationTests<sout> {
//    private CreateNumber createNumber;
//
//    @Test
//    public void contextLoads() {
//    }
//
//    @Test
//    public void testNumber() {
//
//        String number = CreateNumber.createNum(1);
//        System.out.println(number);
//    }
//}

/**
 *第一种定时器
 */
//public class AssetApplicationTests {
//        public static void main(String[] args) {
//            final long time = 999;
//            Runnable runnable = new Runnable() {
//
//                @Override
//                public void run() {
//                    while(true) {
//                        System.out.println("this is my time");
//                        try {
//                            Thread.sleep(time);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            };
//            Thread thread = new Thread(runnable);
//            thread.start();
//        }
//    }
/**
 * 第二种定时器
 */
//    public static void main(String[] args){
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("This is my time");
//            }
//        };
//        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//        service.scheduleAtFixedRate(runnable,0,2, TimeUnit.SECONDS);
//    }

//}
