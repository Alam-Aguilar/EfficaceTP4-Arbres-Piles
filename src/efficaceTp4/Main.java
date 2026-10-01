package efficaceTp4;

public class Main {

	public static void main(String[] args) {
		
		ArbreBinaire<String> monArbre = new ArbreBinaire<>();
		monArbre.addLeft("4");
		monArbre.addRight("13");
		System.out.println(	monArbre.toString());

//		System.out.println(	monArbre.isArbreEmpty());

	}

}
