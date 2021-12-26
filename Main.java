public class Main {
    public static void main(String[] args) {

        int ticket = 101; // Стоимость билетов
        int payment = 20; // расчет бонусных миль
        int bonus; // кол-во бонусных миль

        if (ticket > 20) { bonus = (ticket / payment);
            System.out.println("Поздравляем Вы получили:");
            System.out.println(bonus + " бонусных миль");}
        else {        System.out.println("Бонусные мили не начисленны");
        }

    }
}