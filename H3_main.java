package h3;

public class H3_main {

	public static void main(String[] args) {
	
		 int[][] einheiten = {
		            {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},  // Erste Zeile: Werte der Münzen und Scheine
		            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}  // Zweite Zeile: Anzahl der benötigten Münzen/Scheine
		        };

		       
		        int input = 6279;  

		       
		        for (int i = 0; i < einheiten[0].length; i++) {
		            // Berechnen, wie oft das aktuelle Geldstück in den Betrag passt
		            if (input >= einheiten[0][i]) {
		                einheiten[1][i] = input / einheiten[0][i];  
		                input %= einheiten[0][i];  // Restbetrag
		            }
		        }

		        System.out.println("Zerlegung des Betrags in möglichst wenige Scheine und Münzen:");
		        for (int i = 0; i < einheiten[0].length; i++) {
		            if (einheiten[1][i] > 0) {
		                System.out.println(einheiten[0][i] / 100.0 + " Euro: " + einheiten[1][i] + " mal");
		            }
		        }
	}

}
