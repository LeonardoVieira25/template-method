public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;
    protected int horasExtras;

    public Funcionario(String nome, double salarioBase, int horasExtras) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    public abstract double calcularSalario();

    public String getInfo() {
        return "Nome: " + nome + ", Salário: " + calcularSalario();
    }
}
