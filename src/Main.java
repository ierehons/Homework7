public class Main {
    public static void main(String[] args) {

        // Case 1.1
        System.out.println("Case 1.1");
        for (int i=0; i <= 10; i++) {
            System.out.println("Итеррация цикла " + i);
        }

        // Case 1.2
        System.out.println("Case 1.2");
        for (int f=10; f > 0; f--) {
            System.out.println("Итеррация цикла " + f);
        }

        //case 1.3
        System.out.println("case 1.3");
        for (int d=0; d < 17; d= d + 2) {
            System.out.println("Итеррация цикла " + d);
        }

        // case 1.4
        System.out.println("case 1.4");
        for (int g=10; g >= -10; g--) {
            System.out.println("Итеррация цикла " + g);
        }

        // case 2.1
        System.out.println("case 2.1");
        for (int q = 1904; q <= 2096; q= q + 4) {
            System.out.println(q +" год является високосным");
        }

        //case 2.2
        System.out.println("case 2.2");
        for (int e = 7; e <= 98; e=e+7) {
            System.out.println("Последовательность " + e);
        }
        //case 2.3
        System.out.println("case 2.3");
        for (int k = 1; k <= 512; k=k*2) {
            System.out.println("Последовательность " + k);
        }
        // case 3.1
        System.out.println("case 3.1");
        int cash = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total=total+cash;
            System.out.println("Месяц "+ i + ", сумма накоплений равна "+ total+ " рублей");
        }

        //case 3.2
        System.out.println("case 3.2");
        int cash1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1 /100;
            total1 = total1 +cash1;
            System.out.println("Месяц "+ i + ", сумма накоплений равна "+ total1 + " рублей");
        }
    }
}