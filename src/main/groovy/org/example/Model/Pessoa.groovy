package org.example.Model

class Pessoa {
        String nome
        String email
        String endereco
        String cidade
        String cep
        String estado

        protected Pessoa(String nome, String email, String endereco, String cidade, String cep, String estado){
            this.nome = nome
            this.email = email
            this.endereco = endereco
            this.cidade = cidade
            this.cep = cep
            this.estado = estado
        }

}