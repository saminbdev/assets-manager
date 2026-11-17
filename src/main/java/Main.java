import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();


        House h;
        h = new House("Dave's house", "2023-01-01", 100000,"33-33-33",1,200000,50000);
        System.out.println(h.getValue());


    }
}
