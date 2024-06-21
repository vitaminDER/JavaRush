package Level_18;

//Хищники vs Травоядные
/*
public class Solution {
    public static void main(String[] args) {
        printRation(new Cow());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal){
        String herbivore = "Любит траву";
        String predator = "Любит мясо";
        if(animal instanceof Herbivore && animal instanceof Herbivore ) {
            System.out.println(herbivore);
        }
        if(animal instanceof Predator && animal instanceof Predator) {
            System.out.println(predator);
        }
    }
}
*/

// Вилларибо и Виллабаджо
/*
public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        //напишите тут ваш код
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
    }

    public static void createStringedOrchestra() {
        //напишите тут ваш код
        orchestra.add(new Guitar());
        orchestra.add(new Violin());
        orchestra.add(new Violin());
    }

    public static void playOrchestra() {
        //напишите тут ваш код
        for(MusicalInstrument  orchestr : orchestra) {
            if( orchestr instanceof MusicalInstrument) {
                MusicalInstrument instrument = (MusicalInstrument)  orchestr;
                instrument.play();
            }
        }

    }
}
*/
