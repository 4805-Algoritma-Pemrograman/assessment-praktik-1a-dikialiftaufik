import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total jam lembur: ");
        int jamLembur = input.nextInt();

        double honorLembur;

        if (jamLembur <= 16) {
            honorLembur = jamLembur * 10000;
        } else {
            honorLembur = (16 * 10000) + ((jamLembur - 16) * 15000);
        }

        System.out.println("Honor lembur: " + honorLembur);
    }
}

/* Pseudocode 
 * Program Nomor1
 * 
 * Deklarasi 
 *   var jamLembur: integer;
 *   var honorLembur: double;
 * 
 * Algoritma
 *   INPUT jamLembur;
 *   IF (jamLembur <= 16) THEN
 *       honorLembur = jamLembur * 10000;
 *   ELSE
 *       honorLembur = (16 * 10000) + ((jamLembur - 16) * 15000);
 *   ENDIF;
 *   OUTPUT honorLembur;
 * 
 * END
*/
