package devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixos entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Gabriel";
        String address = "Espírito Santo";
        double salary = 2500.55;
        String dateReceivedSalary = "26/03/2025";

        System.out.println("Eu " + name + ", morando no endereço " + address +
                ", confirmo que recebi o salário de " + salary + ", na data " + dateReceivedSalary + ".");
    }
}
