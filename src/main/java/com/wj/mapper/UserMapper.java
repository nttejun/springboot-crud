package com.wj.mapper;


import com.wj.domain.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("userMapper")
public class UserMapper {

    @Autowired
    SqlSessionTemplate sqlSession;

    public User getUser(String userAlias) {
        return sqlSession.selectOne("user.selectGetUser", userAlias);
    }

    public List<User> listUser() {
        return sqlSession.selectList("user.selectListUser");
    }

    public void insertUserInfo(User user) {
        sqlSession.insert("user.insertUserInfo", user);
    }

    public int deleteUser(String userAlias) {
        return sqlSession.delete("user.deleteUser", userAlias);
    }

    public int updateUser(User user) {
        return sqlSession.update("user.updateUser", user);
    }

    public User loginUserMemberCheck(Map map) {
        return sqlSession.selectOne("user.selectUserMember", map);
    }
}
