package co.g2academy.crud.dao;

import co.g2academy.crud.entity.Perpustakaan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PerpustakaanDao {
    Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement selectStatement;
    private PreparedStatement selectAllStatement;;


    private String insertQuery = "insert into perpustakaan(book_id , book_name, book_author, book_year) values (?,?,?,?)";
    private String updateQuery = "update perpustakaan set book_name = ? , book_author = ?, book_year = ? where book_id = ?" ;
    private String deleteQuery = "delete from perpustakaan where book_id = ?";
    private String selectQuery = "select book_id , book_name, book_author, book_year from perpustakaan where book_id = ?";
    private String selectAllQuery = "select * from perpustakaan";


    public void setConnection (Connection connection) throws SQLException {
        this.connection = connection;
        insertStatement = connection.prepareStatement(insertQuery);
        updateStatement = connection.prepareStatement(updateQuery);
        deleteStatement = connection.prepareStatement(deleteQuery);
        selectStatement = connection.prepareStatement(selectQuery);
        selectAllStatement = connection.prepareStatement(selectAllQuery);

    }

    public Perpustakaan addBook(Perpustakaan perpustakaan) throws SQLException {
        List<Integer> idBookCheck = new ArrayList<Integer>();
        ResultSet rs = selectAllStatement.executeQuery();
        while(rs.next()) {
            idBookCheck.add(rs.getInt("book_id"));
        }


        boolean check = true;
        for (int i = 0; i < idBookCheck.size(); i++) {
            if (idBookCheck.get(i).equals(perpustakaan.getBookId())) {
                System.out.println("Book id Sudah Terdaftar!!, Silahkan masukkan book id lain !!");
                check = false;
                break;
            }
        }

        if (check == true) {
            insertStatement.setInt(1, perpustakaan.getBookId());
            insertStatement.setString(2, perpustakaan.getBookName());
            insertStatement.setString(3, perpustakaan.getBookAuthor());
            insertStatement.setInt(4, perpustakaan.getBookYear());
            insertStatement.executeUpdate();
        }

        return perpustakaan;
    }

    public void deleteBook(Integer id) throws SQLException {
        deleteStatement.setInt(1,id);
        deleteStatement.executeUpdate();

    }

    public Perpustakaan updateBook (Perpustakaan perpustakaan) throws SQLException {
        updateStatement.setString(1, perpustakaan.getBookName());
        updateStatement.setString(2, perpustakaan.getBookAuthor());
        updateStatement.setInt(3, perpustakaan.getBookYear());
        updateStatement.setInt(4, perpustakaan.getBookId());
        updateStatement.executeUpdate();
        return perpustakaan;
    }

    public void selectBook (Integer id) throws SQLException {
        selectStatement.setInt(1, id );
        ResultSet rs = selectStatement.executeQuery();
        Perpustakaan perpustakaan = new Perpustakaan();
        if(rs.next()) {
            perpustakaan.setBookId(rs.getInt("book_id"));
            perpustakaan.setBookName(rs.getString("book_name"));
            perpustakaan.setBookAuthor(rs.getString("book_author"));
            perpustakaan.setBookYear(rs.getInt("book_year"));

        }

        System.out.println("you are choose id : " + id);
        System.out.println("id  : " + perpustakaan.getBookId() + "  Book Name    : " + perpustakaan.getBookName() +
                "   Book Author     : " + perpustakaan.getBookAuthor() + "  Book Year : " + perpustakaan.getBookYear());


    }

    public List<Perpustakaan> allBook () throws SQLException{
        List<Perpustakaan> perpustakaans = new ArrayList<Perpustakaan>();
        ResultSet rs = selectAllStatement.executeQuery();
        while(rs.next()) {
            Perpustakaan perpustakaan = new Perpustakaan();
            perpustakaan.setBookId(rs.getInt("book_id"));
            perpustakaan.setBookName(rs.getString("book_name"));
            perpustakaan.setBookAuthor(rs.getString("book_author"));
            perpustakaan.setBookYear(rs.getInt("book_year"));
            perpustakaans.add(perpustakaan);
        }

        return perpustakaans;

    }

    public void showAllBook() throws SQLException{
        List<Perpustakaan> perpustakaans = new ArrayList<Perpustakaan>();
        ResultSet rs = selectAllStatement.executeQuery();
        while (rs.next()) {
            Perpustakaan perpustakaan = new Perpustakaan();
            perpustakaan.setBookId(rs.getInt("book_id"));
            perpustakaan.setBookName(rs.getString("book_name"));
            perpustakaan.setBookAuthor(rs.getString("book_author"));
            perpustakaan.setBookYear(rs.getInt("book_year"));
            perpustakaans.add(perpustakaan);
        }
        for(int i = 0; i<perpustakaans.size(); i++) {
            System.out.println("id  : " + perpustakaans.get(i).getBookId() + "  Book Name    : " + perpustakaans.get(i).getBookName() +
                    "   Book Author     : " + perpustakaans.get(i).getBookAuthor() + "  Book Year : " + perpustakaans.get(i).getBookYear());
        }

    }








}
