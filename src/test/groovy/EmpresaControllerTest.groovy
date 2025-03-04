import org.example.Controller.EmpresaController
import org.example.Model.Empresa
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.junit.Assert.*

class EmpresaControllerTest {
    EmpresaController empresaController


    @BeforeEach
    void setUp() {
        empresaController = new EmpresaController()
    }

    @Test
    void testAdicionarEmpresa() {
        def empresa = new Empresa("Tech Solutions", "contato@tech.com", "SP", "Rua Marechal", "MA","sao luis", "12345678000195", "Brasil", "Consultoria TI", ["Java", "Kotlin"])

        empresaController.adicionarEmpresa(empresa)

        def empresas = empresaController.listarEmpresas()
        assertEquals(1, empresas.size())
        assertEquals("Tech Solutions", empresas[0].nome)
    }
}
