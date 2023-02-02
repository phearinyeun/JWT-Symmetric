package Spring.Security.jwtsymmetrickey.service;

import Spring.Security.jwtsymmetrickey.model.User;
import Spring.Security.jwtsymmetrickey.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUser(User user){
        return userRepository.findAll();
    }
}
