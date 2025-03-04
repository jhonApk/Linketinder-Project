package org.example.Model


class Candidato extends Pessoa {
    String cpf
    int idade
    String descricao
    List<String> competencias

    Candidato(String nome, String email, String estado, String endereco, String cidade, String cep, String cpf, int idade, String descricao, List<String>competencias) {
        super(nome, email, endereco, cidade, estado, cep)
        this.cpf = cpf
        this.idade = idade
        this.endereco = endereco
        this.descricao = descricao
        this.estado = estado
        this.competencias = competencias
    }

    void exibirCandidato() {
        println "Nome: ${nome}, CPF: ${cpf}, Idade: ${idade}, Estado: ${estado}"
        println "Descrição: ${descricao}"
        println "Competências: ${competencias.join(', ')}"
        println()
    }
}
