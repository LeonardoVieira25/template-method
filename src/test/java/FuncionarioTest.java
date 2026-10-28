import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    void testCalcularSalarioDesenvolvedor() {
        Funcionario desenvolvedor = new FuncionarioDesenvolvedor("Leonardo", 1000.0, 100);

        assertEquals("Nome: Leonardo, Salário: 1010.0",
                desenvolvedor.getInfo());
    }

    @Test
    void testCalcularSalarioGerente() {
        Funcionario gerente = new FuncionarioGerente("Maria", 2000.0, 5);
        assertEquals("Nome: Maria, Salário: 2250.0",
                gerente.getInfo());
    }

    @Test
    void testCalcularSalarioPj() {
        Funcionario funcionarioPj = new FuncionarioPj("Leonardo", 1000.0, 1000);
        assertEquals("Nome: Leonardo, Salário: 1000.0",
                funcionarioPj.getInfo());
    }
}
