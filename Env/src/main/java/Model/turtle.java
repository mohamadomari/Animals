package Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class turtle extends reptiles {
    public turtle() {
    }

    public turtle(int id, String name, String gender, Date dateOfBirth, String originCountry, String liveUnderWater, String typeOfFood) {
        super(id, name, gender, dateOfBirth, originCountry, liveUnderWater, typeOfFood);
    }



    @Override
    public void makeSound() {
        System.out.println("Turtle is silent or makes a subtle noise.");
    }
}
