package entidades;

import java.util.ArrayList;
import java.util.List;

public class Materia {
	
	private String nombre;
	private int id;
	private int anio;
	private List<Parcial> parciales;
	private List<TP> trabajos_practicos;
	
	
	
	
	
	
	public Materia() {
		super();
		parciales = new ArrayList<Parcial>();
		trabajos_practicos= new ArrayList<TP>();
		//hola
	}
	
	public Materia(String nombre, int id, int anio, List<Parcial> parciales, List<TP> trabajos_practicos) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.anio = anio;
		this.parciales = parciales;
		this.trabajos_practicos = trabajos_practicos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public List<Parcial> getParciales() {
		return parciales;
	}
	public void setParciales(List<Parcial> parciales) {
		this.parciales = parciales;
	}
	public List<TP> getTrabajos_practicos() {
		return trabajos_practicos;
	}
	public void setTrabajos_practicos(List<TP> trabajos_practicos) {
		this.trabajos_practicos = trabajos_practicos;
	}

	public void addParciales(Parcial parcial) {
		// TODO Auto-generated method stub
		parciales.add(parcial);
	}

	public void addTP(TP tp) {
		// TODO Auto-generated method stub
		trabajos_practicos.add(tp);
	}
	
	

}
