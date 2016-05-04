
package tugasbangunruang1;

/*@author rickyanggoro
 */
public class Tabung extends TugasBangunRuang1{
    double jari,tinggi;
    Tabung(double jari,double tinggi){
        this.jari=jari;
        this.tinggi=tinggi;
    }
    
    @Override
    public double getVolume(){
        return 3.14*jari*jari*tinggi;
    }
    
    @Override
    public double getLuas(){
        return (2*3.14*jari*jari)+((2*jari)*tinggi);
    }
}