package peaksoft.com;

import peaksoft.com.service.UserService;
import peaksoft.com.service.UserServiceImpl;

import java.rmi.NotBoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws SQLException, NotBoundException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("press 1 sity\npress 2 country");
            UserServiceImpl.choice(scanner.nextInt());

        }
    }
}
