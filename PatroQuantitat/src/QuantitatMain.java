public class QuantitatMain {

	public static void main(String[] args) {

		Carrera sansil = new Carrera("San Silvestre");
		sansil.setDistancia(new Distancia(12.0f, "Kms"));

		Poblacio bcn = new Poblacio("Barcelona");

		bcn.addCarrera(sansil);
		sansil.addPoblacio(bcn);

		System.out.println(bcn);

	}

}
