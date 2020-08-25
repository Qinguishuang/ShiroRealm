package com.qin.realm;

import com.qin.BaseTest;
import org.apache.shiro.authc.UnknownAccountException;
import org.junit.Assert;
import org.junit.Test;

public class UserRealmTest extends BaseTest {
    @Test
    public void testLoginSuccess() {
        login("classpath:shiro.ini", u1.getUsername(), password);
        System.out.println(subject().isAuthenticated());
    }

    @Test(expected = UnknownAccountException.class)
    public void testLoginFailWithUnknownUsername() {
        login("classpath:shiro.ini", u1.getUsername() + " ", password);
    }

    @Test
    public void testHasRole() {
        login("classpath:shiro.ini", u1.getUsername(), password);
        Assert.assertTrue(subject().hasRole("admin"));
    }
}
