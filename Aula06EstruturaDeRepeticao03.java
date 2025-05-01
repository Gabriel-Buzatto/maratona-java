package devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {

        // Imprima os primeiros 25 números de um determinado valor. Por exemplo, 50.

        int num_max = 50;

        for (int i = 0; i <= num_max; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);

        }
    }
}
