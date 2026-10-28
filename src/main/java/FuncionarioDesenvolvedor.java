public class FuncionarioDesenvolvedor extends Funcionario {

    public FuncionarioDesenvolvedor(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase, horasExtras);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * 0.1);
    }

}
