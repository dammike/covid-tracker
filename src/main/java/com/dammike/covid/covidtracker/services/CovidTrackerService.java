package com.dammike.covid.covidtracker.services;

import com.dammike.covid.covidtracker.model.CountryStats;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.LinkedList;
import java.util.List;

@Service
public class CovidTrackerService {
    private static final String FETCH_DATA = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

    private List<CountryStats> allData = new LinkedList<CountryStats>();

    @PostConstruct
    public void fetchCovidData() throws IOException, InterruptedException {
        List<CountryStats> countries = new LinkedList<>();
        HttpRequest request = HttpRequest.newBuilder(URI
                .create(FETCH_DATA))
                .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Reader in = new StringReader(response.body());
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
        CountryStats stats = null;
        for (CSVRecord record : records) {
            stats = new CountryStats();
            stats.setState(record.get("Province/State"));
            stats.setCountry(record.get("Country/Region"));
            stats.setYesterdayOnlyAmt(Integer.parseInt(record.get(record.size() - 1))
                    - Integer.parseInt(record.get(record.size() - 2)));
            stats.setTotalInfectedAmt(Integer.parseInt(record.get(record.size() - 1)));
            countries.add(stats);
            allData = countries;
        }
    }

    public List<CountryStats> getAllData() {
        return allData;
    }
}
