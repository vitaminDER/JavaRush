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

//ПОЧУВСТВУЙ СЕБЯ ДЕКАНОМ
/*
import java.util.ArrayList;
import java.util.List;
public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(excludedStudent)) {
                students.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}
*/

//ОБЪЕКТЫ ВНТУРЕННИХ И ВЛОЖЕННЫХ КЛАССОВ
/*
public class Solution {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Outer.Nested();
    }

    public static class Outer {
        class Inner {
            Inner() {
                System.out.println("Создание объекта внутреннего класса");
            }
        }

        static class Nested {
            Nested() {
                System.out.println("Создание объекта вложенного класса");
            }
        }
    }
}
*/
