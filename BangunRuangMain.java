package bangunruang;
public class BangunRuangMain {
    public static void main (String[]args) {
        BangunRuang Balok = new Balok (5, 3, 4);
        BangunRuang Kubus = new Kubus (4);
        
        System.out.println("Balok:");
        System.out.println("Volume: " + Balok.calculateVolume());
        System.out.println("Luas Permukaan: " + Balok.calculateSurfaceArea());
        
        System.out.println("\nKubus:");
        System.out.println("Volume: " + Kubus.calculateVolume());
        System.out.println("Luas Permukaan: " + Kubus.calculateSurfaceArea());
    }
}
