public class Main {
    public static void main(String[] args) {

        int amount = 100; // расчет бонуса
        int score = 1200; // минимальная сумма для расчета бонусов
        int bonus = 1; // колличество бонуса
        int balance = 150; // начальный баланс


        if (score >= 1000) {
            System.out.println((score / amount * bonus) + score + balance + " Баланс счета");

        } else {
            System.out.println(score + balance + " Баланс счета");
        }


    }
}
