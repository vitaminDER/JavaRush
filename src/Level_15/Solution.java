package Level_15;

//ПОМОЩНИК ПРЕПОДАВАТЕЛЯ
/*
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Solution {
    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает ";
    public static final String NOT_EXIST = "Студента с таким номером не существует";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур Мясной"
            , "Пенелопа Сиволап"
            , "Орест Злобин"
            , "Ирида Продувалова"
            , "Гектор Гадюкин"
            , "Электра Чемоданова"
            , "Гвидон Недумов"
            , "Роксана Борисенко"
            , "Юлиан Мумбриков"
            , "Зигфрид Горемыкин");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }

            int studentId = Integer.parseInt(input);
            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (Exception e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
*/

//ПОМОЩНИК ПРЕПОДАВАТЕЛЯ 2
/*
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

*//*
Помощник преподавателя-2
*//*

public class Solution {

    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает ";
    public static final String NOT_EXIST = "Студента с таким номером не существует";
    public static final String INTEGER_REQUIRED = "Нужно ввести целое число";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур Мясной"
            , "Пенелопа Сиволап"
            , "Орест Злобин"
            , "Ирида Продувалова"
            , "Гектор Гадюкин"
            , "Электра Чемоданова"
            , "Гвидон Недумов"
            , "Роксана Борисенко"
            , "Юлиан Мумбриков"
            , "Зигфрид Горемыкин");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentId = 0;

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }

            try {
                studentId = Integer.parseInt(input);

            }catch (NumberFormatException e) {
                System.out.println(INTEGER_REQUIRED);
            }
            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (Exception e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
*/


