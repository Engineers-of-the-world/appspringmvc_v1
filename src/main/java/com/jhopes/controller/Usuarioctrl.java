/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author P&D
 */
@Controller
public class Usuarioctrl {

    public Usuarioctrl() {
    }

    /*@RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        model.addAttribute("hola", "Hola Spring MVC");
        return "home";
    }*/
    @RequestMapping(value = "/home")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("name", "JOEL PEREZ");
        return mv;
    }

    @RequestMapping(value = "/persona", method = RequestMethod.POST)
    public ModelAndView persona(HttpServletRequest request) {
        String name = request.getParameter("f_name");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("persona");
        mv.addObject("f_name", name);
        return mv;
    }

}
