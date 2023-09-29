package com.faber.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faber.model.Usuario;
@Repository
public interface IUsuarioRepo extends JpaRepository<Usuario ,Integer>{

}
