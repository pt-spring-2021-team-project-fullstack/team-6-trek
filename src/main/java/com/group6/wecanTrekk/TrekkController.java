package com.group6.wecanTrekk;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TrekkController {
    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private RegionRepository regionRepo;


    @RequestMapping("/trekk")
    public String displayAllTrekks (Model model){
        model.addAttribute("TrekkModel",continentRepo.findAll(),regionRepo.findAll());
        return "TrekkView";

    }
}