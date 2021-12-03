package com.rafeyeu.lab3.server.service.description;

import com.rafeyeu.lab3.server.entity.User;
import com.rafeyeu.lab3.server.exeptions.ServiceException;

import java.util.Optional;

public interface UserService {

    Optional<User> login(String login, String password) throws ServiceException;


}
