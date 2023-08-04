import java.util.Scanner;
public class OrtalamaHesaplama {

	public static void main(String[] args) {
		int fizik, kimya, matematik, tarih, turkce;
		
		Scanner not = new Scanner(System.in);
		
		System.out.print("Fizik notunu giriniz: ");
		fizik = not.nextInt();
		System.out.println(fizik);
		
		System.out.print("kimya notunu giriniz: ");
		kimya = not.nextInt();
		System.out.println(kimya);
		
		System.out.print("matematik notunu giriniz: ");
		matematik = not.nextInt();
		System.out.println(matematik);
		
		System.out.print("tarih notunu giriniz: ");
		tarih = not.nextInt();
		System.out.println(tarih);
		
		System.out.print("turkce notunu giriniz: ");
		turkce = not.nextInt();
		System.out.println(turkce);
		
		int ort = (fizik + kimya + matematik + tarih + turkce)/5;
		System.out.println("Ortalama : "+ort);
		
		boolean sonuc = ort > 50;
		String str = (sonuc) ? "Gecti" : "Kaldı";
		System.out.println(str);

		
		

	}

}
