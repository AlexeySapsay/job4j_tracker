package ru.job4j.collection;

import java.util.List;
import java.util.ArrayList;

/**
 * https:\\job4j.ru/edu/task_code?topicId=4&taskCodeId=15&solutionId=new_task
 * Реализовать метод проверки корректности открытых и закрытых скобок.
 * Например, ()(()((()))) - true, ()) - false
 */

public class Parentheses {
    public static void main(String[] args) {
        /*String str = "()(()((())))";*/
        /*String str = "()()";*/
        /*String str = "(())";*/
        /*System.out.println("finish: " + valid(str.toCharArray()));*/

        /*проверить на количество открывающихся и закрывающихся
            скобок последовательно находя и удаляя близжайшие ()
            закрывающиеся скобочки*/
    }

    /**
     * @param data - массив чаров
     * @return true - если можем закрыть все скобки
     * false - не можем закрыть все скобки
     */
    public static boolean valid(char[] data) {
        List<Character> charList = new ArrayList<Character>();
        for (Character ch : data) {
            charList.add(ch);
        }

        /*looking for '('')' nearest parentheses*/
        for (int k = 0; k < charList.size(); k++) {
            for (int i = 0; i < charList.size() - 1; i++) {
                if (charList.get(i).equals('(') && (charList.get(i + 1).equals(')'))) {
                    charList.remove(i);
                    charList.remove(i);
                }
            }
        }
        return !(charList.size() != 0);
    }
}
