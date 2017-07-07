package com.kid.springboot.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

import com.kid.springboot.entity.User;

public interface UserDao {
    int insert(@Param("pojo") User pojo);

    int insertSelective(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List<User> pojo);

    int update(@Param("pojo") User pojo);

    User getUserInfo(Map<String,String>map);
}
