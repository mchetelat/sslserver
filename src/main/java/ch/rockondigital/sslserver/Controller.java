package ch.rockondigital.sslserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @RequestMapping(value = "hello")
    public void hello() {
        System.out.println("Hello Word");
    }

}