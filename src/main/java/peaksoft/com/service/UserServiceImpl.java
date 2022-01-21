package peaksoft.com.service;

import peaksoft.com.Dao.Dao;
import peaksoft.com.Dao.DaoSity;

import java.rmi.NotBoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserServiceImpl implements UserService{
    static Scanner scanner = new Scanner(System.in);
    Dao userDao = new Dao();
        @Override
        public void seveUser(String name, String population,String leng,int age) {
            userDao.seveUser(name,population,leng,age);
        }

    @Override
    public void findCityById(int id1) throws SQLException {
        userDao.findCityById(id1);
    }

    public static void choice(int namber) throws NotBoundException, SQLException {
            if (namber == 1){
                DaoSity daoSity = new DaoSity();
//                daoSity.seveUser("bishkek",12,"kg",31);
                System.out.println("get by id sity");
                daoSity.findCityById(scanner.nextInt());

            }else if (namber == 2){
                Dao dao = new Dao();
//                dao.seveUser("kyrgyzstan","kg","kyrgyz",31);
                System.out.println("get by id country");
                dao.findCityById(scanner.nextInt());
            }
            else {
                throw new NotBoundException(" you must press 1 or 2 ");
            }
    }
}

