package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Column
    private String model;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "series")
    private long series;

    public Car(){}

    public Car(String model){
        this.model=model;
    }



    public long getSeries() {
        return series;
    }

    public void setSeries(long series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString(){
        return "Car " + model + series;
    }
}
