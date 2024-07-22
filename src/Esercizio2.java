import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao, inserisci una stringa");
        String stringa = scanner.nextLine();

        System.out.println("Ciao, inserisci un'altra stringa");
        String stringa2 = scanner.nextLine();

        System.out.println("Ciao, inserisci un ultima stringa");
        String stringa3 = scanner.nextLine();

        System.out.println(stringa + stringa2 + stringa3);
        System.out.println(stringa3 + stringa2 + stringa);


        scanner.close();


    }


}
