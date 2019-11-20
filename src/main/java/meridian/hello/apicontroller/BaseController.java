package meridian.hello.apicontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sabi on 11/20/2019.
 */

@RestController
public class BaseController {

    @GetMapping("/")
    public String SayHello() {
        return "Hello Meridian!";
    }
}
