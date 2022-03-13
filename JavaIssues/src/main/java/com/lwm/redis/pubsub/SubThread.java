package com.lwm.redis.pubsub;/**
 * Created by Administrator on 2020/7/9.
 */

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.security.auth.Subject;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/7/9 20:29
 **/
public class SubThread extends Thread {

    private final JedisPool jedisPool;

    private final Subscriber subscriber;

    private String channelName;

    public SubThread(JedisPool jedisPool, String channelName, Subscriber subscriber){
        super();
        this.jedisPool = jedisPool;
        this.channelName = channelName;
        this.subscriber = subscriber;
    }

    @Override
    public void run() {
        Jedis jedis = null;
        try{
            jedis = jedisPool.getResource();
            jedis.subscribe(subscriber, channelName);
        }catch(Exception e){
            System.out.println(String.format("频道订阅失败：", e));
        }finally {
            if (jedis != null){
                jedis.close();
            }
        }
    }
}
