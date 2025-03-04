package org.example.Model

class Empresa extends Pessoa {
    String cnpj
    String pais
    String descricao
    List<String> competencias

    Empresa(String nome, String email, String estado, String cep, String endereco, String cidade, String cnpj, String pais, String descricao, List<String> competencias) {
        super(nome, email, endereco, cidade, estado, cep)
        this.cnpj = cnpj
        this.pais = pais
        this.descricao = descricao
        this.competencias = competencias
    }

    void exibirEmpresa() {
        println "Nome: ${nome}, CNPJ: ${cnpj}, País: ${pais}, Estado: ${estado}"
        println "Descrição: ${descricao}"
        println "Competências Desejadas: ${competencias.join(', ')}"
        println()
    }
}