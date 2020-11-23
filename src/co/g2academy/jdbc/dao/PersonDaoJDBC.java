package co.g2academy.jdbc.dao;

import co.g2academy.jdbc.entity.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoJDBC {
    private Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement getIdStatement;
    private PreparedStatement getAllStatement;


    private String insertQuery = "insert into T_PERSON(name, password) values ( ? , ? )";
    private String updateQuery = "update T_PERSON set name = ? , password = ? where id = ?";
    private String deleteQuery = "delete from T_PERSON where id = ?";
    private String getByIdQuery = "select id, name , password from T_PERSON where id = ?";
    private String getAllQuery = "select id , name , password from T_PERSON";


    public void setConnection(Connection connection)  throws SQLException {
        this.connection = connection;
        insertStatement = this.connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
        updateStatement = this.connection.prepareStatement(updateQuery);
        deleteStatement = this.connection.prepareStatement(deleteQuery);
        getIdStatement = this.connection.prepareStatement(getByIdQuery);
        getAllStatement = this.connection.prepareStatement(getAllQuery);

    }

    public Person save (Person p) throws SQLException {
        if (p.getId() == null) {
            insertStatement.setString(1, p.getName());
            insertStatement.setString(2, p.getPassword());
            int id = insertStatement.executeUpdate();
            p.setId(id);

        } else {
            updateStatement.setString(1, p.getName());
            updateStatement.setString(2, p.getPassword());
            updateStatement.setLong(3, p.getId());
            updateStatement.executeUpdate();
        }
        return p;
    }

    public Person delete (Person p ) throws SQLException {
        deleteStatement.setLong(1, p.getId());
        deleteStatement.executeUpdate();
        return p;
    }

    public Person getById(Integer id ) throws SQLException {
        getIdStatement.setInt(1, id);
        ResultSet rs = getIdStatement.executeQuery();
        //process mapping dari relational object
        if(rs.next()) {
           return getPersonFromResultSet(rs);
        }

        return null;
    }

    public List<Person> getALl() throws SQLException {
        List <Person> persons = new ArrayList<Person>();
        ResultSet rs =getAllStatement.executeQuery();
        while (rs.next()) {
            persons.add(getPersonFromResultSet(rs));
        }
        return persons;
    }

private Person getPersonFromResultSet (ResultSet rs) throws SQLException {
    Person person = new Person();
    person.setId(rs.getInt("id"));
    person.setName(rs.getString("name"));
    person.setPassword(rs.getString("password"));
    return person;
}


}
