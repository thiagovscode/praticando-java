import colecoesestream.ExercicioColecoes;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ExercicioColecoes exer1 = new ExercicioColecoes();
        exer1.getFuncionarios();
        System.out.println(exer1.getFuncionarios());

        exer1.setFuncionarios(Arrays.asList("Thiago", "Jeane", "Leonardo", "Alexandre", "Maria"));
        System.out.println(exer1.getFuncionarios());



    }








}