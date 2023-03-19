public class Main {
    public static void main(String[] args) {

        int z = 100; // расчет бонуса
        int y = 1200; // минимальная сумма для расчета бонусов
        int a = 1; // колличество бонуса
        int x = 150; // начальный баланс


        if (y >= 1000) {
            System.out.println((y / z * a) + y + x + " Баланс счета");

        } else {
            System.out.println(y + x + " Баланс счета");
        }


    }
}
