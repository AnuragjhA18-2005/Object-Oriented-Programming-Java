package toString;

public class Car {
    String Make;
    String model;
    int Year;

    Car(String Make,
    String model,
    int Year){
        this.Make=Make;
        this.model=model;
        this.Year=Year;
    }
    @Override
    public String toString(){
        return this.Make +" "+this.model+" "+this.Year;
    }
}
