import com.xj.pattern.myDailyTest.springRetry.byAnnotion.SpringRetryDemo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * SpringRetryDemoTest
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/8/26
 * <p>what's do?
 */
@Component
@Slf4j
public class SpringRetryDemoTest extends MyBaseTest {

    @Autowired
    private SpringRetryDemo springRetryDemo;

    @Test
    public void retry() {
        boolean b = springRetryDemo.call("abc");
        log.info("--结果是:{}--", b);
    }
}
