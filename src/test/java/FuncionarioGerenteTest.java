import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FuncionarioGerenteTest {
    @Test
    void testCalcularSalario() {
        Funcionario gerente = new FuncionarioGerente("Maria", 2000.0, 5);
        double salarioCalculado = gerente.calcularSalario();
        assertEquals(2500.0, salarioCalculado, 0.001);
    }


    @Test
    void testSalarioMaximoHorasExtras() {
        Funcionario gerenteA = new FuncionarioGerente("Carlos", 2000.0, 100);
        double salarioCalculadoA = gerenteA.calcularSalario();

        Funcionario gerenteB = new FuncionarioGerente("Ana", 2000.0, 200);
        double salarioCalculadoB = gerenteB.calcularSalario();

        assertEquals(7000.0, salarioCalculadoA, 0.001);
        assertEquals(7000.0, salarioCalculadoB, 0.001);
    }
}
