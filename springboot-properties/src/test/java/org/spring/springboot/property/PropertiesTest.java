package org.spring.springboot.property;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 自定义配置文件测试类
 * <p>
 * Created by bysocket on 17/04/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesTest.class);

    @Autowired
    private UserProperties userProperties;

    @Autowired
    private HomeProperties homeProperties;

    @Autowired
    private PersonProperties personProperties;

    @Test
    public void getHomeProperties() {
        LOGGER.info("\n\n" + homeProperties.toString() + "\n");
    }

    @Test
    public void randomTestUser() {

        LOGGER.info("\n\n" + userProperties.toString() + "\n");
    }

    @Test
    public void getPersonProperties() {
        LOGGER.info("\n\n" + personProperties.toString() + "\n");
    }

}
