package com.lwm.redis.pubsub;/**
 * Created by Administrator on 2020/7/9.
 */

import redis.clients.jedis.JedisPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.*;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/7/9 20:35
 **/
public class Pub1 {

    public static void main(String[] args) throws InterruptedException {
        JedisPool jedisPool = new JedisPool("localhost");
        ExecutorService exe = Executors.newFixedThreadPool(50);
        Publisher publisher = new Publisher(jedisPool, "老胡");
        exe.submit(publisher);
        exe.shutdown();
        exe.awaitTermination(60, TimeUnit.SECONDS);
    }
}
