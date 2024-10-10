package com.spring_JDBCeX.JDBCSPRING;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_JDBCeX/JDBCSPRING/beans.xml");
        JdbcTemplate temp=( JdbcTemplate)context.getBean("template");
        String q="insert into Student (id,name,city) values(?,?,?)";
        int r=temp.update(q, 134,"heena","mumbai");
        System.out.println(r+" row affected");
    }
}
