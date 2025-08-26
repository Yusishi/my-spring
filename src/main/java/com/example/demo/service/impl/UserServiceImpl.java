package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.UserMapper;
import com.example.demo.po.UserPO;
import com.example.demo.service.UserService;
import com.example.demo.vo.UserVO;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserPO> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserVO getUserById(Long id) {
        UserPO userById = userMapper.selectById(id);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userById, userVO);
        return userVO;
    }

    @Override
    public Long insert(UserVO userVO) {
        UserPO userPO = new UserPO();
        BeanUtils.copyProperties(userVO, userPO, "id");
        this.save(userPO);
        return userPO.getId();
    }
}

