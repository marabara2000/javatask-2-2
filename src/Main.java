public class Main {
    public static void main(String[] args) {

        int account = 350;
        int payment = 1_500;
        int x = 1_000;
        int bonus;


        if (payment >= x) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int newAccount = account + payment + bonus;

        System.out.println(" Итоговый баланс " + newAccount);
        System.out.println(" В том числе бонусы: " + bonus);
    }

}
