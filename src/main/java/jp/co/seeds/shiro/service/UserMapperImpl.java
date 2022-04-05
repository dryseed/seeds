package jp.co.seeds.shiro.service;

import jp.co.seeds.shiro.entity.User;
import jp.co.seeds.shiro.entity.UserRole;
import jp.co.seeds.shiro.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMapperImpl implements UserMapper {

    @Autowired
    UserMapper userMapper;


    @Override
    public User selectUserByUserCode(String code) {
        return userMapper.selectUserByUserCode(code);
    }

    @Override
    public List<UserRole> getRoleCode(String userCode) {
        return userMapper.getRoleCode(userCode);
    }


}
