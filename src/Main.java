import java.util.ArrayList;

public class Main{


    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> senesteData = fh.læsData();

        for (Covid19Data c19data : senesteData){
            System.out.println(c19data);
        }


    }
}

