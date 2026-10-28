import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FuncionarioDesenvolvedorTest {
    @Test
    void testCalcularSalario() {
        Funcionario desenvolvedor = new FuncionarioDesenvolvedor("Leonardo", 1000.0, 100);
        double salarioCalculado = desenvolvedor.calcularSalario();
        assertEquals(1010.0, salarioCalculado, 0.001);
    }
}
