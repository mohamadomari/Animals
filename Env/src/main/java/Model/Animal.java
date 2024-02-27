package Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

 public class Animal {
    private int Id;
    private String Name;
    private String Gender;
    protected Date dateOfBirth;
    private String originCountry;

    public Animal() {
    }


    public Animal(int id, String name, String gender, Date dateOfBirth, String originCountry) {
        Id = id;
        Name = name;
        Gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.originCountry = originCountry;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }



     public void Age() {
         LocalDate birthDate = dateOfBirth.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
         LocalDate currentDate = LocalDate.now();

         Period period = Period.between(birthDate, currentDate);

         int years = period.getYears();
         int months = period.getMonths();
         int days = period.getDays();

         System.out.println("Age: " + years + " years, " + months + " months, " + days + " days");

     }
     public  void makeSound()
     {

     }
}

