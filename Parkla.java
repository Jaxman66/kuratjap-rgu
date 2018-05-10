import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Parkla {
    private static final Queue<Auto> autod = new PriorityQueue<>();
    private static final Map<String, List<Auto>> omanikud = new HashMap<>();

    private static void loeAutod() throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("parklaautod.dat"))) {
            int autodeArv = dis.readInt();
            for (int i = 0; i < autodeArv; i++) {
                String registreerimisNumber = dis.readUTF();
                String omanik = dis.readUTF();
                double kõrgus = dis.readDouble();
                autod.put(registreerimisNumber,omanik,kõrgus);
            }
        }
    }

    private static void omanikeKaupa(){

    }

}
