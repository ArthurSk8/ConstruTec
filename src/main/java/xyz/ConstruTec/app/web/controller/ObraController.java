package xyz.ConstruTec.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import xyz.ConstruTec.app.dao.ObraDao;
import xyz.ConstruTec.app.dao.ClienteDao; // certifique-se que esse DAO existe
import xyz.ConstruTec.app.model.Obra;

@Controller
@RequestMapping("/obras")
public class ObraController {

    @Autowired
    private ObraDao obraDao;

    @Autowired
    private ClienteDao clienteDao;

    @GetMapping("/cadastrar")
    public String exibirFormularioCadastro(Model model) {
        model.addAttribute("obra", new Obra());
        model.addAttribute("clientes", clienteDao.findAll());
        return "obra/cadastro";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Obra obra) {
        obraDao.save(obra);
        return "redirect:/obras";
    }
}
