import java.sql.*;
import java.util.ArrayList;

public class Dealership {
    public static void main(String[] args) {
        Car testCar = search(21);
        System.out.println(testCar.getName());
    }
    public static ArrayList<Car> getCars() {
        ArrayList<Car> arrayList = new ArrayList<Car>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicles", "root", "haitham");
            String query = "SELECT * FROM cars";
            Statement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Car car = new Car(resultSet.getString("name"), resultSet.getInt("price"), resultSet.getInt("stock"), resultSet.getString("color"), resultSet.getInt("horsepower"), resultSet.getInt("cylinders"), resultSet.getInt("cc"));
                arrayList.add(car);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return arrayList;
    }
    public static Car search(int id) {
        Car car = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicles", "root", "haitham");
            String query = "SELECT * FROM cars WHERE id =" + id;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                car = new Car(resultSet.getString("name"), resultSet.getInt("price"), resultSet.getInt("stock"), resultSet.getString("color"), resultSet.getInt("horsepower"), resultSet.getInt("cylinders"), resultSet.getInt("cc"));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return car;
    }
}