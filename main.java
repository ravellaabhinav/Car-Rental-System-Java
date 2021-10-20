package com.amrita;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.sql.SQLException;
import java.util.Scanner;
import java.lang.String;
public class Main extends login {
    public static void main(String[] args) throws SQLException {
        login x = new login();
        x.login();
        if (login_bool) {
            Scanner user_input = new Scanner(System.in);
            DB_OPERATIONS d = new DB_OPERATIONS();
            String query;
            System.out.println("==============car rental system
                    console=========================");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Select");
            System.out.println("4. Delete");
            System.out.println("===================Please Select an option
                    ======================");
            int option = user_input.nextInt();
            System.out.println("(CUSTOMER || CAR || BOOKING || BILLING ||
                    PAYMENT)");
            if (option == 1) {
                String table_name;
                System.out.println("Please enter the table name : ");
                user_input.nextLine();
                table_name = user_input.nextLine();
                if (table_name.equals("CUSTOMER")) {
                    CB.EN.U4CSE1945
                    9
                    S.SHANTHAN
                    Package Com.amrita All the classes present
                    in the project are the
                    part of the
package com.amrita
                    CB.EN.U4CSE1945
                    9
                    S.SHANTHAN
                            Exception
                    handling
                    sqlexceptions Expected SQLExcepti
                    ons are mentioned in
throws and try block
                    captures the errors that
                    might occur while the
                    SQL statements
                    getting executed.
                    System.out.println("Enter ID : ");
                    String CUSTOMER_ID = user_input.nextLine();
                    user_input.nextLine();
                    System.out.println("Enter Phone number : ");
                    String PHONE_NUMBER = user_input.nextLine();
                    user_input.nextLine();
                    System.out.println("Enter Email");
                    String EMAIL = user_input.nextLine();
                    user_input.nextLine();
                    System.out.println("Enter Street");
                    String STREET = user_input.nextLine();
                    System.out.println("Enter City");
                    String CITY = user_input.nextLine();
                    System.out.println("Enter Zipcode");
                    String ZIPCODE = user_input.nextLine();
                    System.out.println("Enter Aadhaar Id");
                    String AADHAAR = user_input.nextLine();
                    query = "INSERT INTO " + table_name + " VALUES('" +
                            CUSTOMER_ID + "','" + PHONE_NUMBER + "','" + EMAIL + "','" + STREET + "','"
                            + CITY + "','" + ZIPCODE + "','" + AADHAAR + "')";
                    d.Insert(query);
                } else if (table_name.equals("CAR")) {
                    System.out.println("Enter CAR_ID : ");
                    String CAR_ID = user_input.nextLine();
                    System.out.println("Enter car model : ");
                    String CAR_MODEL = user_input.nextLine();
                    System.out.println("Enter customer id");
                    String CUSTOMER_ID = user_input.nextLine();
                    System.out.println("Enter location");
                    String LOCATION = user_input.nextLine();
                    System.out.println("Enter registration number ");
                    String REG_NO = user_input.nextLine();
                    query = "insert into " + table_name + " values('" +
                            CAR_ID + "','" + CAR_MODEL + "','" + CUSTOMER_ID + "','" + LOCATION + "','"
                            + REG_NO + "')";
                    d.Insert(query);
                } else if (table_name.equals("BOOKING")) {
                    System.out.println("Enter BOOKING ID : ");
                    String BOOKING_ID = user_input.nextLine();
                    System.out.println("Enter car id");
                    String CAR_ID = user_input.nextLine();
                    System.out.println("Enter customer id");
                    String CUSTOMER_ID = user_input.nextLine();
                    System.out.println("Enter FROM DATE ");
                    String FROM_DATE = user_input.nextLine();
                    System.out.println("Enter TO DATE ");
                    String TO_DATE = user_input.nextLine();
                    query = "insert into " + table_name + " values('" +
                            BOOKING_ID + "','" + CAR_ID + "','" + CUSTOMER_ID + "','" + FROM_DATE +
                            "','" + TO_DATE + "')";
                    d.Insert(query);
                } else if (table_name.equals("BILLING")) {
                    System.out.println("Enter BILLING ID : ");
                    String BILLING_ID = user_input.nextLine();
                    System.out.println("Enter BOOKING ID");
                    String BOOKING_ID = user_input.nextLine();
                    System.out.println("Enter customer id");
                    String CUSTOMER_ID = user_input.nextLine();
                    System.out.println("Enter CAR ID ");
                    String CAR_ID = user_input.nextLine();
                    System.out.println("Enter BILLING DATE ");
                    String BILL_DATE = user_input.nextLine();
                    query = "insert into " + table_name + " values('" +
                            BILLING_ID + "','" + BOOKING_ID + "','" + CUSTOMER_ID + "','" + CAR_ID +
                            "','" + BILL_DATE + "')";
                    d.Insert(query);
                } else if (table_name.equals("PAYMENT")) {
                    System.out.println("Enter PAYMENT METHOD : ");
                    String PAYMENT_METHOD = user_input.nextLine();
                    System.out.println("Enter PAYMENT STATUS");
                    String PAYMENT_STATUS = user_input.nextLine();
                    System.out.println("Enter BILLING ID");
                    String BILLING_ID = user_input.nextLine();
                    System.out.println("Enter TOTAL AMOUNT ");
                    String TOTAL_AMOUNT = user_input.nextLine();
                    query = "insert into " + table_name + " values('" +
                            PAYMENT_METHOD + "','" + PAYMENT_STATUS + "','" + BILLING_ID + "','" +
                            TOTAL_AMOUNT + "')";
                    d.Insert(query);
                }
            } else if (option == 2) {
                String table_name;
                System.out.println("Please enter the table name : ");
                user_input.nextLine();
                table_name = user_input.nextLine();
                if (table_name.equals("CUSTOMER")) {
                    System.out.println("enter column ");
                    String UpdateCol = user_input.nextLine();
                    System.out.println("enter value: ");
                    String Value = user_input.nextLine();
                    System.out.println("enter corresponding CUSTOMER_ID:
                            ");
                    int changes = user_input.nextInt();
                    query = "UPDATE " + table_name + " SET " + UpdateCol +
                            "='" + Value + "' WHERE CUSTOMER_ID = " + changes;
                    d.Update(query);
                } else if (table_name.equals("CAR")) {
                    System.out.println("enter column: ");
                    String UpdateCol = user_input.nextLine();
                    System.out.println("enter value: ");
                    String Value = user_input.nextLine();
                    System.out.println("enter corresponding CAR_ID : ");
                    int changes = user_input.nextInt();
                    query = "UPDATE " + table_name + " SET " + UpdateCol +
                            "='" + Value + "' WHERE CAR_ID = " + changes;
                    d.Update(query);
                } else if (table_name.equals("BOOKING")) {
                    System.out.println("enter column: ");
                    String UpdateCol = user_input.nextLine();
                    System.out.println("enter value: ");
                    String Value = user_input.nextLine();
                    System.out.println("enter corresponding BOOKING_ID: ");
                    int changes = user_input.nextInt();
                    query = "UPDATE " + table_name + " SET " + UpdateCol +
                            "='" + Value + "' WHERE BOOKING_ID = " + changes;
                    d.Update(query);
                } else if (table_name.equals("BILLING")) {
                    System.out.println("enter column: ");
                    String UpdateCol = user_input.nextLine();
                    System.out.println("enter value: ");
                    String Value = user_input.nextLine();
                    System.out.println("enter corresponding BILLING_ID: ");
                    int changes = user_input.nextInt();
                    query = "UPDATE " + table_name + " SET " + UpdateCol +
                            "='" + Value + "' WHERE BILLING_ID = " + changes;
                    d.Update(query);
                } else if (table_name.equals("PAYMENT")) {
                    System.out.println("enter column ");
                    String UpdateCol = user_input.nextLine();
                    System.out.println("enter value: ");
                    String Value = user_input.nextLine();
                    System.out.println("enter corresponding PAYMENT_METHOD
: ");
                    String changes = user_input.nextLine();
                    query = "UPDATE " + table_name + " SET " + UpdateCol +
                            "='" + Value + "' WHERE PAYMENT_METHOD = " + changes;
                    d.Update(query);
                }
            } else if (option == 3) {
                String table_name;
                System.out.println("Please enter the table name : ");
                user_input.nextLine();
                table_name = user_input.nextLine();
                query = "SELECT * FROM " + table_name;
                d.Select(query);
            } else if (option == 4) {
                String table_name;
                System.out.println("Please enter the table name : ");
                user_input.nextLine();
                table_name = user_input.nextLine();
                System.out.println("enter id to delete : ");
                int DeleteEntry = user_input.nextInt();
                query = "DELETE FROM " + table_name + " WHERE BILLING_ID ="
                        + DeleteEntry;
                d.Delete(query);
            }
        }
    }
}