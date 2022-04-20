package ru.saumlaki.connection.jdbs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example_SingleConnectionDataSource {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("jdbsSingleConnectionDataSource.cfg.xml");
        DriverManagerDataSource source = (DriverManagerDataSource) context.getBean("dataSource");
        try {
            Connection connection = source.getConnection();
            Statement stm = connection.createStatement();
            ResultSet resultSet = stm.executeQuery("SELECT * FROM shop");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
