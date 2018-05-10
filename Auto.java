import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

public class Auto {
    private String omanik;
    private String registreerimisNumber;
    private double kõrgus;
    private LocalDateTime parkimiseAlgus;

    public Auto(String omanik, String registreerimisNumber, double kõrgus) {
        this.omanik = omanik;
        this.registreerimisNumber = registreerimisNumber;
        this.kõrgus = kõrgus;
    }

    public void siseneParklasse(double maxKõrgus) throws AutoSuuruseErind {
        LocalDateTime registreerimisAeg;
        if (maxKõrgus > getKõrgus(){
            registreerimisAeg = LocalDateTime.now();
        } else {
            throw new AutoSuuruseErind("Liiga kõrge auto! Ei luba parklasse!");
        }
    }

    public String getOmanik() {
        return omanik;
    }

    public String getRegistreerimisNumber() {
        return registreerimisNumber;
    }

    public double getKõrgus() {
        return kõrgus;
    }

    public LocalDateTime getParkimiseAlgus() {
        return parkimiseAlgus;
    }

}
