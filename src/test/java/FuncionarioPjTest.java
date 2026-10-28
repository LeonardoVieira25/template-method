import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FuncionarioPjTest {

    @Test
    void testCalcularSalario() {
        Funcionario funcionarioPj = new FuncionarioPj("Leonardo", 1000.0, 1000);
        double salarioCalculado = funcionarioPj.calcularSalario();
        assertEquals(1000.0, salarioCalculado, 0.001);
    }
}
