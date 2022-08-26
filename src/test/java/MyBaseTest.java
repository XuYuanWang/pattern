import com.xj.pattern.PatternApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * MyBaseTest
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/8/26
 * <p>测试基类
 */
@Slf4j
@SpringBootTest(classes = PatternApplication.class)
public class MyBaseTest {

    @BeforeEach
    //@BeforeAll // 方法必须是静态方法
    public void init() {
        log.info("------------------测试开始------------------");
    }

    @AfterEach
    //@AfterAll // 方法必须是静态方法
    public void after() {
        log.info("------------------测试结束------------------");
    }


    @Test
    public void test() {
        System.out.println("this is a test");
    }

}
