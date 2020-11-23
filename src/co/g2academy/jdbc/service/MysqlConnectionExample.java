package co.g2academy.jdbc.service;

import java.sql.*;

public class MysqlConnectionExample {
    public static void main(String[] args) {
        //1.load mysql jdbc driver
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //2. Create Databases Connection
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabootcamp", "root", "paras23082011");

            //create statement
            Statement statement = connection.createStatement();

            //4. execute query
            ResultSet rs = statement.executeQuery("select * from student");

            // 5. iterate all through all row
            while(rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                String phone_number = rs.getString("phone_number");
                System.out.println(id + " " + name + " " + age + " " + phone_number);
            }

            // 6. update data
            statement.executeUpdate("update student set age = 17 , name = 'septi' where id = 3 ");

            //delete data
            statement.executeUpdate("delete from student where id = 2 ");

            //insert data
            statement.executeUpdate("insert into student values (2 , 'rezvan' , 1 , '08387771234')");

            //prepared statemenet
            String insertQuery = "insert into student(id , name , age , phone_number)  value ( ? , ? , ? , ? )";
            PreparedStatement pInsert = connection.prepareStatement(insertQuery);
            String updateQuery = "update student set name = ?, age = ? , phone_number = ? where id = ? ";
            PreparedStatement pUpdate = connection.prepareStatement(updateQuery);


            //===Prepared Statement ===//
            //insert
            pInsert.setInt(1,7);
            pInsert.setString(2, "Syifa");
            pInsert.setInt(3, 17);
            pInsert.setString(4,"083833131222");
            pInsert.executeUpdate();


            //update
            pUpdate.setString(1, "Rasya");
            pUpdate.setInt(2, 20);
            pUpdate.setString(3, "083877778823");
            pUpdate.setInt(4,3);
            pUpdate.executeUpdate();


            //menangani statement : fungsi nya agar seluruh transaksi berhasil dulu dilakukan setela itu baru bisa di ekseusi query nya

            connection.setAutoCommit(false); //set auto commit menjadi false.
            for (int i = 15; i <100; i ++) {
                pInsert.setInt(1,i);
                pInsert.setString(2,  "student" + i);
                pInsert.setInt(3, 17);
                pInsert.setString(4,"0838331312 " + i);
                pInsert.addBatch();
            }
            pInsert.executeBatch();
            connection.commit();
            connection.setAutoCommit(true); //set auto commit menjadi true

            //close all resources
            rs.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
