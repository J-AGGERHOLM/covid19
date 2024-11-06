import java.util.Comparator;

public class RegionComparator implements Comparator<Covid19Data> {


    @Override

    public int compare(Covid19Data d1, Covid19Data d2) {


        if (d1.getRegion().equals(d2.getRegion())) {
            return 0;
        }
        if (d1.getRegion() == null) {
            return -1;
        }
        if (d2.getRegion() == null) {
            return 1;
        }

        return d1.getRegion().compareTo(d2.getRegion());
    }
}
