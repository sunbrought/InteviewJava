package org.highProgram.fourteen;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MysqlDemo {
    public static final String DriveClass="com.mysql.jdbc.Driver";
    public static final String HostName="jdbc:mysql://localhost:3306/boot_crm?characterEncoding=utf-8";
    public static final String User="root";
    public static final String pass="1234";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载JDBC驱动
        Class.forName(DriveClass);
        //获取Connecting对象
        Connection con=DriverManager.getConnection(HostName,User,pass);
        String sql="SELECT * FROM boot_crm.sys_user";
        //创建Statement对象
        Statement statement=con.createStatement();
        //获取ResultSet集合对象
        ResultSet resultSet=statement.executeQuery(sql);
        List list=new ArrayList();
        while (resultSet.next()){
            int id=resultSet.getInt(1);
            String code=resultSet.getString(2);
            String name=resultSet.getString(3);
            String password=resultSet.getString(4);
            int state=resultSet.getInt(5);
            list.add(id);
            list.add(code);
            list.add(name);
            list.add(password);
            list.add(state);
        }
        String sql1="update boot_crm.sys_user set user_state=? where user_id=?";
        PreparedStatement preparedStatement =con.prepareStatement(sql1);
        preparedStatement.setInt(1,2);
        preparedStatement.setInt(2,3);
        int len=preparedStatement.executeUpdate();
        System.out.println(len+"条数据受到影响");
        System.out.println(list);

        String sql2="SELECT * FROM boot_crm.sys_user where name like ?";
        PreparedStatement preparedStatement1 =con.prepareStatement(sql2);
        //如果使用模糊查询必须按这个规定写
        preparedStatement1.setString(1,"%"+"小"+"%");
        List list1=new ArrayList();
        ResultSet resultSet1=statement.executeQuery(sql);
        while (resultSet1.next()){
            int id=resultSet1.getInt(1);
            String code=resultSet1.getString(2);
            String name=resultSet1.getString(3);
            String password=resultSet1.getString(4);
            int state=resultSet1.getInt(5);
            list1.add(id);
            list1.add(code);
            list1.add(name);
            list1.add(password);
            list1.add(state);
        }
        System.out.println(list1);
        resultSet.close();
        statement.close();
        preparedStatement.close();
        preparedStatement1.close();
        con.close();
    }
}
