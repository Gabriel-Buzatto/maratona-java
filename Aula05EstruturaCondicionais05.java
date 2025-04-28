package devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais05 {
    public static void main(String[] args) {

        // imprima o dia da semana, considerando o 1 como domingo.

        // Switch usa apenas: char, int, byte, short, enum e String

        byte day = 5;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }

        char gender = 'M';

        switch (gender) {
            case 'M':
                System.out.println("Male");
            case 'F':
                System.out.println("Female");
            default:
                System.out.println("Invalid option!");
        }

    }
}
