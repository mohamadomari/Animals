package Model;

import java.util.Date;

abstract public class reptiles extends Animal{

    private String liveUnderWater;
    private String typeOfFood;

    public reptiles() {
    }

    public reptiles(int id, String name, String gender, Date dateOfBirth, String originCountry, String liveUnderWater, String typeOfFood) {
        super(id, name, gender, dateOfBirth, originCountry);
        this.liveUnderWater = liveUnderWater;
        this.typeOfFood = typeOfFood;
    }

    public String getLiveUnderWater() {
        return liveUnderWater;
    }

    public void setLiveUnderWater(String liveUnderWater) {
        this.liveUnderWater = liveUnderWater;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
    public abstract void makeSound();


}
