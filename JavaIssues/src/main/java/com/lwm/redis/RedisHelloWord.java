package com.lwm.redis;/**
 * Created by Administrator on 2020/7/9.
 */

import redis.clients.jedis.Jedis;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @Author liwenming
 * @Description 第一个redis程序
 * https://www.jianshu.com/p/9c659cafaa0f
 * @Date 2020/7/9 19:48
 **/
public class RedisHelloWord {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        if("PONG".equals(jedis.ping())){
            jedis.set("username", "laohu");
            jedis.lpush("userlist", "laohu");
            jedis.lpush("userlist", "laodeng");
            jedis.lpush("userlist", "laozi");
            List<String> list = jedis.lrange("userlist", 0, 2);
            for(Iterator iterator = list.iterator(); iterator.hasNext();){
                System.out.println(iterator.next());
            }
            System.out.println();
            Set<String> keys = jedis.keys("*");
            Iterator<String> it = keys.iterator();
            while(it.hasNext()){
                String key = it.next();
                System.out.println(key);
            }
        }else{
            System.out.println("连接失败");
        }
    }
}
