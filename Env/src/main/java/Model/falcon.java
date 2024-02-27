package Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class falcon extends birds{
    public falcon() {
    }

    public falcon(int id, String name, String gender, Date dateOfBirth, String originCountry, String ableToFly, String ableToSwim, String typeOfFood) {
        super(id, name, gender, dateOfBirth, originCountry, ableToFly, ableToSwim, typeOfFood);
    }



    @Override
    public void makeSound() {
        System.out.println("Falcon screeches.");

    }
}
