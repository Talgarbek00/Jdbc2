package peaksoft.com.Dao;

import java.sql.*;

import static peaksoft.com.util.Util.connection;

public class Dao implements UserDao {

    @Override
    public void seveUser(String name, String population,String leng, int age) {
        String SQL ="INSERT INTO country (name,population,leng,age) VALUES(?,?,?,?)";
        try(Connection conn = connection();
            PreparedStatement prstmt = conn.prepareStatement(SQL)){
            prstmt.setString(1,name);
            prstmt.setString(2,population);
            prstmt.setString(3,leng);
            prstmt.setInt(4,age);
            prstmt.executeUpdate();
            System.out.println(name+"  базага кoшулду");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void findCityById(int id) throws SQLException {
        try(PreparedStatement pr = connection().prepareStatement("select * from country where id=?")){
            pr.setInt(1,id);
            ResultSet resultSet=pr.executeQuery();
            if(resultSet.next()){
                System.out.println("id         "+ resultSet.getInt(1));
                System.out.println("name       "+ resultSet.getString(2));
                System.out.println("population "+ resultSet.getString(3));
                System.out.println("language   "+ resultSet.getString(4));
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

