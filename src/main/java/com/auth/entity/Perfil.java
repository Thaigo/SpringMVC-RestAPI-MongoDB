package com.auth.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Perfil {

    @Id
    private String id;

    private String nome;

}
