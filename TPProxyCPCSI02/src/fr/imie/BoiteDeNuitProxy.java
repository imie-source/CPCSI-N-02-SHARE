/**
 * 
 */
package fr.imie;

/**
 * @author imie
 *
 */
public class BoiteDeNuitProxy implements BoiteDeNuitInterface {

	private BoiteDeNuitInterface real;
	
	
	
	public BoiteDeNuitProxy(BoiteDeNuitInterface real) {
		super();
		this.real = real;
	}



	/* (non-Javadoc)
	 * @see fr.imie.BoiteDeNuitInterface#entrer(fr.imie.Client)
	 */
	@Override
	public void entrer(Client client) {
		if(client.getBienHabille()){
			real.entrer(client);
		}else{
			System.out.println("tu rentres pas, va te rabiller");
		}

	}

}
