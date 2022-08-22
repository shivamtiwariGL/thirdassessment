package com.example.demo.controller;



import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.CustomerRepo;

import com.example.demo.model.Customer;

@Controller

public class CustomerController

{

 @Autowired

 CustomerRepo repo;

 /*

 * @RequestMapping("/") public String home() { return "home"; }

 *

 * @RequestMapping("/addCustomer") public String addCustomer(Customer customer) {

 * repo.save(customer); return "home"; }

 */

 @RequestMapping("/customers")

 @ResponseBody

 public String getCustomers()

 {

 return repo.findAll().toString();

 }

 @RequestMapping("/customer/{customerId}")

 @ResponseBody

 public String getCustomer(@PathVariable("customerId")int customerId)

 {

 return repo.findById(customerId).toString();

 }

}

