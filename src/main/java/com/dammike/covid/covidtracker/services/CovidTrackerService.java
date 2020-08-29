package com.dammike.covid.covidtracker.services;

import org.springframework.stereotype.Service;

@Service
public class CovidTrackerService {

    private static final String FETCH_DATA = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

    public void fetchCovidData() {

    }
}
