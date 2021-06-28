package com.ken.sharding.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ken.sharding.entity.User;
import com.ken.sharding.mapper.UserMapper;
import com.ken.sharding.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/** @Classname UserServiceImpl @Description 用户服务实现类 @Author Ken @Version 1.0 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }

    @Override
    public List<User> getUserList() {
        return baseMapper.selectList(Wrappers.lambdaQuery());
    }
}
