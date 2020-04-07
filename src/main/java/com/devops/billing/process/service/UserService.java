package com.devops.billing.process.service;

import com.devops.billing.process.model.Login;
import com.devops.billing.process.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
