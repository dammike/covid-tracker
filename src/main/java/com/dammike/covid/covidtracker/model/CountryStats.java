package com.dammike.covid.covidtracker.model;

public class CountryStats {
    private String state;
    private String country;
    private int infectedAmt;

    public CountryStats(String state, String country, int infectedAmt) {
        this.state = state;
        this.country = country;
        this.infectedAmt = infectedAmt;
    }

    public CountryStats() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getInfectedAmt() {
        return infectedAmt;
    }

    public void setInfectedAmt(int infectedAmt) {
        this.infectedAmt = infectedAmt;
    }

    @Override
    public String toString() {
        return "CountryStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", infectedAmt=" + infectedAmt +
                '}';
    }
}
