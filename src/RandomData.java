import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


public class RandomData {
    public static final String path = "./random.csv";
    private static final String gozRenkleri[] = {"mavi", "yesil", "kahverengi", "siyah"};
    private static final String sacRenkleri[] = {"sari", "siyah", "kumral", "kizil"};
    private static final int dataCount = 10;

    public static void run() throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        PrintWriter writer = new PrintWriter(fileWriter);
        Random rand = new Random();

        for(int i=0;i<dataCount;i++) {
            writer.println("actor" + i + "," + gozRenkleri[rand.nextInt(4)] + "," + sacRenkleri[rand.nextInt(4)] + "," + (rand.nextInt(50)+150));
        }
        writer.println("");
        writer.close();
    }
}