import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj rozmiar kolejki: ");
        int rozmiar = scanner.nextInt();

        Queue kolejka = new Queue();
        
        for (int i = 0; i < rozmiar; i++) {
            System.out.print("Podaj liczbę: ");
            int liczba = scanner.nextInt();
            kolejka.dodaj(liczba);
        }

        System.out.println("Usuwanie elementów z kolejki:");
        for (int i = 0; i < rozmiar; i++) {
            System.out.println(kolejka.usun());
        }

        scanner.close();
    }
}
