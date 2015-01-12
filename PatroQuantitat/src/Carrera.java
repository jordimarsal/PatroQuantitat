import java.util.ArrayList;

public class Carrera {
	private String name;

	private ArrayList<Poblacio> poblacions;

	private Distancia distancia;

	public Carrera(String name) {
		this.name = name;
		poblacions = new ArrayList<Poblacio>();
	}

	public Distancia getDistancia() {
		return distancia;
	}

	public void setDistancia(Distancia distancia) {
		this.distancia = distancia;
	}

	public void addPoblacio(Poblacio nomP) {
		poblacions.add(nomP);
	}

	@Override
	public String toString() {
		return name + ": " + distancia;
	}

}
