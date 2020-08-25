package com.qin.service;

import com.qin.BaseTest;

import java.util.Set;

public class ServiceTest extends BaseTest {

    public void testUserRolePermissionRelation() {

        Set<String> roles = userService.findRoles(u1.getUsername());
    }
}
