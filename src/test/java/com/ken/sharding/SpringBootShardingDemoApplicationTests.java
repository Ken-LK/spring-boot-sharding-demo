package com.ken.sharding;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.javafaker.Faker;
import com.ken.sharding.entity.User;
import com.ken.sharding.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootShardingDemoApplicationTests {

    @Autowired private UserService userService;

    @Test
    void buildUser() {
        User user;
        for (int i = 0; i < 10; i++) {
            Faker faker = new Faker();

            user = new User(i, faker.name().name(), faker.number().numberBetween(0, 10));
            userService.save(user);
        }
    }

    @Test
    void deleteUser() {
        LambdaQueryWrapper<User> lambdaQueryWrapper = Wrappers.lambdaQuery();

        userService.remove(lambdaQueryWrapper);
    }
}
