package org.example.View

import org.example.Controller.CandidatoController
import org.example.Controller.EmpresaController
import org.example.Model.Candidato
import org.example.Model.Empresa


class MenuView {
    CandidatoController candidatoController
    EmpresaController empresaController
    Scanner scanner = new Scanner(System.in)

    MenuView(CandidatoController candidatoController, EmpresaController empresaController) {
        this.candidatoController = candidatoController
        this.empresaController = empresaController
    }

    void mostrarMenu() {
        while (true) {
            println("============== Seja Bem-Vindo ===============")
            println("1 - Login")
            println("2 - Registro")
            println("3 - Sair")
            print("Escolha uma opção: ")

            def opcao = scanner.nextInt()
            scanner.nextLine()

            switch (opcao) {
                case 1: login()
                    break
                case 2: registroOpcoes()
                    break
                case 3: println("Saindo ...")
                    return
                default: println("Opção inválida")
            }
        }
    }

    void login() {
        while (true) {
            println("========== Login ===========")
            println("1 - Empresa")
            println("2 - Candidato")
            println("3 - Voltar")
            print("Escolha uma opção: ")

            def opcaoLogin = scanner.nextInt()
            scanner.nextLine()

            switch (opcaoLogin) {
                case 1: opcoesEmpresa()
                    break
                case 2: opcoesCandidato()
                    break
                case 3: return
                default: println("Opção inválida")
            }
        }
    }

    void opcoesEmpresa() {
        while (true) {
            println("======== Menu Empresa ==========")
            println("1 - Listar Candidatos")
            println("2 - Sair")
            print("Escolha uma opção: ")

            def opcaoLogin = scanner.nextInt()
            scanner.nextLine()

            switch (opcaoLogin) {
                case 1: candidatoController.listarCandidatos()
                    break
                case 2: return
                default: println("Opção inválida!")
            }
        }
    }

    void opcoesCandidato() {
        while (true) {
            println("======== Menu Candidato ==========")
            println("1 - Listar Empresas")
            println("2 - Sair")
            print("Escolha uma opção: ")

            def opcaoLogin = scanner.nextInt()
            scanner.nextLine()

            switch (opcaoLogin) {
                case 1: empresaController.listarEmpresas()
                    break
                case 2: return
                default: println("Opção inválida!")
            }
        }
    }

    void registroOpcoes() {
        while (true) {
            println("======== Registro ==========")
            println("1 - Registrar novo Candidato")
            println("2 - Registrar Empresa")
            println("3 - Sair")
            print("Escolha uma opção: ")

            def opcaoLogin = scanner.nextInt()
            scanner.nextLine()

            switch (opcaoLogin) {
                case 1: adicionarCandidato()
                    break
                case 2: adicionarEmpresa()
                    break
                case 3: return
                default: println("Opção inválida!")
            }
        }
    }

    void adicionarCandidato() {
        println "Nome: "
        String nome = scanner.nextLine()
        println "Email: "
        String email = scanner.nextLine()
        println "CPF: "
        String cpf = scanner.nextLine()
        println "Idade: "
        int idade = scanner.nextInt()
        scanner.nextLine()
        println "Estado: "
        String estado = scanner.nextLine()
        println "Endereço: "
        String endereco = scanner.nextLine()
        println "Cidade: "
        String cidade = scanner.nextLine()
        println "CEP: "
        String cep = scanner.nextLine()
        println "Descrição: "
        String descricao = scanner.nextLine()
        println "Competencia: "
        List<String> competencias = scanner.nextLine()
        // ajustar para entrada dinamiica

        Candidato candidato = new Candidato(nome, email, estado, endereco, cidade, cep,  cpf, idade, descricao, competencias)

        candidatoController.adicionarCandidato(candidato)
        println("Candidato ${nome} cadastrado com sucesso!")
    }

    void adicionarEmpresa() {
        println "Nome da empresa: "
        String nome = scanner.nextLine()
        println "Email Corporativo: "
        String email = scanner.nextLine()
        println "CNPJ: "
        String cnpj = scanner.nextLine()
        println "País: "
        String pais = scanner.nextLine()
        println "Estado: "
        String estado = scanner.nextLine()
        println "Endereço: "
        String endereco = scanner.nextLine()
        println "Cidade: "
        String cidade = scanner.nextLine()
        println "CEP: "
        String cep = scanner.nextLine()
        println "Descrição: "
        String descricao = scanner.nextLine()

        List<String> competencias = ["Python", "Angular"] // ajustar para entrada dinamica

        Empresa empresa = new Empresa(nome, email, estado, cep, endereco, cidade,  cnpj, pais, descricao, competencias)
        empresaController.adicionarEmpresa(empresa)
        println("Empresa ${nome} cadastrada com sucesso!")
    }
}