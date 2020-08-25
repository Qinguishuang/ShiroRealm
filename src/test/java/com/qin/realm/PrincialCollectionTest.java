package com.qin.realm;

import com.qin.BaseTest;
import com.qin.entity.User;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

import java.util.Collection;
import java.util.Set;


public class PrincialCollectionTest extends BaseTest {
    @Test
    public void test() {
        login("classpath:shiro-multirealm.ini", "zhang", "123");
        Subject subject = subject();
        Object primaryPrincipal1 = subject.getPrincipal();
        PrincipalCollection principalCollection = subject.getPrincipals();
        Object primaryPrincipal2 = principalCollection.getPrimaryPrincipal();

        System.out.println(primaryPrincipal1);
        System.out.println(primaryPrincipal2);

        Set<String> realmNames = principalCollection.getRealmNames();
        System.out.println(realmNames);

        Set<Object> principals = principalCollection.asSet();
        System.out.println(principals);

        Collection<User> users = principalCollection.fromRealm("c");
        System.out.println(users);
    }
}
