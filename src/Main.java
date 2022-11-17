public class Main {
    public static void main(String[] args) {
        int score = 86;
        int depositAccount = 1274;

        int bonus;

        if (depositAccount > 1000) {
            bonus = depositAccount / 100;
        } else {
            bonus = 0;
        }
        int balance = score + depositAccount + bonus;
        System.out.println("Итоговый счет: " + balance + " руб.");
        System.out.println("Бонус: " + bonus + " руб.");
    }
}