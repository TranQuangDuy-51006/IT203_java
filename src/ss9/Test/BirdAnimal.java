package ss9.Test;

import java.util.Scanner;

public class BirdAnimal extends Animal {
    private boolean isFly;
    private String birdSound;

    public BirdAnimal() {
        super();
    }

    public BirdAnimal(String animalName, int numberOfLegs, String furColor,
                      double everageLifeExpectancy, boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Co bay duoc khong (true/false): ");
        isFly = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Tieng hot: ");
        birdSound = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Co bay duoc: " + isFly);
        System.out.println("Tieng hot: " + birdSound);
    }
}
