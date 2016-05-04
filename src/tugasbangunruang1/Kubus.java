
package tugasbangunruang1;

public class Kubus extends TugasBangunRuang1{
    double sisi;
    Kubus(double sisi){
        this.sisi=sisi;
    }
    @Override
    public double getVolume(){
        return sisi*sisi*sisi;
    }
    @Override
    public double getLuas(){
        return 6*sisi*sisi;
    }
}
