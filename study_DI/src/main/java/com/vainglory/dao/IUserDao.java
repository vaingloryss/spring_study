package com.vainglory.dao;


import com.vainglory.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {
    User findById(@Param("id") Integer id);
}
