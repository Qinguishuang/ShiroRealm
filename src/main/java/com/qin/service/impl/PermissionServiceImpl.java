package com.qin.service.impl;

import com.qin.dao.PermissionDao;
import com.qin.dao.impl.PermissionDaoImpl;
import com.qin.entity.Permission;
import com.qin.service.PermissionService;

public class PermissionServiceImpl implements PermissionService {

    private PermissionDao permissionDao = new PermissionDaoImpl();

    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }
}
