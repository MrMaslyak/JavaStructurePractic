import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        maxStructureElement(arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("aba");
        arrayList1.add("bob");
        arrayList1.add("cat");
        polindromStructureElement(arrayList1);
        UniqueElements();
        ElementFrequency();
        WordFrequency();
        IntervalBetweenNumbers();
        IntervalBetweenWords();
    }

    public static void maxStructureElement(ArrayList<Integer> arrayList) {
        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        System.out.println("Maximum element in ArrayList: " + max);
    }

    public static void polindromStructureElement(ArrayList<String> arrayList) {
        for (String str : arrayList) {
            if (new StringBuilder(str).reverse().toString().equals(str)) {
                System.out.println(str + " - это палиндром.");
            } else {
                System.out.println(str + " - это не палиндром.");
            }
        }
    }

    public static void UniqueElements() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(5);
        System.out.println("Before: " + arrayList);
        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        System.out.println("After: " + hashSet);
    }

    //Частота появления
    // Пример
    // Задача 4 понята как на частоту появление одинаковых чисел
    public static void ElementFrequency() {
        int[] array = {1, 1, 3, 4, 4, 4, 10, 9, 9, 10};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num);
        }
        for (int num : arrayList) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(hashMap);
    }
// Задача 5 понята как на частоту одинаковых слов в тексте
    public static void WordFrequency() {
        String text = "Hello world Hello people Hello world planet";
        String[] words = text.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String word : words) {
            arrayList.add(word);
        }
        for (String word : arrayList) {
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(hashMap);
    }

    // Промежуток между числами
    // Пример
    // Задача 4 понята как подсчет интервала между одинаковыми числами
    public static void IntervalBetweenNumbers() {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 5, 1};
        HashMap<Integer, Integer> lastIndexMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            if (lastIndexMap.containsKey(num)) {
                int lastIndex = lastIndexMap.get(num);
                System.out.println("Interval between " + num + ": " + (i - lastIndex - 1));
            }
            lastIndexMap.put(num, i);
        }
    }
    // Задача 5 понята как подсчет интервала между одинаковыми словами
    public static void IntervalBetweenWords() {
       String text = "Hello world Hello people Hello world planet Hello";
        String[] words = text.split(" ");
        HashMap<String, Integer> lastIndexMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String word : words) {
            arrayList.add(word);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String word = arrayList.get(i);
            if (lastIndexMap.containsKey(word)) {
                int lastIndex = lastIndexMap.get(word);
                System.out.println("Interval between " + word + ": " + (i - lastIndex - 1));
            }
            lastIndexMap.put(word, i);
        }
    }
}

