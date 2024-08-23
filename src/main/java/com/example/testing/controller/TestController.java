package com.example.testing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.testing.model.CustomerModel;
import com.example.testing.service.CustService;

@Controller
public class TestController {

    @Autowired
    private CustService custService;

    @RequestMapping("/")
    public ModelAndView testinG() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
    
    @RequestMapping("/Customer")
    public ModelAndView Customer() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("customer");
        return mv;
    }
    
    @RequestMapping("/table")
    public ModelAndView tablE() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("table");
        return mv;
    }
    
    @RequestMapping("/saveCustomer")
    public ModelAndView saveCustomer(@RequestParam("customerName") String customerName,
                                     @RequestParam("address") String address,
                                     @RequestParam("status") String status) {
        CustomerModel customer = new CustomerModel();
        customer.setCustName(customerName);
        customer.setAddresS(address);
        customer.setStatuS(status);
        
        custService.saveCustomer(customer);
        
        return new ModelAndView("redirect:/Customer");
    }
}
