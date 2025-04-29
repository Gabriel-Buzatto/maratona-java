package devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {

        // Imprima todos os números pares de 0 até 1.000.000

        int num = 0;

        while (num <= 1000000) {
            num++;
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

    }
}
