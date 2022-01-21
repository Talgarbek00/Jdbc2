package peaksoft.com.Dao;

import java.sql.SQLException;

public interface UserDao {
    void seveUser(String name, String population,String leng, int age);
    void findCityById(int id) throws SQLException;
}
