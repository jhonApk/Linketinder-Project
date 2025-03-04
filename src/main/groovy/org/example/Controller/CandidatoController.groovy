package org.example.Controller

import org.example.Model.Candidato

class CandidatoController {
    List<Candidato> candidatos = []

    CandidatoController() {
        candidatos.add(new Candidato("Carlos Silva", "carlos@email.com", "SP", "Rua 10", "São josé","0000-000", "12345678900", 25, "Desenvolvedor", ["Python", "Java"]))
        candidatos.add(new Candidato("Carlos Silva", "carlos@email.com", "SP", "Rua 10", "São josé","0000-000", "12345678900", 25, "Desenvolvedor", ["Python", "Java"]))
        candidatos.add(new Candidato("Carlos Silva", "carlos@email.com", "SP", "Rua 10", "São josé","0000-000", "12345678900", 25, "Desenvolvedor", ["Python", "Java"]))
        candidatos.add(new Candidato("Carlos Silva", "carlos@email.com", "SP", "Rua 10", "São josé","0000-000", "12345678900", 25, "Desenvolvedor", ["Python", "Java"]))
        candidatos.add(new Candidato("Carlos Silva", "carlos@email.com", "SP", "Rua 10", "São josé","0000-000", "12345678900", 25, "Desenvolvedor", ["Python", "Java"]))
    }

    void listarCandidatos() {
        if (candidatos.isEmpty()) {
            println "Nenhum candidato cadastrado."
            return
        }
        println "========== Lista de Candidatos =========="
        candidatos.each { it.exibirCandidato() }
    }

    void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato)
        println "Candidato ${candidato.nome} adicionado com sucesso!"
    }
}
