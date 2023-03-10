package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    @SuppressWarnings("unchecked")
    List<User> listUsers();
    User show(int id);
    User showName(String name);

    User showEmail(String email);

    void update(int id, User user);

    void delete(int id);

    void save(User user);
}
