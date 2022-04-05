package jp.co.seeds.shiro.mapper;

import jp.co.seeds.shiro.entity.User;
import jp.co.seeds.shiro.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    User selectUserByUserCode(String code);

    List<UserRole> getRoleCode(String UserCode);

}
