package Spring.Security.jwtsymmetrickey.service;

import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    private final JwtEncoder encoder;

    public TokenService(JwtEncoder encoder) {
        this.encoder = encoder;
    }

    `

}
