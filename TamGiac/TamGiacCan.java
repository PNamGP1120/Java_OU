package TamGiac;

public class TamGiacCan extends TamGiac {
    @Override
    protected String getName() {
        return "cân";
    }

    public TamGiacCan(double ab, double c){
        super(ab,ab,c);
    }
}
