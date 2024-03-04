
public class Outer {

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


    public static void main(String[] args) {
        Outer.Inner objOne = new Outer().new Inner();
        Outer.Nested objTwo = new Outer.Nested();
    }
}
