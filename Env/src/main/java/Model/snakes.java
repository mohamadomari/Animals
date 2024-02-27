package Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class snakes extends reptiles{
    public snakes() {
    }

    public snakes(int id, String name, String gender, Date dateOfBirth, String originCountry, String liveUnderWater, String typeOfFood) {
        super(id, name, gender, dateOfBirth, originCountry, liveUnderWater, typeOfFood);
    }



    @Override
    public void makeSound() {
        System.out.println("Snake hisses.");

    }
}
