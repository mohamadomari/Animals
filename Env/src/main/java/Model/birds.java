package Model;

import java.util.Date;

abstract public class birds extends Animal{
    private String ableToFly;
    private String ableToSwim;
    private String typeOfFood;

    public birds() {
    }

    public birds(int id, String name, String gender, Date dateOfBirth, String originCountry, String ableToFly, String ableToSwim, String typeOfFood) {
        super(id, name, gender, dateOfBirth, originCountry);
        this.ableToFly = ableToFly;
        this.ableToSwim = ableToSwim;
        this.typeOfFood = typeOfFood;
    }

    public String getAbleToFly() {
        return ableToFly;
    }

    public void setAbleToFly(String ableToFly) {
        this.ableToFly = ableToFly;
    }

    public String getAbleToSwim() {
        return ableToSwim;
    }

    public void setAbleToSwim(String ableToSwim) {
        this.ableToSwim = ableToSwim;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
    public abstract void makeSound();

}
