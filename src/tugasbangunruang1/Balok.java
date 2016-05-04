
package tugasbangunruang1;

/* @author rickyanggoro
 */
public class Balok extends TugasBangunRuang1{
    int panjang,lebar,tinggi;
    Balok(int panjang,int lebar,int tinggi){
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
    }
    
    @Override
    public double getVolume(){
        return panjang*lebar*tinggi;
    }
    
    @Override
    public double getLuas(){
        return (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
    }
}
