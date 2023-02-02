package Spring.Security.jwtsymmetrickey.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter
@Getter
public class User {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String matchingPassword;
}
