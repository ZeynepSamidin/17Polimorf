package com.company;

public class Main {

    /**
     * Animal деген класс тузунуз жана бир метод кошунуз.
     * Анын 3 наследнигин тузунуз.
     * <p>
     * Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
     * Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
     * кошунуз.
     * instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
     * чыгарыныз.
     * Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
     * болуп оз озунун массивине салыныз
     */

    public static void main(String[] args) {

        Animal animal1 = new Shark();
        Animal animal2 = new Shark();
        Animal animal3 = new Shark();

        Animal animal4 = new Turtle();
        Animal animal5 = new Turtle();
        Animal animal6 = new Turtle();

        Animal animal7 = new Eagle();
        Animal animal8 = new Eagle();
        Animal animal9 = new Eagle();

        Animal[] animals = {animal1, animal2, animal4, animal3, animal5, animal9, animal6, animal8, animal7};

        for (Animal a : animals) {
            System.out.println("\n shark method");
            if (a instanceof Shark) {
                a.eat();
                ((Shark) a).attack();
                System.out.println("\n method turtle");
            } else if (a instanceof Turtle) {
                a.eat();
                ((Turtle) a).swim();
                System.out.println("\n eagle method");
            } else if (a instanceof Eagle) {
                a.eat();
                ((Eagle) a).fly();
            }
        }

        for (Animal animal : animals) {
            System.out.println();
            if (animal.getClass().getName() == "com.company.Shark") {
                animal.eat();
                ((Shark) animal).attack();
                System.out.println();
            } else if (animal.getClass().getName() == "com.company.Turtle") {
                animal.eat();
                ((Turtle) animal).swim();
                System.out.println();
            } else if (animal.getClass().getName() == "com.company.Eagle") {
                animal.eat();
                ((Eagle) animal).fly();
            }
        }

        Shark[] sharks = new Shark[3];
        Turtle[] turtles = new Turtle[3];
        Eagle[] eagles = new Eagle[3];

        int shark = 0;
        int turtle = 0;
        int eagle = 0;

        for (Animal anim : animals) {
            if (anim instanceof Shark) {
                sharks[shark] = (Shark) anim;
                shark++;
            } else if (anim instanceof Turtle) {
                turtles[turtle] = (Turtle) anim;
                turtle++;
            } else if (anim instanceof Eagle) {
                eagles[eagle] = (Eagle) anim;
                eagle++;
            }
            for (Shark s : sharks) {
                s.eat();
                s.attack();
            }
            for (Turtle t : turtles) {
                t.eat();
                t.swim();
            }
            for (Eagle e : eagles) {
                e.eat();
                e.fly();
            }
        }
    }
}