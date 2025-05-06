package devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Valor padrão
        // byte, short, int, long, float, double = 0
        // chat '\u0000' ' '
        // boolean false
        // String null

        String[] names = new String[4];

        names [0] = "Gabriel";
        names [1] = "Leticia";
        names [2] = "Marianna";
        names [3] = "Vasco";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
