package com.dammike.covid.covidtracker.controller;

import com.dammike.covid.covidtracker.services.CovidTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CovidTrackerController {

    @Autowired
    CovidTrackerService covidService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("allStats", covidService.getAllData());
        return "home";
    }
}
