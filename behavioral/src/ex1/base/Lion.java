package ex1.base;

public class Lion implements ILion {

    final int SLEEPING = 0;
    final int EATING = 1;
    final int WALKING = 2;
    private int state = WALKING;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void poke() {
        if (state == SLEEPING) {
            System.out.println("Nie reaguje");
        } else if (state == EATING) {
            System.out.println("Warczy");
        } else if (state == WALKING) {
            System.out.println("Rzuca sie na kraty");
        }
    }

    @Override
    public void feed() {
        System.out.println("Bierze sie do jedzenia");
        state = EATING;
    }

    @Override
    public void sing() {
        if (state == WALKING) {
            System.out.println("Zasypia");
            state = SLEEPING;
        } else if (state == EATING) {
            System.out.println("Warczy");
        } else if (state == SLEEPING) {
            System.out.println("Budzi sie");
            state = WALKING;
        }
    }

    @Override
    public void takeFood() {
        if (state == EATING) {
            System.out.println("Odebrano mu jedzenie");
            state = WALKING;
        } else {
            System.out.println("Nie ma mu czego odebrac");
        }
    }
}