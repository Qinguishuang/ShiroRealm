package com.qin.service;

import com.qin.entity.User;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class PasswordHelper {
    private RandomNumberGenerator generator = new SecureRandomNumberGenerator();
    private String algorithm = "md5";
    private final int hashIterations = 2;

    public void encryptPassword(User user) {
        user.setSalt(generator.nextBytes().toHex());
        String newPassword = new SimpleHash(
                algorithm,
                user.getPassword(),
                ByteSource.Util.bytes(user.getCredentialsSalt()),
                hashIterations
        ).toHex();
        user.setPassword(newPassword);
    }


}
