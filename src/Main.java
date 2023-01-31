public class Main {
    public static void main(String args[]){
        System.out.println("Lesson 1");
        System.out.println("-----------------------------------------");
        System.out.println("Task 1");
        System.out.println("-----------------------------------------");
        int a = 1;
        byte b = 124;
        long c = 132469856;
        short d = -1234;
        float e = (float)2.4148;
        double f = -0.55132156;
        char g = 65532;
        boolean h = 15 > 2;
        boolean i = 15 < 2;
        System.out.println("Целочисленная переменная a = " + a + ", целочисленная переменная b = " + b + ", целочисленная переменная c = " + c + ", целочисленная переменная d = " + d);
        System.out.println("Переменная с плавающей точкой e = " + e + ", переменная с плавающей точкой f = " + f + ", символ g = " + g + ", утверждение 15 > 2 = " + h + ", утверждение 15 < 2 = " + i);
        System.out.println("----------------------------------------");
        System.out.println("Task 2");
        System.out.println("----------------------------------------");
        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        double boxerWeightBoth = boxerWeight1 + boxerWeight2;
        double boxerWeightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Общий вес двух бойцов составляет " + boxerWeightBoth);
        System.out.println("Разница между весами бойцов составляет " + boxerWeightDifference);
        System.out.println("----------------------------------------");
        System.out.println("Task 3");
        System.out.println("----------------------------------------");
        int bananaWeightGramm = 5 * 80;
        double milkWeightGramm = 200 * 1.05;
        int icecreamWeightGramm = 2 * 100;
        int eggGramm = 4 * 70;
        int breakfastMassGramm = bananaWeightGramm + (int)milkWeightGramm + icecreamWeightGramm + eggGramm;
        double breakfastMassKilo = (double)breakfastMassGramm / 1000;
        System.out.println("Общий вес спорт-завтрака в граммах составляет " + breakfastMassGramm + " гр.");
        System.out.println("Общий вес спорт-завтрака в килограммах составляет " + breakfastMassKilo + " кг.");
        System.out.println("---------------------------------------");
        System.out.println("Task 4");
        System.out.println("---------------------------------------");
        int taskToLoseGramm = 7000;
        int var1LoseGramm = 250;
        int var2LoseGramm = 500;
        double var1DaysToLoseGramm = taskToLoseGramm / var1LoseGramm;
        double var2DaysToLoseGramm = taskToLoseGramm / var2LoseGramm;
        double averageDaysToLoseGramm = (var1DaysToLoseGramm + var2DaysToLoseGramm) / 2;
        System.out.println("Если спортсмен будет сбрасывать по 250 гр в день, то для похудения на 7 кг ему потребуется " + (int)var1DaysToLoseGramm + " дней");
        System.out.println("Если спортсмен будет сбрасывать по 500 гр в день, то для похудения на 7 кг ему потребуется " + (int)var2DaysToLoseGramm + " дней");
        System.out.println("В среднем спортсмену понадобится " + (int)averageDaysToLoseGramm + " дней для похудения на 7 кг");
        System.out.println("---------------------------------------");
        System.out.println("Task 5");
        System.out.println("---------------------------------------");
        int MariaSalaryPerYear = 67_760 * 12;
        int DenchikSalaryPerYear = 83_690 * 12;
        int CristineSalaryPerYear = 76_230 * 12;
        double MariaSalaryIncrease = 67_760 * 1.1;
        double DenchikSalaryIncrease = 83_690 * 1.1;
        double CristineSalaryIncrease = 76_230 * 1.1;
        int MariaSalaryIncreasePerYear = (int)MariaSalaryIncrease * 12;
        int DenchikSalaryIncreasePerYear = (int)DenchikSalaryIncrease * 12;
        int CristineSalaryIncreasePerYear = (int)CristineSalaryIncrease * 12;
        int MariaSalaryIncreaseDifference = MariaSalaryIncreasePerYear - MariaSalaryPerYear;
        int DenchikSalaryIncreaseDifference = DenchikSalaryIncreasePerYear - DenchikSalaryPerYear;
        int CristineSalaryIncreaseDifference = CristineSalaryIncreasePerYear - CristineSalaryPerYear;
        System.out.println("Маша после ежегодного повышения на 10% получает " + (int)MariaSalaryIncrease + " рублей. Годовой доход вырос на " + MariaSalaryIncreaseDifference + " рублей.");
        System.out.println("Денис после ежегодного повышения на 10% получает " + (int)DenchikSalaryIncrease + " рублей. Годовой доход вырос на " + DenchikSalaryIncreaseDifference + " рублей.");
        System.out.println("Кристина после ежегодного повышения на 10% получает " + (int)CristineSalaryIncrease + " рублей. Годовой доход вырос на " + CristineSalaryIncreaseDifference + " рублей.");
    }
}



