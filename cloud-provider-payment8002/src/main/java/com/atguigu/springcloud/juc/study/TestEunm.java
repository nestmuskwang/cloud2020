package com.atguigu.springcloud.juc.study;

import com.sun.deploy.config.Config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ：wangsg
 * @date ： 2020/3/24 9:57
 */
class  Mythread implements  Runnable{
    @Override
    public void run() {
        System.out.println("aaa");
    }
}
public class TestEunm {
    public static void main(String[] args) {
        List list = Arrays.asList("q");
        ExecutorService threadPool= Executors.newFixedThreadPool(5);

            try {

            } catch (Exception e) {
                e.printStackTrace();
            } finally {

            }
       /* Mythread mythread=new Mythread();
        new Thread(()->{
            try {
                mythread.run();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            }
        },"aa").start();*/

    }
    private  volatile int a;
    public  synchronized void geta(){
        Map map =new ConcurrentHashMap();
        List list =new CopyOnWriteArrayList();
    }

}

