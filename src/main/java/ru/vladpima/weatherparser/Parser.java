package ru.vladpima.weatherparser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static void main(String[] args) throws IOException {
        List<Days> daysList = new ArrayList<Days>();

        Document doc = Jsoup.connect("https://yandex.ru/pogoda/rezh").get();

        Elements divElements = doc.getElementsByClass("forecast-briefly__day");
        for(Element divElement : divElements) {
            Element aElement = divElement.child(0);
            String dayOfWeek = aElement.child(0).text();
            String date = aElement.child(1).text();
            String temperatureOfDay = aElement.child(3).text();
            String temperatureOfNight = aElement.child(4).text();

            daysList.add(new Days(dayOfWeek, date, temperatureOfDay, temperatureOfNight));
        }

        daysList.forEach(System.out::println);

    }
}