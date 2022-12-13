package practice;

import java.util.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coolNumber = new ArrayList<>(CoolNumbers.generateCoolNumbers());
        HashSet<String> coolNumberHashSet = new HashSet<>(CoolNumbers.generateCoolNumbers());
        TreeSet<String> coolNumberTreeSet = new TreeSet<>(CoolNumbers.generateCoolNumbers());
        System.out.println("Количество номеров в базе: " + coolNumber.size());

        while (true) {
            System.out.println("Введите номер для поиска в формате, например: A111BC077");
            String inputNumber = scanner.nextLine();
            System.out.println(CoolNumbers.bruteForceSearchInList(coolNumber, inputNumber));
            System.out.println(CoolNumbers.binarySearchInList(coolNumber, inputNumber));
            System.out.println(CoolNumbers.searchInHashSet(coolNumberHashSet, inputNumber));
            System.out.println(CoolNumbers.searchInTreeSet(coolNumberTreeSet, inputNumber));
        }

    }
}
