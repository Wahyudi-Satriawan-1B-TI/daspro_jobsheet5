import java.util.Scanner;
public class TugasFlowchart {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

        int jumlah;
        String hari, buku;
        double harga = 20000.0, diskonB = 0.0, diskon, biaya;

        System.out.println("------------------------------------");
        System.out.println("========== Rincian Biaya ===========");
        System.out.println("------------------------------------");
        System.out.print("Masukkan Hari : ");
        hari = sc25.nextLine();
        System.out.print("Masukkan Buku : ");
        buku = sc25.nextLine();
        System.out.print("Masukkan jumlah : ");
        jumlah = sc25.nextInt();
        System.out.println("------------------------------------");
        
if (hari.equalsIgnoreCase("rabu")) {
        if (buku.equalsIgnoreCase("kamus")) {
                if (jumlah > 2){
                diskon = 0.12;
                diskonB = (harga * jumlah) * diskon;
                biaya = (harga * jumlah) - diskonB;
              } else {
                diskon = 0.1;
                diskonB = (harga * jumlah) * diskon;
                biaya = (harga * jumlah) - diskonB;
              }

        } else if (buku.equalsIgnoreCase("novel")) {
              if (jumlah > 3){
                diskon = 0.8;
                diskonB = (harga * jumlah) * diskon;
                biaya = (harga * jumlah) - diskonB;
              } else {
                diskon = 0.9;
                diskonB = (harga * jumlah) * diskon;
                biaya = (harga * jumlah) - diskonB;
              }
  
        } else {
            if (jumlah > 3){
               diskon = 0.05;
               diskonB = (harga * jumlah) * diskon;
               biaya = (harga * jumlah) - diskonB;
             } else {
               biaya = (harga * jumlah);
             }
        }

} else {
    biaya = harga*jumlah;
}
      System.out.println("------------------------------------");
      System.out.println("Total Diskon : Rp " + diskonB);
      System.out.println("Total Biaya  : Rp " + biaya);
      System.out.println("------------------------------------");
}
}