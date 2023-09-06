package Application;

import entidades.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Materia matematica = new Materia();
		Parcial parcial1 = new Parcial();
		TP tp1 = new TP();
		
		parcial1.setMateriaAsociada(matematica);
		parcial1.setNota(7);
		
		tp1.setMateriaAsociada(matematica);
		tp1.setNota(8);
		
		
		matematica.setNombre("matematica");
		matematica.setAnio(1);
		matematica.setId(1);
		matematica.addParciales(parcial1);
		matematica.addTP(tp1);
		
		
		System.out.println("tu nota del parcial 1 de matematica es:" +matematica.getParciales().get(0).getNota());
	}

}
