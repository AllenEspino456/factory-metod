package instrumento;

public class MainFabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fabricaintrumentos fabrica;
		fabrica = new Fabricaguitar(); 
		instrumento guitarra = fabrica.crearinstrumento();
		guitarra.sonido();
		fabrica = new Fabricatrompeta();
		instrumento trompeta = fabrica.crearinstrumento();
		trompeta.sonido();
	}

}
