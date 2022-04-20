package ru.saumlaki.connection.paterns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Example_JdbcTemplate {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("paternConfigDriverManagerDataSource.cfg.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("JdbcTemplate");

        jdbcTemplate.queryForList("SELECT * FROM shop").stream().forEach(a-> System.out.println(a.values()));
    }
}
