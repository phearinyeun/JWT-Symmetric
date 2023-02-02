package Spring.Security.jwtsymmetrickey.repository;

import Spring.Security.jwtsymmetrickey.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
