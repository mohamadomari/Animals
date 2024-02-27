package Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class crocodiles extends reptiles{
    public crocodiles() {
    }

    public crocodiles(int id, String name, String gender, Date dateOfBirth, String originCountry, String liveUnderWater, String typeOfFood) {
        super(id, name, gender, dateOfBirth, originCountry, liveUnderWater, typeOfFood);
    }



    @Override
    public void makeSound() {
        System.out.println("Crocodile hisses or grunts.");
    }
}
