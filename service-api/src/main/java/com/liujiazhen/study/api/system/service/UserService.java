package com.liujiazhen.study.api.system.service;

import com.liujiazhen.study.api.system.model.User;

import java.util.List;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description:
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/4/29 9:46
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/4/29      LJZ     v1.0.0      create
 */
public interface UserService {
    User getUserById(String id);

    List<User> getUserByParamList(User user);
}
