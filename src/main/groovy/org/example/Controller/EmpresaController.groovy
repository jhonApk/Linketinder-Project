package org.example.Controller

import org.example.Model.Empresa

class EmpresaController {
    List<Empresa> empresas = []

    EmpresaController() {
        empresas.add(new Empresa("Tech Solutions", "contato@tech.com", "SP", "Rua Marechal", "MA","sao luis", "12345678000195", "Brasil", "Consultoria TI", ["Java", "Kotlin"]))
        empresas.add(new Empresa("Tech Lab", "contato@tech.com", "SP", "Rua Marechal", "MA","sao luis", "12345678000195", "Brasil", "Consultoria TI", "Java"))
        empresas.add(new Empresa("Tech Hacking", "contato@tech.com", "SP", "Rua Marechal", "MA","sao luis", "12345678000195", "Brasil", "Consultoria TI", "Groovy"))
        empresas.add(new Empresa("Tech Security", "contato@tech.com", "SP", "Rua Marechal", "MA","sao luis", "12345678000195", "Brasil", "Consultoria TI", "Kotlin"))
        empresas.add(new Empresa("Tech Ui", "contato@tech.com", "SP", "Rua Marechal", "MA","sao luis", "12345678000195", "Brasil", "Consultoria TI", "Node.js"))
    }

    void listarEmpresas() {
        if (empresas.isEmpty()) {
            println "Nenhuma empresa cadastrada."
            return
        }
        println "======= Lista de Empresas ======"
        empresas.each { it.exibirEmpresa() }
    }

    void adicionarEmpresa(Empresa empresa) {
        empresas.add(empresa)
        println "Empresa ${empresa.nome} adicionada com sucesso!"
    }
}
