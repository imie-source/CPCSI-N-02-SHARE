/**
 * 
 */
package fr.imie;

/**
 * @author imie
 *
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Client client = new Client();
		client.setBienHabille(true);
		BoiteDeNuitInterface boiteDeNuitReal = new BoiteDeNuit();
		BoiteDeNuitInterface boiteDeNuit = new BoiteDeNuitProxy(boiteDeNuitReal);
		boiteDeNuit.entrer(client);

	}

}
