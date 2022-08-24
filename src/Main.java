public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
         byte car = 5;
         short apple = 10;
         int box = 15;
         long potato = 20L;
         float orange = 7f;
         double pineapple = 22.576;
         boolean cat = false;
         char c = 33;
         System.out.println(car);
        System.out.println(apple);
        System.out.println(box);
        System.out.println(potato);
        System.out.println(orange);
        System.out.println(pineapple);
        System.out.println(cat);
        System.out.println(c);
        // Задача 2.1
        System.out.println("Задача 2.1");
        float task1 = 27.12f;
        long task2 = 987678965549L;
        double task3 = 2.786;
        boolean task4 = false;
        short task5 = 569;
        short task6 = -159;
        short task7 = 27897;
        byte task8 = 67;
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
        System.out.println(task4);
        System.out.println(task5);
        System.out.println(task6);
        System.out.println(task7);
        System.out.println(task8);
        System.out.println("Задача 2.2");
        // Задача 2.2
        float boxerWeigth1 = 78.2f;
        float boxerWeigth2 = 82.7f;
        float totalWeigth = boxerWeigth1 + boxerWeigth2;
        System.out.println( " Общий вес двух бойцов равен " + totalWeigth + " кг. " );
        float weigthDifference = boxerWeigth2 - boxerWeigth1;
        System.out.println( " Разница в весе " + weigthDifference + " кг. " );
        System.out.println("Задача 3");
        // Задача 3
        byte lydmilaP = 23;
        byte annaS = 27;
        byte katrineA = 30;
        short paper = 480;
        short oneStudent = (short) (paper / (lydmilaP + annaS + katrineA));
        System.out.println( " На каждого ученика рассчитано " + oneStudent + " листов бумаги." );
        System.out.println("Задача 6");
        // Задача 6.
        float banana = 0.08f;
        float milk = 0.21f;
        float iceCream = 0.2f;
        float egg = 0.07f;
        float all = banana * 5 + egg * 4 + milk + iceCream;
        System.out.println( " Общий вес спорт-завтрака составил " + all + " кг. " );
        System.out.println("Задача 4");
        // Задача 4
        byte bottle = 16;
        short bottleInTwentyMinutes = (short) (bottle * 10);
        short bottleInOneDay = (short) (bottleInTwentyMinutes * 72);
        int bottleInThreeDays = bottleInOneDay * 3;
        int bottleInOneMonth = bottleInOneDay * 30;
        System.out.println( " За 20 минут было произвеедено " + bottleInTwentyMinutes + " бутылок " );
        System.out.println( " За один день минут было произвеедено " + bottleInOneDay + " бутылок " );
        System.out.println( " За три дня было произвеедено " + bottleInThreeDays + " бутылок " );
        System.out.println( " За месяц было произвеедено " + bottleInOneMonth + " бутылок " );
        System.out.println("Задача 5");
        // Задача 5
        byte classroom = 120 / (4+2);
        int whitePain = classroom * 2;
        int brownPain = classroom * 4;
        System.out.println( " В школе, где " + classroom + " классов, нужно " + whitePain + " банок белой краски и " + brownPain + " банок коричневой краски. " );
        System.out.println("Задача 7");
        // Задача 7.
        byte needToReset = 7;
        float each250 = 0.25f;
        float each500 = 0.5f;
        float purpose1 = needToReset / each250;
        float perpose2 = needToReset / each500;
        System.out.println(" Если спортсмен будет худеть по 250 грамм в день, то он достигнет своего рузельтата через " + purpose1 + " дней.А если по 500 грамм в день, то через " + perpose2 + " дней. " );
        float middle = (perpose2 + purpose1) / 2;
        System.out.println( " В среднем на достиженье результата уйдет " + middle + " день." );
        System.out.println("Задача 8.1");
        // Задача 8.1
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
        System.out.println("Задача 8.2");
        // Задача 8.2
        var hour = 640;
        var peopleInCompany = hour / 8;
        System.out.println( " Всего работников в комании - " + peopleInCompany + " человек. " );
        var people = 174;
        var hourOnePeople = hour / people;
        System.out.println( " Если в компании работает " + people + " человек, то всего " + hourOnePeople + " часа работы может быть поделено между сотрудниками " );




    }
}