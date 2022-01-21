package cn.hoodee.middleware.test.controller;

import cn.hoodee.middleware.hystrix.annotation.DoHystrix;
import cn.hoodee.middleware.test.common.ResultResponse;
import cn.hoodee.middleware.test.pojo.UserInfo;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Package: com.hoodee.middleware.demo.controller
 *
 * @Description：
 * @Author: 蒋豪
 * @Date: 2022.01.21 19:57
 * @Modified By:
 */
@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 测试：http://localhost:8081/api/queryUserInfo?userId=aaa
     */
    @DoHystrix(timeoutValue = 350, returnJson = "{\"code\":\"-1\",\"msg\":\"调用方法超过350毫秒，熔断返回！\"}")
    @GetMapping(value = "/api/queryUserInfo")
    public ResultResponse queryUserInfo(@RequestParam String userId) throws InterruptedException {
        logger.info("查询用户信息，userId：{}", userId);
        Thread.sleep(1000);
        return ResultResponse.Success(new UserInfo("用户id:" + userId, 19, "天津市东丽区万科赏溪苑14-0000"));
    }

}
