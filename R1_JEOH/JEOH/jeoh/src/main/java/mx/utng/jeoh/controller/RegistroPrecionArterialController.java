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
import mx.utng.jeoh.model.entity.RegistroPrecionArterial;
import mx.utng.jeoh.model.service.IRegistroPrecionArterialService;

@Controller
@SessionAttributes("registroPrecionArterial")
public class RegistroPrecionArterialController {
    
    @Autowired
    private IRegistroPrecionArterialService service;

    @GetMapping({"/registroPrecionArterial", "/registroPrecionArterial/", "/registroPrecionArterial/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Registro Precion Arterial");
        model.addAttribute("registroPrecionArterials", service.list()); 
        return "registroPrecionArterial-list";
    }

    @GetMapping("/registroPrecionArterial/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Registro Precion Arterial");
        model.addAttribute("registroPrecionArterial", new RegistroPrecionArterial());
        return "registroPrecionArterial-form";
    }

    @PostMapping("/registroPrecionArterial/form")
    public String save(@Valid RegistroPrecionArterial registroPrecionArterial, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de registro precion arterial");
            return "registroPrecionArterial-form";
        }
        service.save(registroPrecionArterial);
        return "redirect:/registroPrecionArterial/list";
    }

    @GetMapping("/registroPrecionArterial/form/{id}")
    public String update(@PathVariable Long id, Model model){
        RegistroPrecionArterial registroPrecionArterial = null;
        if(id>0){
            registroPrecionArterial = service.getById(id);
        }else{
            return "redirect:/registroPrecionArterial/list";
        }
        model.addAttribute("title", "Editar Registro");
        model.addAttribute("registroPrecionArterial", registroPrecionArterial);
        return "registroPrecionArterial-form";
    }

    @GetMapping("/registroPrecionArterial/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id > 0){
            service.delete(id);
        }
        return "redirect:/registroPrecionArterial/list";
    }



}