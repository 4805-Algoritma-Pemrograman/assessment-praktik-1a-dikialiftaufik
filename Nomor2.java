import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalTrip = 0;
        int omzetBeliau = 0;
        int omzetMereka = 0;
        int omzetKita = 0;
        
        String ulang;
        do {
            // Meminta input nama driver
            System.out.print("Masukan nama drive [Beliau/Mereka/Kita]: ");
            String namaDriver = input.nextLine();
            
            // Meminta input lama trip
            System.out.print("lama trip (km): ");
            int lamaTrip = input.nextInt();
            input.nextLine(); 
            
            // Menambahkan lama trip ke total
            totalTrip += lamaTrip;
            
            // Menghitung omzet berdasarkan nama driver
            int omzet = lamaTrip * 13000; 
            switch (namaDriver) {
                case "Beliau":
                    omzetBeliau += omzet;
                    break;
                case "Mereka":
                    omzetMereka += omzet;
                    break;
                case "Kita":
                    omzetKita += omzet;
                    break;
                default:
                    System.out.println("Nama driver tidak valid.");
            }
            
            // Meminta input apakah ingin memasukkan data lagi
            System.out.print("Input lagi (Y/N)?: ");
            ulang = input.nextLine();
            
        } while (ulang.equalsIgnoreCase("Y"));
        
        // Menampilkan total trip
        System.out.println("Total trip yang dilakukan driver = " + totalTrip);
        
        // Menentukan driver dengan omzet tertinggi
        int omzetTertinggi = Math.max(omzetBeliau, Math.max(omzetMereka, omzetKita));
        String driverTertinggi = "";
        
        if (omzetTertinggi == omzetBeliau) {
            driverTertinggi = "Beliau";
        } else if (omzetTertinggi == omzetMereka) {
            driverTertinggi = "Mereka";
        } else if (omzetTertinggi == omzetKita) {
            driverTertinggi = "Kita";
        }
        
        // Menampilkan omzet tertinggi
        System.out.println("Omzet tertinggi diperoleh oleh " + driverTertinggi + " dengan total Omzet = " + omzetTertinggi);
        
        input.close();
    }
}


/* Pseudocode 
 * Program Nomor2
 * 
 * Deklarasi 
 *   var lamaTrip, totalTrip, omzetBeliau, omzetMereka, omzetKita, omzet, omzetTertinggi: integer;
 *   var namaDriver, ulang, driverTertinggi: string;
 *   
 * Algoritma
 *   INPUT namaDriver, lamaTrip;
 *   IF (namaDriver = "Beliau") THEN
 *       omzet = lamaTrip * 13000;
 *       omzetBeliau = omzet;
 *   ELSEIF (namaDriver = "Mereka") THEN
 *       omzet = lamaTrip * 13000;
 *       omzetMereka = omzet;
 *   ELSEIF (namaDriver = "Kita") THEN
 *       omzet = lamaTrip * 13000;
 *       omzetKita = omzet;
 *   ELSE
 *       OUTPUT "Driver tidak valid.";
 *   ENDIF;
 *   while (ulang = "Y") do
 *       INPUT namaDriver, lamaTrip;
 *       IF (namaDriver = "Beliau") THEN
 *           omzet = lamaTrip * 13000;
 *           omzetBeliau = omzet;
 *       ELSEIF (namaDriver = "Mereka") THEN
 *           omzet = lamaTrip * 13000;
 *           omzetMereka = omzet;
 *       ELSEIF (namaDriver = "Kita") THEN
 *           omzet = lamaTrip * 13000;
 *           omzetKita = omzet;
 *       ELSE
 *           OUTPUT "Driver tidak valid.";
 *       ENDIF;
 *   ENDWHILE;
 * OUTPUT "Total trip yang dilakukan driver = " + totalTrip;
 * OUTPUT "Omzet tertinggi diperoleh oleh " + driverTertinggi + " dengan total Omzet = " + omzetTertinggi;
 * END
 */
