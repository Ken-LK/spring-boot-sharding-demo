package com.ken.sharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ken.sharding.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * user map层
 *
 * @author ken
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {}
