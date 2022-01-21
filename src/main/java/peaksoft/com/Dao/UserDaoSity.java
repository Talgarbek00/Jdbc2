package peaksoft.com.Dao;

import java.sql.SQLException;

public interface UserDaoSity {
    void seveUser(String name, int size , String population, int age);
    void findCityById(int id) throws SQLException;
}
