public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        int x = 1000;
        int i = 24;
        System.out.println("Moje dwie ostatnie cyfry indeksu to: " + i);

        do {System.out.print("\nLiczba "+x);
            if (x % i == 0) System.out.print(" jest podzielna przez "+i);
        }while (--x >= 0);


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        int[] tab1 = {12, 34, 5, 18, 40};
        double[] tab2 = {2, 5, 8, 13, 19};
        String[] tab3 = {"Dobrze", "wykonane", "cale", "zadanie", "drugie"};
        int a = 1;
        int b = 1;
        int c = 6;

        while (a < 6)
        {
            System.out.println(a+" wyraz tablicy to: "+tab1[a-1]);
            a++;
        }

        while(b < 6){
            System.out.println(b+" wyraz tablicy to: "+tab2[b-1]);
            b++;
        }

        while (c > 1){
            System.out.println((c-1)+" wyraz tablicy to: "+tab3[c-2]);
            c--;
        }


        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        int j;
        while (true){
            j = 40;
            System.out.println(j);
        }

        while (false){
            System.out.println("Nic sie nie wykona :( ");
            System.out.println(j);
        }


    }
}
