package com.qin.service;

import com.qin.entity.Permission;


public interface PermissionService {
    public Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);
}
