public class Main {
    public static void main(String[] args) {
        // Задача 1
        // byte car = 5;
        // short apple = 10;
        // int box = 15;
        // long potato = 20L;
        // float orange = 7f;
        // double pineapple = 22.576;
        // Выдает ошибку при коммите, решил сделать это задание как комментарий.
        // Задача 2
        float boxerWeigth1 = 78.2f;
        float boxerWeigth2 = 82.7f;
        float totalWeigth = boxerWeigth1 + boxerWeigth2;
        System.out.println( " Общий вес двух бойцов равен " + totalWeigth + " кг. " );
        float weigthDifference = boxerWeigth2 - boxerWeigth1;
        System.out.println( " Разница в весе " + weigthDifference + " кг. " );
        // Задача 3
        float banana = 0.08f;
        float milk = 0.21f;
        float iceCream = 0.2f;
        float egg = 0.07f;
        float all = banana * 5 + egg * 4 + milk + iceCream;
        System.out.println( " Общий вес спорт-завтрака составил " + all + " кг. " );
        // Задача 4
        byte needToReset = 7;
        float each250 = 0.25f;
        float each500 = 0.5f;
        float purpose1 = needToReset / each250;
        float perpose2 = needToReset / each500;
        System.out.println(" Если спортсмен будет худеть по 250 грамм в день, то он достигнет своего рузельтата через " + purpose1 + " дней.А если по 500 грамм в день, то через " + perpose2 + " дней. " );
        float middle = (perpose2 + purpose1) / 2;
        System.out.println( " В среднем на достиженье результата уйдет " + middle + " день." );
        // Задача 5
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int percentM = Masha * 10 / 100;
        int percentD = Denis * 10 / 100;
        int percentK = Kristina * 10 / 100;
        int salaryM = Masha + percentM;
        int salaryD = Denis + percentD;
        int salaryK = Kristina + percentK;
        System.out.println( " Маша теперь получает " + salaryM + " рублей.Её доход вырос на " + percentM + " рублей. " );
        System.out.println( " Денис теперь получает " + salaryD + " рублей.Её доход вырос на " + percentD + " рублей. " );
        System.out.println( " Кристина теперь получает " + salaryK + " рублей.Её доход вырос на " + percentK + " рублей. " );
        // Задание выполнено
        // Задание 8
        var hour = 640;
        var peopleInCompany = hour / 8;
        System.out.println( " Всего работников в комании - " + peopleInCompany + " человек. " );
        var people = 174;
        var hourOnePeople = hour / people;
        System.out.println( " Если в компании работает " + people + " человек, то всего " + hourOnePeople + " часа работы может быть поделено между сотрудниками " );




    }
}