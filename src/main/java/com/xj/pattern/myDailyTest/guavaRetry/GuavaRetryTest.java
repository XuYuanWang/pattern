package com.xj.pattern.myDailyTest.guavaRetry;

import com.github.rholder.retry.*;
import org.junit.jupiter.api.Test;
import org.springframework.remoting.RemoteAccessException;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * GuavaRetryTest
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/8/26
 * <p>what's do?
 */
@SuppressWarnings("all")
public class GuavaRetryTest {

    @Test
    public void test() {
        // RetryerBuilder 构建重试实例retryer,可以设置重试源且可以支持多个重试源,可以配置重试次数或重试时间,以及可以配置等待时间间隔
        Retryer<Boolean> retryer = RetryerBuilder.<Boolean>newBuilder()
                .retryIfExceptionOfType(RemoteAccessException.class) // 设置异常重试源
                .retryIfResult(res -> !res) // 设置根据结果重试
                .withWaitStrategy(WaitStrategies.fixedWait(3, TimeUnit.SECONDS)) // 设置等待间隔时间
                .withStopStrategy(StopStrategies.stopAfterAttempt(3)) // 设置最大重试次数
                .build();

        try {
            retryer.call(() -> RetryDemoTask.retryTask("abc"));
        } catch (ExecutionException | RetryException e) {
            throw new RuntimeException(e);
        }
    }
}
