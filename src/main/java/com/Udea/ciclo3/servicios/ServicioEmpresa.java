package com.Udea.ciclo3.servicios;

import com.Udea.ciclo3.entidades.Empresa;
import com.Udea.ciclo3.repositorios.RepositorioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //anotacion para que Spring sepa que es un servicio
public class ServicioEmpresa {
    @Autowired//conectamos la clase con el repositorio de empresa
    RepositorioEmpresa repositorioEmpresa; // creamos objeto tipo RepositorioEmpresa para usar los metodos de la clase
//Metodo que retorna la lista de empresas usando los metodos heredados de jpaRepository
    public List<Empresa> getAllEmpresas(){
        List<Empresa> empresaList= new ArrayList<>();
        repositorioEmpresa.findAll().forEach(empresa -> empresaList.add(empresa)); // findAll devuelve un objeto iterable, lo rerremos para armar la lista
        return empresaList;
    }
//metodo que trae un objeto tipo empresa cuando cuento con el id de la misma
    public Empresa getEmpresaById(Integer id){
        return repositorioEmpresa.findById(id).get();

    }

    //Metodo para guardar o actualizar objetos tipo empresa
    public boolean saveOrUpdateEmpresa(Empresa empresa){
        Empresa emp=repositorioEmpresa.save(empresa);
        if(repositorioEmpresa.findById(emp.getId())!=null){
            return true;
        }
        return false;
    }
    //metodo delete
}
