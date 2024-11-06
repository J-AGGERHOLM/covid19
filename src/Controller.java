import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Controller {


    FileHandler fh = new FileHandler();


    public void sortData(ArrayList<Covid19Data> senesteData, String searchingBy1st, String searchingBy2nd) {


        if (searchingBy2nd.isEmpty()) {
            switch (searchingBy1st.toLowerCase()) {
                case "alder" -> Collections.sort(senesteData, new AldersComparator().reversed());
                case "region" -> Collections.sort(senesteData, new RegionComparator());
                default -> {
                    System.out.println();
                }
            }
        }else{
            if (searchingBy2nd.equals("alder") && searchingBy1st.equals("region")){
                Collections.sort(senesteData, new RegionComparator().thenComparing(new AldersComparator()));
            } else if (searchingBy2nd.equals("region") && searchingBy1st.equals("alder")) {
                Collections.sort(senesteData, new AldersComparator().thenComparing(new RegionComparator()));
            }
        }



        //  ---------------- ARCHIVED 2ND PARAMETER SORTING ---------------------- //
        /*
        if (!searchingBy2nd.isEmpty()) {
            if (searchingBy2nd.toLowerCase().equals("alder")) {
                switch (searchingBy2nd.toLowerCase()) {
                    case "alder" -> Collections.sort(fh.læsData(), new AldersComparator());
                    case "region" -> Collections.sort(fh.læsData(), new AldersComparator().thenComparing(new RegionComparator()));
                    default -> System.out.println("an error has occured!");
                }
            }
            if (searchingBy2nd.toLowerCase().equals("region")) {
                switch (searchingBy2nd.toLowerCase()) {
                    case "alder" ->
                            Collections.sort(fh.læsData(), new RegionComparator().thenComparing(new AldersComparator()));
                    case "region" -> Collections.sort(fh.læsData(), new RegionComparator());
                    default -> System.out.println("an error has occured!");
                }
            }
        }
*/      //  ----------------ARCHIVED 2ND PARAMETER SORTING ---------------------- //






    }
}
