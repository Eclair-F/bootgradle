package com.qw.bootgradle;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootgradleApplicationTests {


    @Test
    void contextLoads() {
       Logger logger= LoggerFactory.getLogger(getClass());
        logger.error("zheshidebug");
    }

}
