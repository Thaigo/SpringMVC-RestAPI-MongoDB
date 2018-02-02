package com.auth.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.auth.entity.Perfil;

@Repository
public interface PerfilRepository extends MongoRepository<Perfil, String> {

}
