package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class LogTestController {
    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";
        log.trace("trace log");
        log.debug("debug log");
        log.info("info log={}", name);
        log.warn("warn log");
        log.error("error log");
        return "ok";
    }
}
