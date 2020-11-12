package com.stress.stress.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class TestController {

    //no esta disponible
    @PostMapping("/v1/pmc_services/core_services/debts_details")
    Object getDebtsDetails() {
        Resource resource = new ClassPathResource("/static/json/debtsDetails.json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resource.getInputStream(), Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/v1/pmc_services/core_services/{variable1}/categories")
    Object getCategories() {
        Resource resource = new ClassPathResource("/static/json/categories.json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resource.getInputStream(), Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //no esta disponible
    @PostMapping("/v1/pmc_services/core_services/subscriptions1")
    Object addAdhesion() {
        Resource resource = new ClassPathResource("/static/json/addAdhesion.json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resource.getInputStream(), Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //no esta disponible
    @PostMapping("/v1/pmc_services/core_services/subscriptions2")
    Object modifyAdhesion() {
        Resource resource = new ClassPathResource("/static/json/modifyAdhesion.json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resource.getInputStream(), Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    //no esta disponible
    @PostMapping("/v1/pmc_services/core_services/subscriptions3")
    Object deleteAdhesion() {
        Resource resource = new ClassPathResource("/static/json/deleteAdhesion.json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resource.getInputStream(), Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/v1/pmc_services/core_services/{variable1}/categories/{variable2}}/companies/{variable3}")
    Object getCompanies() {
        Resource resource = new ClassPathResource("/static/json/oneCompanies.json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resource.getInputStream(), Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/v1/pmc_services/core_services/{variable1}/companies")
    Object getAllCompanies() {
        Resource resource = new ClassPathResource("/static/json/allCompanies.json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resource.getInputStream(), Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/v1/pmc_services/core_services/{variable1}/categories/{variable2}/companies")
    Object getAllCompaniesCategory() {
        Resource resource = new ClassPathResource("/static/json/allCompaniesCategory.json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resource.getInputStream(), Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
