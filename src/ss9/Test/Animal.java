package ss9.Test;

import java.util.Scanner;

public class Animal {
    private String animalName;
    private int numberOfLegs;
    private String furColor;
    private double everageLifeExpectancy;



    public Animal() {
    }

    public Animal(String animalName, int numberOfLegs, String furColor, double everageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public double getEverageLifeExpectancy() {
        return everageLifeExpectancy;
    }

    public void setEverageLifeExpectancy(double everageLifeExpectancy) {
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten dong vat: ");
        animalName = sc.nextLine();
        System.out.print("So chan: ");
        numberOfLegs = Integer.parseInt(sc.nextLine());
        System.out.print("Mau long: ");
        furColor = sc.nextLine();
        System.out.print("Tuoi tho trung binh: ");
        everageLifeExpectancy = Double.parseDouble(sc.nextLine());
    }

    public void display() {
        System.out.println("Ten dong vat: " + animalName);
        System.out.println("So chan: " + numberOfLegs);
        System.out.println("Mau long: " + furColor);
        System.out.println("Tuoi tho trung binh: " + everageLifeExpectancy);
    }
}
