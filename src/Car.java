import java.time.LocalDate;
import java.time.Period;

public class Car implements Method{
    private String markasy;
    private LocalDate madeOfDate;
    private  double price;
    private Turu turu;

    public Car(String markasy, LocalDate madeOfDate, double price, Turu turu) {
        this.markasy = markasy;
        this.madeOfDate = madeOfDate;
        this.price = price;
        this.turu = turu;
    }

    public String getMarkasy() {
        return markasy;
    }

    public void setMarkasy(String markasy) {
        this.markasy = markasy;
    }

    public LocalDate getMadeOfDate() {
        return madeOfDate;
    }

    public void setMadeOfDate(LocalDate madeOfDate) {
        this.madeOfDate = madeOfDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Turu getTuru() {
        return turu;
    }

    public void setTuru(Turu turu) {
        this.turu = turu;
    }

    @Override
    public String toString() {
        return "Машина {" +
                "Маркасы " + markasy + "\n"+
                "Чыккан жылы " + madeOfDate + "\n"+
                "Акчасы " + price + "\n"+
                "Кыймылы " + turu + "\n"+
                "Чыкканына "+determinationoYearOfManufacture()+ " жыл болду"+'}' + "\n";
    }
   public String bodyTypeIdentification(Turu type){
        if (turu.equals(Turu.Sedan)){
            System.out.println(getMarkasy()+ ": Легковой классындагы машина");
        } else if (turu.equals(Turu.Hatchback)) {
            System.out.println(getMarkasy()+ ": Легковой классындагы машина");
        }else if (turu.equals(Turu.Crossover)){
            System.out.println(getMarkasy()+  ": Внедорожник классындагы машина");
        }else if (turu.equals(Turu.SUV)){
            System.out.println(getMarkasy()+ ": Внедорожник классындагы машина");
        }else if (turu.equals(Turu.Universal)){
            System.out.println(getMarkasy()+  ": Универсал классындагы машина" );
        }
       return null;
   }

    @Override
    public int determinationoYearOfManufacture() {
        int age = Period.between(madeOfDate,LocalDate.now()).getYears();
        return age;
    }

}