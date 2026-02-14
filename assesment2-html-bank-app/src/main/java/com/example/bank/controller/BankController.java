package com.example.bank.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

    @GetMapping("/bank/branches")
    public String showBranches(Model model) {

        model.addAttribute("bankName", "ABC National Bank");

        List<String> branches = Arrays.asList(
                "MG Road, Bangalore",
                "Indiranagar, Bangalore",
                "Whitefield, Bangalore",
                "Electronic City, Bangalore",
                "Jayanagar, Bangalore",
                "Rajajinagar, Bangalore",
                "Yelahanka, Bangalore",
                "Marathahalli, Bangalore",
                "BTM Layout, Bangalore",
                "Banashankari, Bangalore"
        );

        model.addAttribute("branches", branches);
        return "branches";
    }

    @GetMapping("/bank/services")
    public String showServices(Model model) {

        model.addAttribute("bankName", "ABC National Bank");

        List<String> services = Arrays.asList(
                "Savings Account",
                "Current Account",
                "Fixed Deposit",
                "Home Loan",
                "Personal Loan",
                "Net Banking",
                "Mobile Banking",
                "Credit Cards",
                "Debit Cards",
                "Locker Facility"
        );

        model.addAttribute("services", services);
        return "services";
    }
}