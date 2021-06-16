package com.group6.wecanTrekk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller

public class LandingPageController {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private RegionRepository regionRepo;
    @Resource
    private TrekkRepository trekkRepo;



    @GetMapping("/wecantrekit")
    public String wecantrekit(@RequestParam(name="name", required = false, defaultValue="world") String name, Model model){
        model.addAttribute("TrekModel", trekkRepo.findAll());
        model.addAttribute("ContinentModel", continentRepo.findAll());
        return "landingpage";

    }

    @GetMapping("/contact")
    public String contact(@RequestParam(name = "contact", required = false, defaultValue = "!") String contact, Model model) {
        model.addAttribute("contact", contact);
        return "contactus";

    }
}
