package recapdemo2;

public class odev2recapdemo2 {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 3.4, 5.6 };
		double total = 0;
		double enBuyuk = myList[0];
		for (double number : myList) {
			if (enBuyuk < number) {
				enBuyuk = number;
			}

			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam : " + total);
		System.out.println("en büyük: " + enBuyuk);
	}
}
 