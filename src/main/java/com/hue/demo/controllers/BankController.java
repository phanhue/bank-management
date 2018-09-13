package com.hue.demo.controllers;

import com.hue.demo.dao.models.Bank;
import com.hue.demo.dto.BankDTO;
import com.hue.demo.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
    @Autowired
    private BankService bankService;

    @GetMapping(value = "/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @GetMapping(value = "/add")
    public ModelAndView add(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("add");
        mav.addObject("bank", new BankDTO());
        return mav;

    }
    @PostMapping(value = "/add-process")
    public  ModelAndView addProcess(BankDTO bankDTO){
        System.out.println(bankDTO);
        bankService.addBank(bankDTO );
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/add");
        return mav;
    }
}
