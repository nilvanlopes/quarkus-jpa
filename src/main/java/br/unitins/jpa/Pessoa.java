package br.unitins.jpa;


import java.sql.Date;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;




@Entity
public class Pessoa extends PanacheEntity {    
    public String sexo;
    public String nome_pessoa;
    public String endereco;
    public String endereco_cep;
    public String email_principal;
    public Date dtnascimento;
    public String estado_civil;
    public String fone_res;
    public String fone_com;
    public String num_pais_fone_cel;
    public String fone_cel;
    public String num_pais_fone_cel2;
    public String fone_cel2;
    public String observacao;
    public Date dtdesativacao;
    public String motivo_desativacao;
    public String profissao;
    public String doc_cpf;
    public String doc_rg;
    public String email_trabalho;
    public String fone_trabalho;
    
    public Pessoa() {
    }

  



}