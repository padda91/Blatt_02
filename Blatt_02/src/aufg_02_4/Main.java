package aufg_02_4;



public class Main {
	
	
	public static void main(String[] args) {
		

		/*
		 * Binaerzahl namens bin entspricht hier 1110.
		 * In der Ausgabe sollte bei korrekter Loesung der Wert 14 
		 * ausgegeben werden. 
		 * 
		 * Beachten Sie, dass wir, um Ihre Loesung zu testen, 
		 * andere, ganzzahlige Werte zwischen 0 und 15, binaer kodiert, 
		 * eingeben werden. Andere Werte werden wir nicht testen. 
		 * Zum Testen Ihrer Loesung koennen Sie selbst 
		 * die Zahlen 1,1,1,0 in eine andere Kombination 
		 * aendern, so dass Sie ueberpruefen koennen, 
		 * ob Ihr Programm korrekt arbeitet. 
		 */
		Binaer bin = new Binaer(1,1,1,0); //Zeile x
		
		System.out.println(bin.getDecimal());
		
		
		/*
		 * Dezimalzahl namens dez wird hier mit dem 
		 * Wert 8 belegt. 
		 * In der Ausgabe sollte bei korrekter Loesung der Wert 
		 * 1000 ausgegeben werden. 
		 * 
		 * Beachten Sie, dass wir, um Ihre Loesung zu testen, 
		 * andere Werte zwischen 0 und 15 eingeben werden. 
		 * Da Sie diese Main.java nicht mit einreichen, 
		 * koennen Sie selbst zum Testen den Wert in Dezimal(8) 
		 * in einen anderen Wert umwandeln und pruefen, 
		 * ob Ihr Programm korrekt arbeitet. 
		 * 
		 * Beispiel: Dezimal(5) sollte 0101 ausgeben. 
		 * 
		 */
		Dezimal dez = new Dezimal(8); //Zeile y
				
		System.out.println(dez.getBinary());
		
	}

}