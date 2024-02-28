/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrcn_pck_alumno;

/**
 *
 * @author cristian
 */
public class Alumno {

	private final String nombres;
	private final String apellidoPaterno;
	private final String apellidoMaterno;
	private final String numeroControl;
	private final char genero;
	private final String carrera;

	public Alumno(String nombres, String apellidoPaterno, String apellidoMaterno, String numeroControl, char genero, String carrera) {
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.numeroControl = numeroControl;
		this.genero = genero;
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		String generoStr = (genero == 'M') ? "Masculino" : "Femenino";
		return "Nombre: " + nombres + "\n"
			+ "Apellido Paterno: " + apellidoPaterno + "\n"
			+ "Apellido Materno: " + apellidoMaterno + "\n"
			+ "Numero de Control: " + numeroControl + "\n"
			+ "Carrera: " + carrera + "\n"
			+ "Genero: " + generoStr;
	}
	
}
