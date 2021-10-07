package com.blue.blueplanserviceapplicationpc.dao;


import com.blue.blueplanserviceapplicationpc.Model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User selectByPrimaryKey(Long id);

    User selectByName(String userName);

    int insertUser(User user);
}
