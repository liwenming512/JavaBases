package com.lwm.redis.pubsub;/**
 * Created by Administrator on 2020/7/9.
 */

import redis.clients.jedis.JedisPubSub;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/7/9 20:19
 **/
public class Subscriber extends JedisPubSub {

    private String subName;

    public Subscriber(String subName){
        this.subName = subName;
    }

    @Override
    public void onMessage(String channel, String message) {
        super.onMessage(channel, message);
        System.out.println(String.format("订阅者：%s接收消息，频道：%s，内容：%s", subName, channel, message));
    }

    @Override
    public void onSubscribe(String channel, int subscribedChannels) {
        System.out.println(String.format("订阅者：%s订阅频道成功，频道：%s，订阅频道书：%d", subName, channel, subscribedChannels));
    }

    @Override
    public void onUnsubscribe(String channel, int subscribedChannels) {
        System.out.println(String.format("订阅者：%s取消订阅频道成功，频道：%s，订阅频道书：%d", subName, channel, subscribedChannels));
    }
}
