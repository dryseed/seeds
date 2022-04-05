package jp.co.seeds.shiro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {
    private Integer userRoleID;
    private String userCode;
    private String roleCode;
    private String roleName;
}
