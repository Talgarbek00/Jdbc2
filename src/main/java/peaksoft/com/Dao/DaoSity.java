package peaksoft.com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static peaksoft.com.util.Util.connection;

public class DaoSity implements UserDaoSity{
    @Override
    public void seveUser(String name, int size,String population, int age) {
        String SQL ="INSERT INTO sity (name,size,population,age) VALUES(?,?,?,?)";
        try(Connection conn = connection();
            PreparedStatement prstmt = conn.prepareStatement(SQL)){
            prstmt.setString(1,name);
            prstmt.setInt(2,size);
            prstmt.setString(3,population);
            prstmt.setInt(4,age);
            prstmt.executeUpdate();
            System.out.println(name+"  базага кoшулду");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void findCityById(int id) throws SQLException {
        try(PreparedStatement pr = connection().prepareStatement("select * from sity where id=?")){
            pr.setInt(1,id);
            ResultSet resultSet=pr.executeQuery();
            if(resultSet.next()){
                System.out.println("id         "+ resultSet.getInt(1));
                System.out.println("name       "+ resultSet.getString(2));
                System.out.println("population "+ resultSet.getInt(3));
                System.out.println("lenguage   "+ resultSet.getString(4));
                System.out.println("age        "+ resultSet.getInt(5));
                System.out.println();
            }else {
                System.out.println(id+ " деген id жок");
                System.out.println();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());


        }
    }
}
