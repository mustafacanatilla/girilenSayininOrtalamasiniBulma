import java.util.Scanner;

public class girilenSayinin3ve4eBolunenleri {
    public static void main(String[] args) {

        int k, toplam = 0, adet = 0;
        double ortalama = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                adet += 1;
                toplam += i;
            }

        }
        ortalama = (toplam / adet);
        System.out.print(k + " Kadar olan sayılardan 3 ile 4 e bölünenlerin ortalaması:" + ortalama);


    }
}
