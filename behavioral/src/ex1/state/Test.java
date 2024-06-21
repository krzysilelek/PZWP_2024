package ex1.state;

public class Test {

    public static void main(String[] args) {
        ILion lion = new LionContext();
        System.out.println("== Poking the lion");
        lion.poke();
        System.out.println("== Feeding the lion");
        lion.feed();
        System.out.println("== Poking the lion");
        lion.poke();
        System.out.println("== Singing to the lion");
        lion.sing();
        System.out.println("== Taking away the lion's food");
        lion.takeFood();
        System.out.println("== Singing to the lion");
        lion.sing();
        System.out.println("== Taking away the lion's food");
        lion.takeFood();
    }
}
