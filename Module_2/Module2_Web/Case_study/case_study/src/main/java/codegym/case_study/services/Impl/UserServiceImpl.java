package codegym.case_study.services.Impl;

import codegym.case_study.entities.Role;
import codegym.case_study.entities.User;
import codegym.case_study.repositories.RoleRepository;
import codegym.case_study.repositories.UserRepository;
import codegym.case_study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public void saveUser(User user) {
        BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
        String rawPassword= user.getPassword();
        String encodedPassword= encoder.encode(rawPassword);
        user.setPassword(encodedPassword);
        Set<Role> roles= roleRepository.getRoleByName("ROLE_MEMBER");
        user.setRoles(roles);
        userRepository.save(user);
    }
}
