public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int[] spendPerDay = generateRandomArray();
        int sum = 0;
        for (int j : spendPerDay) {
            sum += j;
        }
        System.out.printf("Сумма трат за месяц составила %,d рублей.\n", sum);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int[] spendPerDay = generateRandomArray();
        int minSpendPerDay = 200_001;
        for (int k : spendPerDay) {
            if (minSpendPerDay > k) {
                minSpendPerDay = k;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendPerDay + " рублей.");
        int maxSpendPerDay = -1;
        for (int j : spendPerDay) {
            if (maxSpendPerDay < j) {
                maxSpendPerDay = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpendPerDay + " рублей.");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] spendPerDay = generateRandomArray();
        int sum = 0;
        for (int j : spendPerDay) {
            sum += j;
        }
        double sumMean = (double) sum / (spendPerDay.length - 1);
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", sumMean);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reverseFullName.length - 1; j >=0; j--) {
            System.out.print(reverseFullName[j]);
        }
    }
}