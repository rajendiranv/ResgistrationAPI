package com.devops.billing.process.dataaccess;

import com.devops.billing.process.model.Login;
import com.devops.billing.process.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}
