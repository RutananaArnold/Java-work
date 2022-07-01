/**
 * Overload
 */
public class Overload {

    public int add(int x, double y) {
        return (int) (x+y);
    }

    public int add(double z, int m) {
        return (int) z+m;
    }

    public static void main(String[] args){
        Overload ol = new Overload();

        System.out.println(ol.add(12, 2.5));
        
    }
}