package co.g2academy.crud.service;

import co.g2academy.crud.dao.PerpustakaanDao;
import co.g2academy.crud.entity.Perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ListIterator;

public class PerpustakaanApps {
    public static void main(String[] args) {
        //connect database ;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   // old "com.mysql.jdbc.Driver"

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabootcamp", "root", "paras23082011");
            PerpustakaanDao perpustakaanku = new PerpustakaanDao();
            perpustakaanku.setConnection(connection);

            System.out.println("=================================List Update Book This Week=============================");
            perpustakaanku.showAllBook();


            Perpustakaan perpustakaan = new Perpustakaan();
            perpustakaan.setBookId(20201118);
            perpustakaan.setBookName("Dilan 1991");
            perpustakaan.setBookAuthor("Baiq Pidi");
            perpustakaan.setBookYear(2021);

//            insert data :
            perpustakaanku.addBook(perpustakaan);

            //update data :
//            perpustakaanku.updateBook(perpustakaan);

            //select  data :
            perpustakaanku.selectBook(20201118 );

            //delete data :
//            perpustakaanku.deleteBook(20201116);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
