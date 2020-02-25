package com.ocr.anthony;

import java.util.Scanner;

public class Order {

    public void displayAvailableMenu() {
        System.out.println("Choix du menu");
        System.out.println("1 - Poulet");
        System.out.println("2 - Boeuf");
        System.out.println("3 - Vegetarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }

    public void displaySelectedMenu(int nbMenu) {
        switch (nbMenu) {
            case 1:
                System.out.println("Vous avez choisi comme menu : Poulet");
                break;
            case 2:
                System.out.println("Vous avez choisi le menu : Boeuf");
                break;
            case 3:
                System.out.println("Vous avez choisi le menu : Vegetarien");
                break;
            default:
                System.out.println("Vous n'avez pas choisi le menu parmi les choix proposés");
                break;
        }
    }
    public void runMenu() {
        
    }
}