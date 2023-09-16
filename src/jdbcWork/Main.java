package jdbcWork;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Country> countries = new ArrayList<Country>();
        try{
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code, Name, Continent, Region from country");
            while (resultSet.next()){
                System.out.println(resultSet.getString("Name"));
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println("Total country number= " + countries.size());
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }
}
