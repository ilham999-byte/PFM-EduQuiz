package com.project.eduquiz.services;

import com.project.eduquiz.models.LoginRequest;
import com.project.eduquiz.models.LoginResponse;
import com.project.eduquiz.models.User;

public interface AuthService {
    User registerUserService(User user) throws Exception;

    LoginResponse loginUserService(LoginRequest loginRequest) throws Exception;
}
