import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Hashmap<String, LinkedList<Person>> gozRengiTable = new Hashmap<>();
    private static Hashmap<String, LinkedList<Person>> sacRengiTable = new Hashmap<>();
    private static Hashmap<String, LinkedList<Person>> boyTable = new Hashmap<>();
    private static ArrayList<String> isimler = new ArrayList<>();
    private static final String dosyaYolu = RandomData.path;


    public static void buildData() {
        try {
            File f = new File(dosyaYolu);
            if(!f.exists())
                RandomData.run();

            BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));
            String satir;
            while ((satir = br.readLine()) != null) {
                String[] veriler = satir.split(",");
                if (veriler.length == 4) {
                    String isim = veriler[0].trim();
                    String gozRengi = veriler[1].trim();
                    String sacRengi = veriler[2].trim();
                    String boy = veriler[3].trim();
                    Person kisi = new Person(isim,boy,gozRengi,sacRengi);
                    isimler.add(isim);
                    if(gozRengiTable.get(gozRengi) == null)
                        gozRengiTable.put(gozRengi, new LinkedList<Person>());
                    gozRengiTable.get(gozRengi).append(kisi);

                    if(sacRengiTable.get(sacRengi) == null)
                        sacRengiTable.put(sacRengi, new LinkedList<Person>());
                    sacRengiTable.get(sacRengi).append(kisi);

                    if(boyTable.get(boy) == null)
                        boyTable.put(boy, new LinkedList<Person>());
                    boyTable.get(boy).append(kisi);
                }
            }
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        buildData();

        Scanner input = new Scanner(System.in);
        System.out.println("Goz rengi giriniz ");
        String gozRengi = input.nextLine();

        System.out.println("Sac rengi giriniz ");
        String sacRengi = input.nextLine();

        System.out.println("Boy giriniz ");
        String boy = input.nextLine();

        Hashmap<String,Integer> answer = new Hashmap<String,Integer>();

        int tofind = 0;
        if(!gozRengi.equals("")) {

            tofind++;
            if(gozRengiTable.get(gozRengi) != null){
                for(LinkedListNode<Person> i = gozRengiTable.get(gozRengi).getFirst(); i != null; i = i.getNext()) {
                    String name = i.getValue().getName();
                    int toset = answer.get(name)!=null ? answer.get(name) : 0;
                    answer.put(name, toset + 1);
                }
            }
        }
        if(!sacRengi.equals("")) {
            tofind++;
            if(sacRengiTable.get(sacRengi) != null){
                for(LinkedListNode<Person> i = sacRengiTable.get(sacRengi).getFirst(); i != null; i = i.getNext()) {
                    String name = i.getValue().getName();
                    int toset = answer.get(name)!=null ? answer.get(name) : 0;
                    answer.put(name, toset + 1);
                }
            }
        }
        if(!boy.equals("")) {
            tofind++;
            if(boyTable.get(boy) != null){
                for(LinkedListNode<Person> i = boyTable.get(boy).getFirst(); i != null; i = i.getNext()) {
                    String name = i.getValue().getName();
                    int toset = answer.get(name)!=null ? answer.get(name) : 0;
                    answer.put(name, toset + 1);
                }
            }
        }
        if(gozRengi.equals("") && sacRengi.equals("") && boy.equals("")) {
            for(String isim : isimler) {
                System.out.println(isim);
            }
        }
        else {
            for(String entry : answer.keySet()) {
                if(answer.get(entry) == tofind) {
                    System.out.println(entry);
                }
            }
        }

    }

}