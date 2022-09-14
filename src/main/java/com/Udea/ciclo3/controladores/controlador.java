package com.Udea.ciclo3.controladores;

import com.Udea.ciclo3.entidades.Empresa;
import com.Udea.ciclo3.servicios.ServicioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class controlador {
    @Autowired
    ServicioEmpresa servicioEmpresa;

    @GetMapping({"/Empresas", "/VerEmpresas"})
    public String verEmpresas(Model model){
        List<Empresa> listaEmpresas=servicioEmpresa.getAllEmpresas();
        model.addAttribute("emplist",listaEmpresas);
        return "verEmpresas";
    }
}
