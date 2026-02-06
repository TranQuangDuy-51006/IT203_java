package ss9.Test;

import java.util.Scanner;

public class MamalAnimal extends Animal {
    private String foodType;
    private boolean isLiveWithHuman;
    private String mamalSound;

    public MamalAnimal() {
        super();
    }

    public MamalAnimal(String animalName, int numberOfLegs, String furColor,
                       double everageLifeExpectancy, String foodType,
                       boolean isLiveWithHuman, String mamalSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mamalSound = mamalSound;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }

    public String getMamalSound() {
        return mamalSound;
    }

    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Kieu thuc an: ");
        foodType = sc.nextLine();
        System.out.print("Co song voi con nguoi khong (true/false): ");
        isLiveWithHuman = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Tieng keu: ");
        mamalSound = sc.nextLine();

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Kieu thuc an: " + foodType);
        System.out.println("Song voi con nguoi: " + isLiveWithHuman);
        System.out.println("Tieng keu: " + mamalSound);
    }
}
