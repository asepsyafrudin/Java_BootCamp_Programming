package co.g2academy.jdbc.service;

import co.g2academy.jdbc.dao.PersonDaoJDBC;
import co.g2academy.jdbc.entity.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class PersonDaoJDBCExample {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2. Create Databases Connection
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabootcamp", "root", "paras23082011");

            PersonDaoJDBC persondao = new PersonDaoJDBC();
            persondao.setConnection(connection);

            //insert person data
            Person p = new Person();
            p.setName("ria");
            p.setPassword("pwd456");
            persondao.save(p);

            //get person data by id
            Person personId1 = persondao.getById(1);
            System.out.println("id: " + personId1.getId() + ",name: "
                    + personId1.getName() + ",password: " + personId1.getPassword());
            //update person with id 1
            personId1.setName("updated name here");
            personId1.setPassword("pwd updated");
            persondao.save(personId1);
            //getAll
            List<Person> persons = persondao.getALl();
            for(Person person : persons) {
                System.out.println("id:" + person.getId() + ",name:"
                        + person.getName() + ",password:" + person.getPassword());
            }




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
