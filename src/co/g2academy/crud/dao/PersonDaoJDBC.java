package co.g2academy.crud.dao;

import co.g2academy.crud.entity.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDaoJDBC {
    Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;

    private String insertQuery = "insert into T_PERSON (name, password) values ( ? , ? )";
    private String updateQuery= "update T_PERSON set name = ?, password = ? where id = ?";
    private String deleteQuery = "delete from T_PERSON where id = ? ";

    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        insertStatement = this.connection.prepareStatement(insertQuery);
        insertStatement = this.connection.prepareStatement(updateQuery);
        insertStatement = this.connection.prepareStatement(deleteQuery);

    }

    public Person save (Person p) throws SQLException {
            insertStatement.setString(1, p.getName());
            insertStatement.setString(2, p.getPassword());
            insertStatement.executeUpdate();

        return p;
    }

}
