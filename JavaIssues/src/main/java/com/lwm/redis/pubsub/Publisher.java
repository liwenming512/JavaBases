package com.lwm.redis.pubsub;/**
 * Created by Administrator on 2020/7/9.
 */

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/7/9 20:14
 **/
public class Publisher extends Thread {

    private final JedisPool jedisPool;

    private String chanelName;

    public Publisher(JedisPool jedisPool, String chanelName){
        super();
        this.jedisPool = jedisPool;
        this.chanelName = chanelName;
    }

    @Override
    public void run(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Jedis jedis = jedisPool.getResource();
        while (true){
            String line = null;
            try{
                line = reader.readLine();
                if (!"quit".equals(line)){
                    jedis.publish(chanelName, line);
                    System.out.println("发布者频道发布：" + chanelName);
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
