package devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 -> category infatil
        // idade >= 15 && idade < 18 -> category juvenil
        // idade > 18 -> category adulto

        int age = 17;
        String category;

        if (age < 15) {
            category = "Categoria infantil";
        } else if (age >= 15 && age < 18) {
            category = "Categoria juvenil!";
        } else {
            category = "Categoria adulto!";
        }

        System.out.println(category);

    }
}