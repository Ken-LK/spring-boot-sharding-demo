package com.ken.sharding.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ken.sharding.entity.User;

import java.util.List;

/** @Classname UserService @Description 用户服务类 @Author Ken */
public interface UserService extends IService<User> {

    /**
     * 保存用户信息
     *
     * @param entity
     * @return
     */
    @Override
    boolean save(User entity);

    /**
     * 查询全部用户信息
     *
     * @return
     */
    List<User> getUserList();
}
