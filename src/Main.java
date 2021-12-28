import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void noweZwierze(List<String> lista1)
    {
        for (int i = 0; i < 8; i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj nazwe nowego zwierzecia: ");
            String zwierze = scan.nextLine();
            lista1.add(zwierze);
        }
    }
    
    public static void listaZwierzat(List<String> lista1)
    {
        for (String zmienna : lista1)
        {
            System.out.print(zmienna + " ");
        }
        System.out.println("\n");
    }

    public static void zmianaListy(List<String> lista1)
    {
        lista1.remove(7);
        lista1.remove(6);

        for (int i = 0; i <= 2; i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj nazwe nowego zwierzecia: ");
            String zwierze = scan.nextLine();
            lista1.add(zwierze);
        }

        for (String zmienna : lista1)
        {
            System.out.print(zmienna + " ");
        }

        System.out.println(lista1.size());
    }

    public static void sortowanieListy(List<String> lista1)
    {
        Collections.sort(lista1, Collections.reverseOrder());
    }

    public static void noweLiczby(Set<Integer> lista2)
    {
        for (int i = 0; i < 10; i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj nowa liczbe: ");
            int liczba = scan.nextInt();
            lista2.add(liczba);
        }
    }

    /*public static void sortowanieListy(Set<Integer> lista2)
    {
        Collections.sort(lista2);
    }*/

    public static void listaLiczb(Set<Integer> lista2)
    {
        int i = 1;

        for (int zmienna : lista2)
        {
            System.out.print(i + ":" + zmienna + " ");
            i++;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

        List<String> zwierzeta = new ArrayList<>();

        noweZwierze(zwierzeta);
        listaZwierzat(zwierzeta);
        zmianaListy(zwierzeta);
        sortowanieListy(zwierzeta);
        listaZwierzat(zwierzeta);


         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        Set<Integer> liczby = new TreeSet<>();
        noweLiczby(liczby);
        //sortowanieListy(liczby);
        listaLiczb(liczby);

    }
}
