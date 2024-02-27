package Model;

import java.util.Date;

abstract public class Mammals extends Animal
{
    private String numberOfLegs;
    private String movementType;
    private String typeOfFood;

    public Mammals()
    {

    }


    public Mammals(int id, String name, String gender, Date dateOfBirth, String originCountry, String numberOfLegs, String movementType, String typeOfFood) {
        super(id, name, gender, dateOfBirth, originCountry);
        this.numberOfLegs = numberOfLegs;
        this.movementType = movementType;
        this.typeOfFood = typeOfFood;
    }

    public String getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(String numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
    public abstract void makeSound();


}
