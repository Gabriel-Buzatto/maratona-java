package devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number01 + number02;

        System.out.println(result);

        // %
        int resto = 21 % 7;

        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 10;
        boolean isDezDiferenteQueVinte = 10 != 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezDiferenteQueVinte);

        // && (AND)
        int age = 21;
        float salary = 4500F;
        boolean isDentroDaLeiMaiorQuetrinta = age >= 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;

        System.out.println(isDentroDaLeiMaiorQuetrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        // || (OR)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlayCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println(isPlayCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1880; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        System.out.println(contador);
    }
}
