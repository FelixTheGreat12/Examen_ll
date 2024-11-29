package com.upiiz.users.services;

import com.upiiz.users.entities.UserEntities;
import com.upiiz.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // GET de todos
    public List<UserEntities> getAllUsers() {
        return userRepository.findAll();
    }

    // GET de uno
    public UserEntities getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // POST
    public UserEntities createUser(UserEntities user) {
        return userRepository.save(user);
    }

    // PUT
    public UserEntities updateUser(UserEntities user) {
        if(userRepository.existsById(user.getUser_id())){
            return userRepository.save(user);
        }
        return null;
    }

    // DELETE
    public void deleteUserById(Long id) {
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
        }
    }
}
