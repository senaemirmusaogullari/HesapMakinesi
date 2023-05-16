import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {

		int a1, a2, select;
		Scanner inp = new Scanner(System.in);

		System.out.print("İlk Sayıyı Giriniz :");
		a1 = inp.nextInt();
		System.out.print("İkinci Sayıyı Giriniz :");
		a2 = inp.nextInt();

		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme ");
		System.out.print("Seçiminizi Giriniz :");
		select = inp.nextInt();

		switch (select) {
		case 1:
			System.out.println("İşlem Sonucu :" + (a1 + a2));
			break;
		case 2:
			System.out.println("İşlem Sonucu :" + (a1 - a2));
			break;
		case 3:
			System.out.println("İşlem Sonucu :" + (a1 * a2));
			break;
		case 4:
			System.out.println("İşlem Sonucu :" + (a1 / a2));
			break;
			default:
				System.out.println("Hatalı Giriş Yaptınız!");
			
		
				}
			}
		}


