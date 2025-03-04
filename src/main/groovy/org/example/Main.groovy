package org.example

import org.example.Controller.CandidatoController
import org.example.Controller.EmpresaController
import org.example.View.MenuView

static void main(String[] args) {
    CandidatoController candidatoController = new CandidatoController()
    EmpresaController empresaController = new EmpresaController()
    MenuView view = new MenuView(candidatoController, empresaController)

    view.mostrarMenu()
}