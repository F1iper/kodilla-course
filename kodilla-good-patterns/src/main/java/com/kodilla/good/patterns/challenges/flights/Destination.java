package com.kodilla.good.patterns.challenges.flights;

public enum Destination {

    LHR("London"),
    TXL("Berlin"),
    WAW("Warsaw"),
    KRK("Cracow"),
    DUB("Dublin"),
    GYD("Baku"),
    MAD("Madrit"),
    MXP("Mediolan");

    Destination(String cityName){
        this.cityName = cityName;
    }

    private final String cityName;

    public String getCityName() {
        return cityName;
    }
}