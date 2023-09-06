package entidades;

import java.util.Date;
import java.util.List;

public class Parcial {
	
	private Materia materiaAsociada;
	private Date fecha;
	private List<String> temario;
	private float nota;
	
	
	
	public Parcial() {
		super();
	}



	public Parcial(Materia materiaAsociada, Date fecha, List<String> temario, float nota) {
		super();
		this.materiaAsociada = materiaAsociada;
		this.fecha = fecha;
		this.temario = temario;
		this.nota= nota;
	}
	
	
	
	public float getNota() {
		return nota;
	}



	public void setNota(float nota) {
		this.nota = nota;
	}



	public Materia getMateriaAsociada() {
		return materiaAsociada;
	}
	public void setMateriaAsociada(Materia materiaAsociada) {
		this.materiaAsociada = materiaAsociada;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public List<String> getTemario() {
		return temario;
	}
	public void setTemario(List<String> temario) {
		this.temario = temario;
	}
	
	
	

}
