package com.Udea.ciclo3.repositorios;

import com.Udea.ciclo3.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //anotacion que le dice a Spring que es repositorio
public interface RepositorioEmpresa extends JpaRepository <Empresa,Integer>{
}
