package com.qin;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcUtils {
    private static JdbcTemplate jdbcTemplate;

    public static JdbcTemplate jdbcTemplate() {
        if (jdbcTemplate == null) {
            jdbcTemplate = createJdbcTemplate();
        }
        return jdbcTemplate;
    }

    private static JdbcTemplate createJdbcTemplate() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        ds.setUrl("jdbc:mysql://localhost:3306/shiro?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8");
        ds.setUrl("jdbc:mysql://localhost:3306/shiro?serverTimezone=Asia/Shanghai&useSSL=false&useUnicode=true" +
                "&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&autoReconnect=true&allowMultiQueries=true");
        ds.setUsername("root");
        ds.setPassword("root");
        return new JdbcTemplate(ds);
    }
}
