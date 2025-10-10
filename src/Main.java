import colecoesestream.ExercicioColecoes;
import heranca.Desenvolvedor;
import heranca.Gerente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Gerente gerente = new Gerente("Thiago",1500);
        gerente.exibirInformacoes();
        gerente.reajustarSalario(2);
        gerente.setBonus(1000);

        Desenvolvedor dev = new Desenvolvedor("Leonardo", 1200, "Java");
        dev.exibirInformacoes();

    }








}