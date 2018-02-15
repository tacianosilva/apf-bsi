package br.ufrn.dct.apf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.ufrn.dct.apf.model.Role;
import br.ufrn.dct.apf.model.User;
import br.ufrn.dct.apf.repository.RoleRepository;
import br.ufrn.dct.apf.repository.UserRepository;

@Service
public class UserService {

    /**
     * Regra para definir permissões padrão de usuários do sistema.
     */
    private final String USER_ROLE = "USER";
    
    private final int ACTIVE = 1;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    /**
     * @param user A new user with default role (USER_ROLE).
     * @see br.ufrn.dct.apf.service.UserService#saveUser(br.ufrn.dct.apf.model.User)
     */
    public void saveUser(User user) {
        //TODO Implementar a criação das Roles básicas (ADMIN e USER) na configuração do spring
        Role userRole = roleRepository.findByRole(USER_ROLE);

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(ACTIVE);
        
        user.setNewRole(userRole);
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findOne(Long id) {
        return userRepository.findOne(id);
    }
}
