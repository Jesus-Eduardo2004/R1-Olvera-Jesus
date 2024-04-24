package mx.utng.jeoh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.jeoh.model.entity.ListaDeseosRegalo;
import mx.utng.jeoh.model.service.IListaDeseosRegaloService;

@Controller
@SessionAttributes("listaDeseosRegalo")
public class ListaDeseosRegaloController {
    
    @Autowired
    private IListaDeseosRegaloService service;

    @GetMapping({"/listaDeseosRegalo", "/listaDeseosRegalo/", "/listaDeseosRegalo/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Lista Deseos Regalos");
        model.addAttribute("listaDeseosRegalos", service.list());
        return "listaDeseosRegalo-list";
    }

    @GetMapping("/listaDeseosRegalo/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Lista Deseos Regalos");
        model.addAttribute("listaDeseosRegalo", new ListaDeseosRegalo());
        return "listaDeseosRegalo-form";
    }

    @PostMapping("/listaDeseosRegalo/form")
    public String save(@Valid ListaDeseosRegalo listaDeseosRegalo, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de lista deseos regalos");
            return "listaDeseosRegalo-form";
        }
        service.save(listaDeseosRegalo);
        return "redirect:/listaDeseosRegalo/list";
    }

    @GetMapping("/listaDeseosRegalo/form/{id}")
    public String update(@PathVariable Long id, Model model){
        ListaDeseosRegalo listaDeseosRegalo = null;
        if(id>0){
            listaDeseosRegalo = service.getById(id);
        }else{
            return "redirect:/listaDeseosRegalo/list";
        }
        model.addAttribute("title", "Editar Lista Deseos Regalos");
        model.addAttribute("listaDeseosRegalo", listaDeseosRegalo);
        return "listaDeseosRegalo-form";
    }

    @GetMapping("/listaDeseosRegalo/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id > 0){
            service.delete(id);
        }
        return "redirect:/listaDeseosRegalo/list";
    }



}
