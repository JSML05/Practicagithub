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
    public String profesion;
    public String ciudad_nacimiemto;
    public String dpto_nacimiemto;
    public String sexo;
    public String estado_civil;
    public int año_inicio_laboral;
    public int cedula;
    public int año_nacimiento;



//constructor no parametrizado 
    public Persona (){}
    
    //constructor parametrizado

    public Persona(String nombres, String apellidos, String profesion, String ciudad_nacimiento, String dpto_nacimiento, String sexo, String estado_civil, int año_inicio_laboral, int cedula, int año_nacimiento) {
        this.nombres = nombres;
        this.apellidos= apellidos;
        this.profesion= profesion;
        this.ciudad_nacimiemto= ciudad_nacimiento;
        this.dpto_nacimiemto= dpto_nacimiento;
        this.sexo= sexo;
        this.estado_civil= estado_civil;
        this.año_inicio_laboral= año_inicio_laboral;
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

    public void setProfesion(String profesion) {
        this.profesion = profesion;
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
    
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public void setAño_inicio_laboral(int año_inicio_laboral) {
        this.año_inicio_laboral = año_inicio_laboral;
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

    public String getProfesion() {
        return profesion;
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
    public String getEstado_civil() {
        return estado_civil;
    }

    public int getAño_inicio_laboral() {
        return año_inicio_laboral;
    }
        
    public int getCedula() {
        return cedula;
    }

    public int getAño_nacimiento() {
        return año_nacimiento;
    }
    
}
