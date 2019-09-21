package com.anderson.gc.controller;

import com.anderson.gc.model.Convidados;
import com.anderson.gc.repository.ConvidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class ConvidadosController {

    @Autowired
    private ConvidadosRepository convidadosRepository;

    @GetMapping
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView("ListarConvidados");
        mv.addObject("convidados", convidadosRepository.findAll());
        mv.addObject("conv_form", new Convidados());
        return mv;
    }

    @PostMapping("/salvar")
    public ModelAndView salvar(Convidados convidados){
        convidadosRepository.save(convidados);
        return listar();
    }
}
