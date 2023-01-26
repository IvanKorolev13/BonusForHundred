public class OneForHundred {

    public static void main(String[] args) {
        int startAccount = 1150; //сумма в начале на счету
        int addedAmount = 1000; //сумма пополнения

        // первый длинный вариант с функцией if-else
        //int BonusAmount;
        //if (addedAmount > 1000) {
        //    BonusAmount = addedAmount / 100;
        //} else{
        //    BonusAmount = 0;
        //}

        // второй короткий вариант (тернарное)
        int BonusAmount = addedAmount > 1000 ? addedAmount / 100 : 0; //бонус начилсяется на каждые 100 при пополнении более 1000
        int finishAccount = startAccount + addedAmount + BonusAmount; //итоговая сумма= на начало+ пополнение+ бонус

        System.out.println("Сумма на счете: " + finishAccount + " руб. (из них БОНУС- " + BonusAmount + " руб.)");
        System.out.println("Бонусная программа: БЕСПЛАТНЫЙ РУБЛЬ за каждую сотню (при условии пополнения счета на сумму более 1000 руб.)");
    }
}
