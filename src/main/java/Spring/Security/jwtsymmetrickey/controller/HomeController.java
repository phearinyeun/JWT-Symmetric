package Spring.Security.jwtsymmetrickey.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${welcome}")
    private String greeting;

    @GetMapping("/")
    public String home (Authentication authentication) {
            return greeting + "  " + authentication.getName();
    }
}
