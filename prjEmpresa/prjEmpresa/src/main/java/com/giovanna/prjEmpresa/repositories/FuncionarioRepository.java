package com.giovanna.prjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanna.prjEmpresa.entities.Funcionario;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}