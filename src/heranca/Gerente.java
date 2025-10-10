package heranca;

public class Gerente  extends Funcionario{

    private double bonus;


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public void exibirInformacoes() {
        System.out.printf("Gerente: %s - Salario %.2f - bonus: %.2f",
                nome,salario,bonus);
    }
}
