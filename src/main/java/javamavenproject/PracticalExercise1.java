package javamavenproject;

import java.util.Scanner;

public class PracticalExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);

        System.out.println("Hello and welcome!");
        System.out.print("Please enter your name: ");
        String name = in.nextLine();

        System.out.print("Please enter your title: ");
        String title = in.nextLine();

        System.out.printf("Name: %s \n", name);
        System.out.printf("Title: %s ", title);


	}

}
