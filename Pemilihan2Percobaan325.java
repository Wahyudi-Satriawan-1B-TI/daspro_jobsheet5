import java.util.Scanner;
public class Pemilihan2Percobaan325 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print("Masukkan Kategori (pekerja/pebisnis) : ");
kategori=sc25.nextLine();
System.out.print("Masukkan besarnya Penghasilan : ");
penghasilan=sc25.nextInt();


if (kategori.equals("pekerja")) {
        if (penghasilan <= 2000000) {
        pajak = 0.1;
      } else if (penghasilan <= 3000000) {
        pajak = 0.15;
      } else {
        pajak = 0.2;
      }
    gajiBersih = (int) (penghasilan - (pajak * penghasilan)); 
        System.out.print("Penghasilan Bersih : Rp " + gajiBersih);

} else if (kategori.equals("pebisnis")) {
    if (penghasilan <= 2500000) {
        pajak = 0.15;
      } else if (penghasilan <= 3500000) {
        pajak = 0.2;
      } else {
        pajak = 0.25;
      }
    gajiBersih = (int) (penghasilan - (pajak * penghasilan)); 
        System.out.print("Penghasilan Bersih : Rp " + gajiBersih);

} else {
    System.out.println("Masukkan Kategori Salah");
}


    }
}