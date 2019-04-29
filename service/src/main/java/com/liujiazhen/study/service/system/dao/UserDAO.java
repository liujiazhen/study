package com.liujiazhen.study.service.system.dao;

import com.liujiazhen.study.api.system.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description:
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/4/29 9:51
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/4/29      LJZ     v1.0.0      create
 */

@Repository
public interface UserDAO {

    List<User> getUserByParamList(User user);

    public User getUserById(String id);
}
