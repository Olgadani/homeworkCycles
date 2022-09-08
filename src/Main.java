public class Main {
    public static void main(String[] args) {
        System.out.println("Task1-1");
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }
        System.out.println("Task1-2");
        for (int j = 10; j > 0; j--){
            System.out.println(j);
        }
        System.out.println("Task1-3");
        for (int i = 0; i < 17; i+=2){
            System.out.println(i);
        }
        System.out.println("Task1-4");
        for (int j = 10; j > -11; j-=2){
            System.out.println(j);
        }
        System.out.println("Task2-1");
        for (int i = 1904; i < 2097; i+=4){
            System.out.println(i + "год является високосным");
        }
        System.out.println("Task2-2");
        for (int i = 7; i < 99; i+=7){
            System.out.print(i + " ");}
        System.out.println("Task2-3");
        for (int i = 1; i < 513; i*=2){
            System.out.print(i + " ");}
        System.out.println("Task3-1");
        int sumForMonth = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++){
            total += sumForMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Task3-2");
        int forMonth = 29000;
        int total1 = 0;
        for (int i = 1; i < 13; i++){
            total1 += forMonth / 12;
            total1 += forMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }
    }
}