package ru.job4j.oop;

public class DummyDic {
    public String endToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();

        String word = dictionary.endToRus("dictionary");
        System.out.println(" " + word);
    }
}
