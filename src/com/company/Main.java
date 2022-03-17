package com.company;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arrayGen = new int[30];
        for (int i = 0; i < arrayGen.length; i++) {
            arrayGen[i] = random.nextInt(100_000) + 100_000;
        }
        return arrayGen;
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        // Ниже выполнение первой задачи.
        int[] arrRnd = generateRandomArray();
        int sum = 0;
        for (final int current : arrRnd) {
            sum += current;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задача 2");
        // Ниже выполнение второй задачи.
        int[] arrRnd1 = generateRandomArray();
        int min = arrRnd1[0];
        int max = arrRnd1[0];
        for (int i = 1; i < arrRnd1.length; i++) {
            final int current = arrRnd1[i];
            if (current < min)
                min = current;
            if (current > max)
                max = current;
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Задача 3");
        // Ниже выполнение третьей задачи.
        int[] arrRnd2 = generateRandomArray();
        float mean = 0f;
        for (int j : arrRnd2) {
            mean = mean + j;
        }
        System.out.println("Средняя сумма трат за месяц составила " + mean / arrRnd2.length + " рублей");
        System.out.println("Задача 4");
        // Ниже выполнение четвертой задачи.
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int a = reverseFullName.length - 1; a >= 0; a--) {
            System.out.print(reverseFullName[a]);
        }
    }
}
