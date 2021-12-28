import java.util.Scanner;

public class Main {

    public static void metoda1(int[] tab1)
    {
        int j = 0;
        for (int i = 40; i >= 20; i--)
        {
            tab1[j] = i;
            j++;
            if(j > tab1.length)
                break;
        }
    }

    public static void metoda2(int[] tab1) {
        for (int i = 0; i < tab1.length; i++)
        {
            System.out.print(tab1[i] + " ");
        }
        System.out.print("\n");
    }

    public static void metoda3(String[] tab2)
    {
        Scanner scan = new Scanner(System.in);
        int j = 0;

        for (int i = 0; i < tab2.length; i++)
        {
            System.out.println("Napisz dowolne slowo: ");
            String slowo = scan.next();
            tab2[j] = slowo;
            j++;
        }

    }

    public static void metoda4(String[] tab2)
    {
        int j = 5;

        for (int i = 0; i < tab2.length; i++)
        {
            System.out.print(tab2[j] + " ");
            j--;
        }
        System.out.print("\n");
    }

    public static void metoda5(String imie)
    {
        System.out.println("Nazywam sie: " + imie);
    }

    public static void metoda5(String imie, String nazwisko)
    {
        System.out.println("Nazywam sie: " + imie + " " + nazwisko);
    }

    public static void metoda5(String imie, String nazwisko, int wiek)
    {
        System.out.println("Nazywam sie: " + imie + " " + nazwisko);
        System.out.println("Mam " + wiek + " lat.");
        System.out.print("\n");
    }

    public static int metoda6(int l1, int l2)
    {
        int wynik  = l1 + l2;
        System.out.println("Wynik sumowania twoich cyfr wynosi: " + wynik);
        return wynik;
    }

    public static int metoda6(int l1, int l2, int l3)
    {
        int wynik  = l1 + l2 + l3;
        System.out.println("Wynik sumowania twoich innych cyfr wynosi: " + wynik);
        return wynik;
    }

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        int tablica1 = 21;
        int tab1[] = new int[tablica1];

        metoda1(tab1);
        metoda2(tab1);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        String[] tablica2 = new String[6];

        metoda3(tablica2);
        metoda4(tablica2);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        String imie = "Szymon";
        String nazwisko = "Roda";
        int wiek = 21;

        metoda5(imie);
        metoda5(imie, nazwisko);
        metoda5(imie, nazwisko, wiek);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        int zmiennaA = metoda6(1, 2);
        int zmiennaB = metoda6(7, 8, 9);
        System.out.print("wynik: " + (metoda6(8, 9) + metoda6(2, 3, 4)));


    }

}
