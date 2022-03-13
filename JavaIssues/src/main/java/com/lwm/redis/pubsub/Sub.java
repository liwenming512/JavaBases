package com.lwm.redis.pubsub;/**
 * Created by Administrator on 2020/7/9.
 */

import redis.clients.jedis.JedisPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/7/9 20:41
 **/
public class Sub {

    public static void main(String[] args) throws InterruptedException {
        JedisPool jedisPool = new JedisPool("localhost");
        ExecutorService exe = Executors.newFixedThreadPool(50);
        Subscriber subscriber = new Subscriber("小王");
        SubThread subThread1 = new SubThread(jedisPool, "老胡", subscriber);
        exe.submit(subThread1);
        SubThread subThread2 = new SubThread(jedisPool, "老邓", subscriber);
        exe.submit(subThread2);
        exe.shutdown();
        exe.awaitTermination(60, TimeUnit.SECONDS);
        Thread.sleep(60000);
        subscriber.unsubscribe("老胡");
    }
}
