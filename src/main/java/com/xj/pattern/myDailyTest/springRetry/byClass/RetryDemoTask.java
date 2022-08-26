package com.xj.pattern.myDailyTest.springRetry.byClass;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.remoting.RemoteAccessException;

/**
 * SpringRetryDemo
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/8/26
 * <p>what's do?
 */
@Slf4j
public class RetryDemoTask {

    /**
     * 重试方法
     *
     * @param param
     * @return
     */
    public static boolean retryTask(String param) {
        log.info("收到请求参数：{}", param);

        int i = RandomUtils.nextInt(0, 11);
        log.info("生成的随机数：{}", i);

        if (i == 0) {
            log.info("为0,抛出参数异常");
            throw new IllegalArgumentException("参数异常");
        } else if (i == 1) {
            log.info("为1,返回true");
            return true;
        } else if (i == 2) {
            log.info("为2,返回false");
            return false;
        } else {
            log.info("大于2,抛出自定义异常.");
            throw new RemoteAccessException("大于2,抛出远程访问异常.");
        }
    }
}
