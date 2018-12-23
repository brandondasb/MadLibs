package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Quick challenge

        Scanner scan = new Scanner(System.in);
        String color="";
        String pastTenseVerb ="";
        String adjective= "";
        String noun= "";


        System.out.println("Please enter a color");
        color= scan.nextLine();
        System.out.println("Please enter a past tense verb");
        pastTenseVerb = scan.nextLine();
        System.out.println("Please enter a adjective");
        adjective = scan.nextLine();
        System.out.println("Please enter a noun");
        noun = scan.nextLine();
        System.out.print("The "+color+" Dragon "+pastTenseVerb+" at the "+adjective);

        System.out.println(" Knight, who rode in on a sturdy, giant "+ noun);
    }
}
