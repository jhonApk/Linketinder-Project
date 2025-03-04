import org.example.Controller.CandidatoController
import org.example.Model.Candidato

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.junit.Assert.*

class CandidatoControllerTest {

    CandidatoController candidatoController


    @BeforeEach
    void setUp() {
        candidatoController = new CandidatoController()
    }

    @Test
    void testAdicionarCandidato() {
        def candidato = new Candidato("Jhon Silva", "carlos@email.com", "SP", "Rua 10", "São josé","0000-000", "12345678900", 25, "Desenvolvedor",["Java", "Kotlin"])

        candidatoController.adicionarCandidato(candidato)

        def candidatos = candidatoController.listarCandidatos()
        assertEquals(1, candidatos.size())
        assertEquals("Carlos Silva", candidatos[0].nome)
    }
}