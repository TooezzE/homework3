public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 10;
        short b = 20000;
        int c = 100000;
        long d = 1234567890L;
        float e = 0.7F;
        double f = 143.7586261;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float x = 27.12F;
        long m = 987678965549L;
        float h = 2.786F;
        short y = 569;
        short n = -159;
        short l = 27897;
        byte p = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte pupilsLP = 23;
        byte pupilsAS = 27;
        byte pupilsES = 30;
        int allSheets = 480;
        int sheetsToPupil = allSheets/(pupilsAS + pupilsES + pupilsLP);
        System.out.println("На каждого ученика рассчитано " + sheetsToPupil + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int carProductivity1Min = 16/2;
        int productivity20Min = carProductivity1Min * 20;
        int productivity1Day = carProductivity1Min * 60 * 24;
        int productivity3Days = productivity1Day * 3;
        int productivity1Month = productivity3Days * 10;
        System.out.println("За 20 минут машина произвела " + productivity20Min + " штук бутылок");
        System.out.println("За 1 день машина произвела " + productivity1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivity3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + productivity1Month + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int paintBanks = 120;
        int whiteBanksFor1Class = 2;
        int brownBanksFor1Class = 4;
        int classesCount = paintBanks/(whiteBanksFor1Class + brownBanksFor1Class);
        int whiteBanksBought = classesCount * whiteBanksFor1Class;
        int brownBanksBought = classesCount * brownBanksFor1Class;
        System.out.println("В школе, где " + classesCount + " классов, нужно " + whiteBanksBought + " банок белой краски и " + brownBanksBought + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        int bananaWeightGr = 80;
        int oneMilkWeightGr = 105;
        int iceCreamWeightGr = 100;
        int eggWeightGr = 70;
        int breakfastWeightGr = bananas*bananaWeightGr + milk*oneMilkWeightGr + iceCream*iceCreamWeightGr + eggs*eggWeightGr;
        int breakfastWeightKg = breakfastWeightGr/1000;
        System.out.println("Вес завтрака " + breakfastWeightGr + " грамм или " + breakfastWeightKg + " килограмм");
    }

        public static void task7() {
            System.out.println("Задача 7");
            int needLoseWeightKg = 7;
            int timeIfLose250GrADay = (needLoseWeightKg * 1000)/250;
            int timeIfLose500GrADay = timeIfLose250GrADay/2;
            int averageTimeToLose = (timeIfLose500GrADay + timeIfLose250GrADay)/2;
            System.out.println("Если терять в весе 250г/день, то понадобится " + timeIfLose250GrADay + " дней, а если 500г/день, то " + timeIfLose500GrADay);
            System.out.println("В среднем понадобится " + averageTimeToLose + " дней");
    }

        public static void task8() {
            System.out.println("Задача 8");
            int salaryMasha = 67760;
            int salaryDenis = 83690;
            int salaryKristina = 76230;
            int yearSalaryMasha = salaryMasha*12;
            int yearSalaryDenis = salaryDenis*12;
            int yearSalaryKristina = salaryKristina*12;
            float salaryBoost = 1.1F;
            float newSalaryMasha = salaryMasha*salaryBoost;
            float newSalaryDenis = salaryDenis*salaryBoost;
            float newSalaryKristina = salaryKristina*salaryBoost;
            float newYearSalaryMasha = newSalaryMasha*12;
            float newYearSalaryDenis = newSalaryDenis*12;
            float newYearSalaryKristina = newSalaryKristina*12;
            float yearSalaryDiffMasha = newYearSalaryMasha - yearSalaryMasha;
            float yearSalaryDiffDenis = newYearSalaryDenis - yearSalaryDenis;
            float yearSalaryDiffKristina = newYearSalaryKristina - yearSalaryKristina;
            System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearSalaryDiffMasha + " рублей.");
            System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearSalaryDiffDenis + " рублей.");
            System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + yearSalaryDiffKristina + " рублей.");
    }
}