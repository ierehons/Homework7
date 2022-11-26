public class Main {
    public static void main(String[] args) {

        // Case 1
        System.out.println("Case 1");
        for (int i=0; i <= 10; i++) {
            System.out.println("Итеррация цикла " + i);
        }

        // Case 2
        System.out.println("Case 2");
        for (int f=10; f > 0; f--) {
            System.out.println("Итеррация цикла " + f);
        }

        //case 3
        System.out.println("case 3");
        for (int d=0; d < 17; d= d + 2) {
            System.out.println("Итеррация цикла " + d);
        }

        // case 4
        System.out.println("case 4");
        for (int g=10; g >= -10; g--) {
            System.out.println("Итеррация цикла " + g);
        }
    }
}