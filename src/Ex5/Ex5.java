package Ex5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj dodatnią liczbę większą od 1)");
        int liczbaUsera = scanner.nextInt();

        if (liczbaUsera > 1) {
        } else {
            System.out.println("Liczba jest mnijsza lub róna 1");
        }
    }
}

