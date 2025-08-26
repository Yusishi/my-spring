package com.example.demo.service;

import com.example.demo.vo.UserVO;

public interface UserService {
    UserVO getUserById(Long id);

    Long insert(UserVO userVO);
}
