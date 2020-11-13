package com.stress.stress.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/v1/pmc_services")
public class TestController {

    @PostMapping("/core_services/debts_details")
    Object getDebtsDetails() {
        Resource resource = new ClassPathResource("/static/json/debtsDetails.json");
        try {
            return getObject(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/core_services/{pathParam}/categories")
    Object getCategories() {
        Resource resource = new ClassPathResource("/static/json/categories.json");
        try {
            return getObject(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/core_services/subscriptions")
    Object getAllResponsesToSubscriptions() {
        return true;
    }

    @GetMapping("/core_services/{pathParam1}/categories/{pathParam2}/companies/{pathParam3}")
    Object getOneCompany() {
        Resource resource = new ClassPathResource("/static/json/oneCompanies.json");
        try {
            return getObject(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/core_services/{pathParam1}/companies")
    Object getAllCompanies() {
        Resource resource = new ClassPathResource("/static/json/allCompanies.json");
        try {
            return getObject(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/core_services/{pathParam1}/categories/{pathParam2}/companies")
    Object getAllCompaniesCategory() {
        Resource resource = new ClassPathResource("/static/json/allCompaniesCategory.json");
        try {
            return getObject(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/core_services/invoices_details")
    Object getInquiryCompanyCustomerInvoice() {
        Resource resource = new ClassPathResource("/static/json/invoiceDetails.json");
        try {
            return getObject(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/wallet_services/payments")
    Object getPaymentsWithOutCVV2() {
        Resource resource = new ClassPathResource("/static/json/paymentService.json");
        try {
            return getObject(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/partners/payments")
    Object getPaymentsWithCVV2() {
        Resource resource = new ClassPathResource("/static/json/paymentService.json");
        try {
            return getObject(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected Object getObject(Resource resource) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(resource.getInputStream(), Object.class);
    }

}