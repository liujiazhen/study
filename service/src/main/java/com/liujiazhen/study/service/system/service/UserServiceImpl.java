package com.liujiazhen.study.service.system.service;

import com.liujiazhen.study.api.system.model.User;
import com.liujiazhen.study.api.system.service.UserService;
import com.liujiazhen.study.service.system.dao.UserDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description:
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/4/29 9:44
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/4/29      LJZ     v1.0.0      create
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public User getUserById(String id) {
        return userDAO.getUserById(id);
    }

    @Override
    public List<User> getUserByParamList(User user) {
        return userDAO.getUserByParamList(user);
    }

}
