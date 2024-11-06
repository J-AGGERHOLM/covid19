import java.util.Comparator;

public class AldersComparator implements Comparator<Covid19Data> {



    public int compare(Covid19Data d1, Covid19Data d2) {

        if (d1.getAldersGruppe().equals(d2.getAldersGruppe())) {
            return 0;
        }
        if (d1.getAldersGruppe() == null) {
            return -1;
        }
        if (d2.getAldersGruppe() == null) {
            return 1;
        }

        return d1.getAldersGruppe().compareTo(d2.getAldersGruppe());
    }
}
