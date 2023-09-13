/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author juansex
 */
public class Persona {
    //declaracion de atributos
    public String nombres;
    public String apellidos;
    public String ciudad_nacimiemto;
    public String dpto_nacimiemto;
    public String sexo;
    public int cedula;
    public int año_nacimiento;
    
    //constructor no parametrizado 
    public Persona (){}
    
    //constructor parametrizado

    public Persona(String nombres, String apellidos, String ciudad_nacimiento, String dpto_nacimiento, String sexo, int cedula, int año_nacimiento) {
        this.nombres = nombres;
        this.apellidos= apellidos;
        this.ciudad_nacimiemto= ciudad_nacimiento;
        this.dpto_nacimiemto= dpto_nacimiento;
        this.sexo= sexo;
        this.cedula = cedula;
        this.año_nacimiento = año_nacimiento;
    }
   
    //setters

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCiudad_nacimiemto(String ciudad_nacimiemto) {
        this.ciudad_nacimiemto = ciudad_nacimiemto;
    }

    public void setDpto_nacimiemto(String dpto_nacimiemto) {
        this.dpto_nacimiemto = dpto_nacimiemto;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setAño_nacimiento(int año_nacimiento) {
        this.año_nacimiento = año_nacimiento;
    }
    
    //getters

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCiudad_nacimiemto() {
        return ciudad_nacimiemto;
    }

    public String getDpto_nacimiemto() {
        return dpto_nacimiemto;
    }

    public String getSexo() {
        return sexo;
    }
  
    public int getCedula() {
        return cedula;
    }

    public int getAño_nacimiento() {
        return año_nacimiento;
    }
    
}
