package miniproje1asalsayi;

public class miniproje1asalsayi {

	public static void main(String[] args) {
		int number = 15;
		boolean isPrime = true;
		if(number==1) {
			System.out.println("sayı asal değil");
			return;
		}
		if(number<1) {
			System.out.println("sayı geçersizdir");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
          if(isPrime==true) {
        	  System.out.println("sayı asaldır");
        	  
          }
          else {
        	  System.out.println("sayı asal değildir");
          }
        	  
	}

}
