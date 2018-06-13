package top.qiaokeke.freess;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.qiaokeke.freess.domain.SSObject;
import top.qiaokeke.freess.service.http.FreessService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestFreessService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    FreessService freessService;

    @Test
    public void testGetSSObjectsFromFreesscf(){
        List<SSObject> ssObjects = freessService.getSSObjectsFromFreesscf();
        //System.out.println(ssObjects);
        for (SSObject ssObject:ssObjects){
            logger.info(ssObject.toString());
        }


    }

}
