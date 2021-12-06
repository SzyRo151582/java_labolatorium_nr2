public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */


        for (int x = 0; x <= 20; x++) {
            if (x == 15)
                break;
            System.out.print(x + " ");
        }

        System.out.println("\n");

        for (int y = 0; y <= 15; y++) {
            if (y % 5 == 0)
                continue;
            System.out.print(y + " ");
        }

        System.out.println("\n");

        for (int z = 0; z <= 80; z++) {
            if (z == 55)
                return;
            System.out.print(z + " ");
        }

    }
}
