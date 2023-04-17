package cn.ybzy.sbrdemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SprdemoApplicationTests {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        ValueOperations ops=stringRedisTemplate.opsForValue();
               ops.set("kkkk","vvvvv");
               String rs=(String) ops.get("kkkk");
               String rs1=stringRedisTemplate.opsForValue().get("kkkk");
               System.out.println(rs);
               System.out.println("第二次打印:"+rs);

    }

}
