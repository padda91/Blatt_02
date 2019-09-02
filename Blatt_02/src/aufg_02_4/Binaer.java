/* * 
 * Meine Matrikelnummer lautet: 
 * Die Matrikelnummer meiner mitabgebenden KommilitonInnen lautet: 
 * Wir sind in Gruppe   
 * 
 */

package aufg_02_4;

public class Binaer {

	int bit1;
	int bit2;
	int bit3;
	int bit4;

	int decimal;

	Binaer(int b4, int b3, int b2, int b1) {

		setBits(b4, b3, b2, b1);

		// diese Methode berechnet den Dezimalwert
		setDecimal();

	}

	void setBits(int b4, int b3, int b2, int b1) {

		bit1 = b1;
		bit2 = b2;
		bit3 = b3;
		bit4 = b4;

	}

	public int getDecimal() {
		return decimal;
	}

	/*
	 * setDecimal wandelt eine vierstellige Binaerzahl in einen Dezimalwert um. Die
	 * vierstellige Binaerzahl besteht aus den vier Werten bit4 bit3 bit2 bit1,
	 * wobei bit<i> fuer die 2 hoch (i-1)-te Potenz steht.
	 * 
	 * Sie koennen auf bit<i> mit der Anweisung this.biti zugreifen.
	 * 
	 */

	void setDecimal() {

		if(this.bit1=1) {}
		
		
		/*
		 * Hier schreiben Sie Ihre Loesung rein.
		 * 
		 * Zum Testen koennen Sie die Bits in den Klammern in Zeile x in Main.java
		 * aendern.
		 * 
		 * Die Variablen bit1 bis bit4 sind bereits mit den Werten aus der Main-Methode
		 * in Zeile x initialisiert. Sie koennen mit diesen Variablen arbeiten, indem
		 * Sie mittels this.bit1 bis this.bit4 darauf zugreifen.
		 * 
		 * Ihr Ergebnis speichern Sie in der Variablen 'this.decimal'. Ganz am Ende
		 * Ihrer Loesung muss also die Zeile mit this.decimal = anfangen.
		 * 
		 */

	}

}