public class FuncionarioPj extends Funcionario {

    public FuncionarioPj(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase, horasExtras);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

}
