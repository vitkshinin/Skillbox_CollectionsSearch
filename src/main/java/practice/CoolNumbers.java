package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        List<String> coolNumbersCollection = new ArrayList<>();
        for (int i = 0; i <= 2_000_000; i++) {
            coolNumbersCollection.add(getFullNumber());
        }
        Collections.sort(coolNumbersCollection);
        return coolNumbersCollection;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        long time = System.nanoTime();
        if (list.contains(number)) {
            System.out.println("Поиск перебором: номер найден, поиск занял " + (double) (System.nanoTime() - time) + " нс");
            return true;
        }
        System.out.println("Поиск перебором: номер не найден, поиск занял " + (double) (System.nanoTime() - time) + " нс");
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        long time = System.nanoTime();
        int index = Collections.binarySearch(sortedList, number);
        if (index >= 0) {
            System.out.println("Бинарный поиск: номер найден, поиск занял " + (double) (System.nanoTime() - time) + " нс");
            return true;
        }
        System.out.println("Бинарный поиск: номер не найден, поиск занял " + (double) (System.nanoTime() - time) + " нс");
        return false;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        HashSet<String> arrNumber = new HashSet<>(hashSet);
        long time = System.nanoTime();
        if (arrNumber.contains(number)) {
            System.out.println("Поиск в HashSet: номер найден, поиск занял " + (double) (System.nanoTime() - time) + " нс");
            return true;
        }
        System.out.println("Поиск в HashSet: номер не найден, поиск занял " + (double) (System.nanoTime() - time) + " нс");
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        TreeSet<String> sortCoolNumber = new TreeSet<>(treeSet);
        long time = System.nanoTime();
        if (sortCoolNumber.contains(number)) {
            System.out.println("Поиск в TreeSet: номер найден, поиск занял " + (double) (System.nanoTime() - time) + " нс");
            return true;
        }
        System.out.println("Поиск в TreeSet: номер не найден, поиск занял " + (double) (System.nanoTime() - time) + " нс");
        return false;
    }

    public static String getLetter() {
        ArrayList<String> characters = new ArrayList<>
                (Arrays.asList("А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"));
        double max = characters.size();
        double randomCharacters = (Math.random()) * max;
        return characters.get((int) randomCharacters);
    }

    private static String getNumbers() {
        ArrayList<String> numbers = new ArrayList<>
                (Arrays.asList("111", "222", "333", "444", "555", "666", "777", "888", "999"));
        double max = numbers.size();
        double randomCharacter = (Math.random()) * max;
        return numbers.get((int) randomCharacter);
    }

    private static String getRegion() {
        double max = 199;
        int randomRegion = (int) (((Math.random()) * max) + 1);
        String region = "" + randomRegion;
        if (randomRegion <= 9) {
            region = "0" + randomRegion;
        }
        return region;
    }

    public static String getFullNumber() {
        return CoolNumbers.getLetter() +
                CoolNumbers.getNumbers() +
                CoolNumbers.getLetter() +
                CoolNumbers.getLetter() +
                CoolNumbers. getRegion();
    }

}
