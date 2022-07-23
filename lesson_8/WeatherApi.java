package lesson_8;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class WeatherApi {

    public String weatherJson(String city) throws IOException {
        CityCoordinates cityCoordinates = new CityCoordinates();
        String coord = cityCoordinates.getCityCoordinates(city);
        String[] coordinates = coord.split(" ");


        OkHttpClient okHttpClient = new OkHttpClient();
        double lat = Double.parseDouble(coordinates[1]); //������ � ��������
        double lon = Double.parseDouble(coordinates[0]); //������� � ��������
        int limit = 5; //���� ��������
        String token = "92656a0c-ba15-43d0-b4b4-a04d521e1873"; //������ ����: ce09edeb-132e-40d6-a0ae-1c1026b2466e
        String apiUrl = "https://api.weather.yandex.ru/v2/forecast?lat=" + lat + "&lon=" + lon + "&limit=" + limit;
        Request requestWeather = new Request.Builder()
                .url(apiUrl)
                .addHeader("X-Yandex-API-Key", token)
                .build();
        System.out.println(requestWeather);


        Response responseBooking = okHttpClient.newCall(requestWeather).execute();
        System.out.println(responseBooking.code());
        System.out.println(responseBooking.headers());
        System.out.println(responseBooking.body().string());
        return responseBooking.body().string();
    }


}