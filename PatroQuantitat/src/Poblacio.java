import java.util.ArrayList;

public class Poblacio {

	private String nom;

	private ArrayList<Carrera> carrera;

	public Poblacio(String nom) {
		this.setNom(nom);
		carrera = new ArrayList<Carrera>();
	}

	public String getNom() {
		return nom;
	}

	private void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList getCarrera() {
		return carrera;
	}

	public void addCarrera(Carrera carrera) {
		this.carrera.add(carrera);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Carreres a ");
		sb.append(nom).append(":\n");
		for (Carrera c : carrera) {
			sb.append(c).append("\n");
		}
		return sb.toString();
	}

}
