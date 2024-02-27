package Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class dogs extends Mammals{
    public dogs() {
    }

    public dogs(int id, String name, String gender, Date dateOfBirth, String originCountry, String numberOfLegs, String movementType, String typeOfFood) {
        super(id, name, gender, dateOfBirth, originCountry, numberOfLegs, movementType, typeOfFood);
    }



    @Override
    public void makeSound() {
        System.out.println("Dog barks!");
    }
}
