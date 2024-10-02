import java.util.Scanner;
public class Pemilihan2Percobaan225 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

        byte pilihanMenu;
        String member, bayarqris;
        double harga, totalBayar, diskon = 0.10, qris = 1000.0;

        System.out.println("------------------------------------");
        System.out.println("========== MENU KAFE JTI ===========");
        System.out.println("------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea");
        System.out.println("------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihanMenu = sc25.nextByte();
        sc25.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = sc25.nextLine();
        System.out.print("Apakah anda ingin membayar menggunakan QRIS (y/n)");
        bayarqris = sc25.nextLine();
        System.out.println("------------------------------------");
   
if (bayarqris.equalsIgnoreCase("y")) {
        System.out.println("Potongan Qris = Rp 1.000");
        if (member.equalsIgnoreCase("y")) {
            System.out.println("Besar Diskon = 10%");
            
                if (pilihanMenu == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = "+ harga);
              } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = "+ harga);
              } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = "+ harga);
              } else { System.out.println("Masukkan pilihan menu dengan benar");
                return;
              }
                totalBayar = harga - (harga * diskon); 
                System.out.println("Total bayar setelah diskon = " + (totalBayar - qris));

        } else if (member.equalsIgnoreCase("n")) {
              if (pilihanMenu == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = "+ harga);
              } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = "+ harga);
              } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = "+ harga);
              } else { System.out.println("Masukkan pilihan menu dengan benar");
              return;
              }
                System.out.println("Total bayar = " + (harga - qris));
        } else {
            System.out.println("Member tidak valid");
        }

} else if (bayarqris.equalsIgnoreCase("n")) {
       
        if (member.equalsIgnoreCase("y")){
                System.out.println("Besar Diskon = 10%");
                
                if (pilihanMenu == 1){
                    harga = 14000;
                    System.out.println("Harga ricebowl = "+ harga);
                } else if (pilihanMenu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = "+ harga);
                } else if (pilihanMenu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = "+ harga);
                } else { System.out.println("Masukkan pilihan menu dengan benar");
                    return;
                }
                totalBayar = harga - (harga * diskon); System.out.println("Total bayar setelah diskon = " + totalBayar);

        } else if (member.equalsIgnoreCase("n")) {
                if (pilihanMenu == 1){
                    harga = 14000;
                    System.out.println("Harga ricebowl = "+ harga);
                } else if (pilihanMenu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = "+ harga);
                } else if (pilihanMenu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = "+ harga);
                } else { System.out.println("Masukkan pilihan menu dengan benar");
                  return;
                }
                System.out.println("Total bayar = " + harga);

        } else {
        System.out.println("Member tidak valid");
        }
} else {
        System.out.println("Jawaban tidak valid");
}

        System.out.println("------------------------------------");
    }
}