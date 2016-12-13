package io.codeblog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample controller
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
