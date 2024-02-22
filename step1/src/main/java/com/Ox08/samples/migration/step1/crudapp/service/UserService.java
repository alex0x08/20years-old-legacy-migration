package com.Ox08.samples.migration.step1.crudapp.service;
import com.Ox08.samples.migration.step1.crudapp.model.User;
import com.Ox08.samples.migration.step1.crudapp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * This very simple service level, still exist just as demonstration.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> list() {
        return userRepository.findAll();
    }
    public void add(User user) {
        userRepository.saveAndFlush(user);
    }
    public User load(Long id) {
        return userRepository.findById(id).orElseThrow();
    }
    public void update(User user) {
        userRepository.saveAndFlush(user);
    }
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
