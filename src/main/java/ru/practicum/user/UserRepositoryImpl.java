//package ru.practicum.user;
//
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class UserRepositoryImpl implements UserRepository {
//    private final List<User> users = new ArrayList<>();
//
//    @Override
//    public List<User> findAll() {
//        return users;
//    }
//
//    @Override
//    public User save(User user) {
//        users.add(user);
//        return user;
//    }
//}
