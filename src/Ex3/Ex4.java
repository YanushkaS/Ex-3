package Ex3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex4 {

    private static final Scanner scanner = new Scanner(System.in);

    private static void main(String[] args) {


        System.out.println("Podaj dodatnią liczbe");
        int liczbaUser = scanner.nextInt();
        if (liczbaUser < 0) {
            do {
                System.out.println("Podłeś libe ujemną, podaj liczbe dodatnia");
                liczbaUser = scanner.nextInt();
            }
            while (liczbaUser > 0);

        }

    }
}
