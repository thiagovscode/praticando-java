import colecoesestream.ExercicioColecoes;
import heranca.Desenvolvedor;
import heranca.Funcionario;
import heranca.Gerente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Funcionario gerente = new Gerente("Thiago",1500);

        gerente.reajustarSalario(2);
        ((Gerente) gerente).setBonus(1000);
        gerente.exibirInformacoes();
        ((Gerente) gerente).aprovarProjeto("Uso de IA nos Codigos Java");

        Funcionario dev = new Desenvolvedor("Leonardo", 1200, "Java");
        dev.reajustarSalario();

        dev.exibirInformacoes();

    }








}