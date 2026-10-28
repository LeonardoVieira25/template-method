public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase, horasExtras);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + Math.min(100, horasExtras) * 50;
    }

}
