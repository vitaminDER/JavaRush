package Level_12;

// ЗАТЕНЕНИЕ ПОЛЯ КЛАССА
/*public class Solution {
    public static int salary;

    public static void add(int increase) {
        //int salary = Solution.salary;
        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}*/

//СТУДЕНТ
/*
public class Solution {
    public static void main(String[] args) {
        Student student = new Student("Amigo");
        System.out.println(student.name);


    }


    public static class Student {
        public String name;


        public Student(String name) {
            this.name = name;
        }
    }
}*/

//Текстовые цифры
/*
public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        switch (digit) {
            case '0':
                result = "ноль";
                break;
            case '1':
                result = "один";
                break;
            case '2':
                result = "два";
                break;
            case '3':
                result = "три";
                break;
            case '4':
                result = "четыре";
                break;
            case '5':
                result = "пять";
                break;
            case '6':
                result = "шесть";
                break;
            case '7':
                result = "семь";
                break;
            case '8':
                result = "восемь";
                break;
            case '9':
                result = "девять";
                break;
        }
        return result;
    }
}*/
