
package tugasbangunruang1;

/*@author rickyanggoro
 */
public class MainRuang {
    public static void main(String[] args){
        Kubus k=new Kubus(8);
        Balok b=new Balok(7,6,6);
        Tabung t=new Tabung(3,7);
        System.out.println(k.Display());
        System.out.println(b.Display());
        System.out.println(t.Display());
    }
    
}
