package ru.vladpima.weatherparser;

public class Days {
    private String dayOfWeek;
    private String date;
    private String temperatureOfDay;
    private String temperatureOfNight;

    public Days(String dayOfWeek, String date, String temperatureOfDay, String temperatureOfNight) {
        this.dayOfWeek = dayOfWeek;
        this.date = date;
        this.temperatureOfDay = temperatureOfDay;
        this.temperatureOfNight = temperatureOfNight;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemperatureOfDay() {
        return temperatureOfDay;
    }

    public void setTemperatureOfDay(String temperatureOfDay) {
        this.temperatureOfDay = temperatureOfDay;
    }

    public String getTemperatureOfNight() {
        return temperatureOfNight;
    }

    public void setTemperatureOfNight(String temperatureOfNight) {
        this.temperatureOfNight = temperatureOfNight;
    }

    @Override
    public String toString() {
        return "Прогноз погоды(" +
                "День недели: '" + dayOfWeek + '\'' +
                ", дата:'" + date + '\'' +
                ", температура днём: '" + temperatureOfDay + '\'' +
                ", температура ночью: '" + temperatureOfNight + '\'' +
                ')';
    }
}

