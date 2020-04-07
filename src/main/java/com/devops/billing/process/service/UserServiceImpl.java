package com.devops.billing.process.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.devops.billing.process.dataaccess.UserDao;
import com.devops.billing.process.model.Login;
import com.devops.billing.process.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
