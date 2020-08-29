package com.dammike.covid.covidtracker.model;

public class CountryStats {
    private String state;
    private String country;
    private int totalInfectedAmt;
    private int yesterdayOnlyAmt;

    public CountryStats(String state, String country, int totalInfectedAmt) {
        this.state = state;
        this.country = country;
        this.totalInfectedAmt = totalInfectedAmt;
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

    public int getTotalInfectedAmt() {
        return totalInfectedAmt;
    }

    public void setTotalInfectedAmt(int totalInfectedAmt) {
        this.totalInfectedAmt = totalInfectedAmt;
    }

    public int getYesterdayOnlyAmt() {
        return yesterdayOnlyAmt;
    }

    public void setYesterdayOnlyAmt(int yesterdayOnlyAmt) {
        this.yesterdayOnlyAmt = yesterdayOnlyAmt;
    }

    @Override
    public String toString() {
        return "CountryStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", totalInfectedAmt=" + totalInfectedAmt +
                ", yesterdayOnlyAmt=" + yesterdayOnlyAmt +
                '}';
    }
}
