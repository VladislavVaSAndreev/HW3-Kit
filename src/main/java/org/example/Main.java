package org.example;

public class Main {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();

        System.out.println("Сумма: " + calculator.sum(4, 3.2));
        System.out.println("Умножение: " + calculator.multiply(4, 3.2));
        System.out.println("Деление: " + calculator.divide(4, 3.2));
        System.out.println("Вычитание: " + calculator.subtract(4, 3.2));
        System.out.println();



        ArrayComparator arrayComparator = new ArrayComparator();

        Integer[] array01 = {1, 2, 3};
        Integer[] array02 = {1, 2, 3};
        Integer[] array03 = {4, 5, 6};
        Double[] array04 = {4.0, 5.0, 6.0};
        Object[] array05 = {4.0, 5.0, 6.0};

        String[] array11 = {"a", "b", "c"};
        String[] array12 = {"a", "b", "c"};
        String[] array13 = {"d", "e", "f"};
        Object[] array14 = {"d", "e", "f"};

        System.out.println(arrayComparator.compareArrays(array01, array02));
        System.out.println(arrayComparator.compareArrays(array01, array03));
        System.out.println(arrayComparator.compareArrays(array03, array04));
        System.out.println(arrayComparator.compareArrays(array04, array05));
        System.out.println(arrayComparator.compareArrays(array11, array12));
        System.out.println(arrayComparator.compareArrays(array11, array13));
        System.out.println(arrayComparator.compareArrays(array01, array13));
        System.out.println(arrayComparator.compareArrays(array13, array14));
        System.out.println();


        Pair<Integer, String> firstPair = new Pair<>(1, "One");
        System.out.println("Первое значение: " + firstPair.getFirst());
        System.out.println("Второе значение: " + firstPair.getSecond());
        System.out.println("Первая пара: " + firstPair);
        System.out.println();

        Pair<Double, Boolean> secondPair = new Pair<>(2.5, true);
        System.out.println("Первое значение: " + secondPair.getFirst());
        System.out.println("Второе значение: " + secondPair.getSecond());
        System.out.println("Вторая пара: " + secondPair);
        System.out.println();
    }
}
