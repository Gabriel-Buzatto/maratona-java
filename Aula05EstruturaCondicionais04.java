package devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais04 {
    public static void main(String[] args) {

        double salary = 65000;
        double firstTaxe = 9.70 / 100;
        double secondTaxe = 37.35 / 100;
        double thirdTaxe = 49.50 / 100;
        double valueTaxe;

        if (salary <= 34712) {
            valueTaxe = salary * firstTaxe;
        } else if (salary >= 34713 && salary <= 68507) {
            valueTaxe = salary * secondTaxe;
        } else {
            valueTaxe = salary * thirdTaxe;
        }

        System.out.println(valueTaxe);

    }
}
