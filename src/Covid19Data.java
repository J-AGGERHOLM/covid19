public class Covid19Data {
    private int Regionskode;
    private String Region;
    private String AldersGruppe;
    private int bekræftedeTilfælde;
    private int døde;
    private int indlagte;
    private String dato;


    public Covid19Data(int Regionskode, String Region, String AldersGruppe, int bekræftedeTilfælde, int døde, int indlagte, String dato) {
        this.Regionskode = Regionskode;
        this.Region = Region;
        this.AldersGruppe = AldersGruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagte = indlagte;
        this.dato = dato;
    }


    @Override
    public String toString() {
        return "Region{" + Region +
                "Regionskode = " + Regionskode +
                ", aldersgruppe = '" + AldersGruppe + '\'' +
                ", bekræftede tilfælde = '" + bekræftedeTilfælde + '\'' +
                ", dødsfald = " + døde + '\'' +
                ", indlagte = " + indlagte + '\'' +
                ", dato = " + dato + '\'' +
                '}';
    }

}
