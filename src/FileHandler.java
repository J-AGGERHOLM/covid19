import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe - 11_noegletal_pr_region_pr_aldersgruppe.csv");

    public ArrayList<Covid19Data> læsData() {
        ArrayList<Covid19Data> covidData = new ArrayList<>();
        Scanner sc = null;

        try {
            sc = new Scanner(file, StandardCharsets.ISO_8859_1);
            sc.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("can't find file");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("issue with charset");
            throw new RuntimeException(e);
        }

        Covid19Data dataSet = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(",");
            dataSet = new Covid19Data(
                    (Integer.parseInt(attributes[0])), // regionskode
                    (attributes[1]), // region
                    (attributes[2]), // aldersgruppe
                    (Integer.parseInt(attributes[3])), // bekræftede tilfælde
                    (Integer.parseInt(attributes[4])), // døde
                    (Integer.parseInt(attributes[5])), // indlagte
                    (attributes[6]) // dato
            );
            covidData.add(dataSet);


        }
        sc.close();
        return covidData;


    }



}
