package strings;

public class stringodev2 {

	public static void main(String[] args) {
		String mesaj = "bugün hava çok güzel";
		System.out.println(mesaj);
        		
	    System.out.println("eleman sayısı: "+ mesaj.length());
	    System.out.println("4. eleman :"+ mesaj.charAt(4));
	    System.out.println(mesaj.concat(" yaşasın"));
	    System.out.println(mesaj.startsWith("b"));
	    System.out.println(mesaj.endsWith("l"));
	    
	    char[] karakterler = new char[5];
	    mesaj.getChars(0, 5, karakterler,0);
	    System.out.println(karakterler);
	    
	    System.out.println(mesaj.indexOf("av"));
	    System.out.println(mesaj.lastIndexOf("a"));
	    
	    System.out.println("-----------------------------");
	    
	    String yeniMesaj = mesaj.replace(' ', '-');
	    System.out.println(yeniMesaj);
	    System.out.println(mesaj.substring(2));
	    System.out.println(mesaj.substring(2,6));
	    
	    for (String kelime : mesaj.split(" ")) {
	    	System.out.println(kelime);
	    }
	    System.out.println(mesaj.toLowerCase());
	    System.out.println(mesaj.toUpperCase());
	    System.out.println(mesaj.trim());
	      
	}
	
}
