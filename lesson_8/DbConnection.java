package lesson_8;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DbConnection {
    private static final String DB_NAME = "weather.db";
    String insertWeather = "insert into weather (city, localdate, temperature, weather_text) values (?, ?, ?, ?)";
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean saveWeatherData(WeatherJson weatherJson) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + DB_NAME)) {
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);
            saveWeather.setString(1, weatherJson.getGeoObjectObject().getLocalityObject().getName());
            saveWeather.setString(2, dateFormat.format(new Date()));
            saveWeather.setDouble(3, weatherJson.getFactObject().getTemp());
            saveWeather.setString(4, weatherJson.getFactObject().getCondition());
            return saveWeather.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new SQLException("���������� ������ � ���� ������ �� ���������!");
    }

    public void getSavedWeatherData(String city) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + DB_NAME);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from weather where city like '" + city + "'");
        while (resultSet.next()) {
            String date = resultSet.getString(3);
            String cityName = resultSet.getString(2);
            double temp = resultSet.getDouble(4);
            String condition = resultSet.getString(5);
            String getSavedWeatherData = date + " " + cityName + " " + temp + "C " + condition;
            System.out.println(getSavedWeatherData);
        }

    }
}