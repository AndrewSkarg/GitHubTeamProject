package com.example.diploms.controller;

import com.example.diploms.model.Diploma;
import com.example.diploms.repository.DiplomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DiplomsController {
    @Autowired
    private DiplomaRepository repository;
    @GetMapping("/")
    public String getAllDiploms(Model model){
        List<Diploma> diploms = repository.findAll();
        model.addAttribute("diploms",diploms);
        return "index";
    }
    @PostMapping(value = "/add")
    public String saveDiploma(@ModelAttribute("diploma") Diploma diploma) {
        repository.save(diploma);
        return "redirect:/";
    }

}
