package org.example;

import Model.Animal;
import Model.turtle;
import java.util.Date;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal turtle = new turtle(1, "bashar", "Female", new Date(), "Ocean", "Underwater", "Vegetables");


        turtle.Age();
        turtle.makeSound();

    }
}