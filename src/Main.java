import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

     Car car1 = new Car("Honday", LocalDate.of(2018,12,4),850000,Turu.Hatchback);
     Car car2 = new Car("Tesla", LocalDate.of(2022,3,30),1200000,Turu.Sedan);
     Car car3 = new Car("Lexus", LocalDate.of(2005,5,21),1200000,Turu.Crossover);
     Car car4 = new Car("Step", LocalDate.of(2012,2,1),1200000,Turu.SUV);
     Car car5 = new Car("Passat", LocalDate.of(2012,2,1),1200000,Turu.Universal);
       Car [] cars = {car1, car2, car3, car4, car5};
        for (Car a : cars) {
            System.out.println(a.toString());
        }
    }
}