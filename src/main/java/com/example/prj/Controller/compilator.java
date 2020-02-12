package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/Pyunik")
public class compilator {
    @GetMapping("/trener")
    public ModelAndView html111(){ return new ModelAndView("trener");
    }
    @GetMapping("/haxtanakner")
    public ModelAndView html112() { return new ModelAndView("haxtanakner");
    }
    @GetMapping("/xaxacox")
    public ModelAndView html113() { return new ModelAndView("xaxacox");
    }



}