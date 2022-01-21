package peaksoft.com.service;

import java.sql.SQLException;

public interface UserService {
    void seveUser(String name,String population,String leng,int age);
    void findCityById(int id1) throws SQLException;
}
