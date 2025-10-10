package heranca;

public class Gerente  extends Funcionario implements Aprovador{

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

    @Override
    public void calcularPLR() {
        System.out.println("PLR do Gerente");
    }

    @Override
    public void aprovarProjeto(String nomeProjeto) {

        System.out.printf("Gerente: %s aprovou o projeto %s", nome, nomeProjeto);

    }
}
