package entidades;

import java.util.Date;
import java.util.List;

public class TP {
	private Materia materiaAsociada;
	private Date fechaEntrega;
	private List<String> actividades;
	private float nota;
	public TP(Materia materiaAsociada, Date fechaEntrega, List<String> actividades, float nota) {
		super();
		this.materiaAsociada = materiaAsociada;
		this.fechaEntrega = fechaEntrega;
		this.actividades = actividades;
		this.nota = nota;
	}
	public TP() {
		super();
	}
	public Materia getMateriaAsociada() {
		return materiaAsociada;
	}
	public void setMateriaAsociada(Materia materiaAsociada) {
		this.materiaAsociada = materiaAsociada;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public List<String> getActividades() {
		return actividades;
	}
	public void setActividades(List<String> actividades) {
		this.actividades = actividades;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
	
}
