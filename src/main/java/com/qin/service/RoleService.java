package com.qin.service;

import com.qin.entity.Role;

public interface RoleService {
    public Role createRole(Role role);

    public void deleteRole(Long roleId);

    /**
     * 增加 角色-权限 关系
     */
    public void correlationPermissions(Long roleId, Long... permissionIds);

    /**
     * 移除 角色-权限 关系
     */
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);
}
