package com.hospital.management_system.dto;

import com.hospital.management_system.model.Consulta;

import java.util.List;

public class MedicoDto {
    private Long id;
    private String nome;
    private String sobrenome;
    private String especialidade;
    private String crm;
    private String telefone;
    private List<Consulta> consultas;
}
