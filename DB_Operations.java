package com.amrita;
import java.sql.*;
public class DB_OPERATIONS {
    public String username = "root";
    public String password = "root";
    public String Dburl = "jdbc:mysql://localhost:3306/CARRENTALSYSTEM";
    public void Insert(String query) throws SQLException {
        try{
            int rows_affected = 0;
            //creating the connection to the database
            Connection connect =
                    DriverManager.getConnection(Dburl,username,password);
            //creating a statement && executing a query
            Statement statement = connect.createStatement();
            // excecuting a query
            rows_affected = statement.executeUpdate(query);
            //prinring the result
            System.out.println(rows_affected + " rows have been
                    inserted.");
                    //closing the connection
                    connect.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void Update(String query) throws SQLException{
        try{
            int rows = 0;
            //creating the connection to the database
            Connection connection =
                    DriverManager.getConnection(Dburl,username,password);
            // creating a statement && executing the query here
            Statement statement = connection.createStatement();
            //executing a query
            rows = statement.executeUpdate(query);
            //printing the rows affected
            System.out.println(rows + " rows have been updated.");
            //closing the connection
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void Delete(String query) throws SQLException{
        try{
            int rows_effected = 0;
            //creating a connection to the database
            Connection connection =
                    DriverManager.getConnection(Dburl,username,password);
            //creating a statement
            Statement statement = connection.createStatement();
            //executing a query
            rows_effected = statement.executeUpdate(query);
            //printing the rows effected statement;
            System.out.println(rows_effected + " have been updated");
            connection.close();
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
    public void Select(String query) throws SQLException{
        try{
            int count = 0;
            //creating a connection to the database
            Connection connection =
                    DriverManager.getConnection(Dburl,username,password);
            //creating a statement
            Statement statement = connection.createStatement();
            //storing the result of executed query in a result set object
            ResultSet set = statement.executeQuery(query);
            while(set.next()){
                String id = set.getString("CUSTOMER_ID");
                String name = ((ResultSet) set).getString("PHONE_NUMBER");
                String phno = set.getString("EMAIL");
                String street = ((ResultSet) set).getString("STREET");
                String city = set.getString("CITY");
                String zipcode = ((ResultSet) set).getString("ZIPCODE");
                String aadhaar = set.getString("AADHAAR");
                System.out.println(id + " "+ name + " "+ phno + " "+
                        street + " "+ city + " "+zipcode+ " "+ aadhaar );
                count++;
            }
            System.out.println(count + " rows are Selected");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
