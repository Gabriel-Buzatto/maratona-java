package devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {

        int age = 20;
        boolean isAutorizadoComprarBebida = age >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida!");
        } else {
            System.out.println("Não autorizado a comprar bebida!");
        }

    }
}
