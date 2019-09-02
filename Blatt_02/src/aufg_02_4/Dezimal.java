/* * 
 * Meine Matrikelnummer lautet: 
 * Die Matrikelnummer meiner mitabgebenden KommilitonInnen lautet: 
 * Wir sind in Gruppe   
 * 
 */

package aufg_02_4;

public class Dezimal {

	int bit1=0; // steht fuer das Bit ganz rechts in der Binaerkodierung, Zugriff: this.bit1
	int bit2=0;
	int bit3=0;
	int bit4=0; // Bit ganz links in der Binaerkodierung, Zugriff: this.bit4

	int dez=0;

	Dezimal(int d) {
		dez = d;
	}
	
		

	/*
	 * getBinary soll eine Dezimalzahl, kodiert als Binaerzahl, auf die Konsole
	 * ausgeben.
	 * 
	 * Ihre Aufgabe ist es, dort, wo Sie Ihre Loesung reinschreiben, dafuer zu
	 * sorgen, dass bit1 bis bit4 richtig belegt sind. Dabei steht bit<i> fuer die 2
	 * hoch (i-1)te Potenz.
	 *
	 * In Zeile y der Main-Methode wird die Zahl 8 eingegeben. Das heisst, auf der
	 * Konsole sollte mit Ihrer Loesung 1000 ausgegeben werden.
	 * 
	 * Sie koennen mit den Variablen bit1 bis bit4 losarbeiten, indem Sie mittels
	 * this.biti auf diese referenzieren. Bei der Umwandlung der Dezimalzahl in
	 * eine Binaerzahl speichern Sie die Werte der Bits in den Variablen this.bit1
	 * bis this.bit4.
	 * 
	 * Beispiel 8: this.bit1, this.bit2 und this.bit3 muessen den Wert 0 und
	 * this.bit4 den Wert 1 erhalten.
	 * 
	 */

	public String getBinary() {

		/*
		 * Hier schreiben Sie Ihre Loesung rein.
		 * 
		 * return ... muss unbedingt bleiben. Diese Anweisung bildet den Abschluss Ihrer
		 * Loesung.
		 */

		return Integer.toString(this.bit4) + Integer.toString(this.bit3) + Integer.toString(this.bit2)
				+ Integer.toString(this.bit1);

	}

}