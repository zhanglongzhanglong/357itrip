package itrip.common;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

@Component
public class RedisUtil {
    public void setRedis(String key,String value)
    {
        Jedis jedis=new Jedis("127.0.0.1");
        jedis.auth("123456");
        jedis.setex(key,7200,value);
    }
    public String getstr(String key)
    {
        Jedis jedis=new Jedis("127.0.0.1");
        jedis.auth("123456");
        return jedis.get(key);
    }
}
