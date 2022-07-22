package lesson_7;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        ObjectMapper objectMapper = new ObjectMapper();
        Scanner scanner = new Scanner(System.in);
        WeatherApi weatherApi = new WeatherApi();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        while (true) {
            System.out.println(dateFormat.format(new Date()));
            System.out.println("������� �������� ������");
            String userInput = scanner.nextLine();
            if (userInput.equals("�����") || userInput.equals("exit")) {
                System.out.println("������� �� ������������ ����������");
                break;
            }
            String weatherNow = weatherApi.weatherJson(userInput);
            WeatherJson weatherResponse = objectMapper.readValue(weatherApi.weatherJson(userInput), WeatherJson.class);
            weatherApi.weatherJson(userInput);


            System.out.println("�� ������ ������ � " + weatherResponse.getGeoObjectObject().getLocalityObject().getName() + " " + weatherResponse.getFactObject().getTemp() + " C � " + weatherResponse.getFactObject().getCondition());
        }
    }
}