package ex1.base;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ILion lion = new Lion();
        System.out.println("==Zaczepiam lwa");
        lion.poke();
        System.out.println("==Karmie lwa");
        lion.feed();
        System.out.println("==Zaczepiam lwa");
        lion.poke();
        System.out.println("==Spiewam lwu");
        lion.sing();
        System.out.println("==Odbieram lwu jedzenie");
        lion.takeFood();
        System.out.println("==Spiewam lwu");
        lion.sing();
        System.out.println("==Odbieram lwu jedzenie");
        lion.takeFood();
    }
}
