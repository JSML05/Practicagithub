/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Persona;
import java.util.Scanner;

/**
 *
 * @author juansex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // declaracion de variables 
        String nombres= "";
        String apellidos= "";
        String profesion= "";
        String ciudad_nacimiento= "";
        String dpto_nacimiento= "";
        String sexo= "";
        String estado_civil= "";
        int año_inicio_laboral= 0;
        int cedula= 0;
        int año_nacimiento= 0;
        int edad= 0;
        int años_laborando=0;
        
        //creacion de objeto
        Persona objpersona1 = new Persona ();
        //fijacion del objeto
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite los nombres de la persona: ");
        nombres= scan.nextLine();
        objpersona1.setNombres(nombres);
        
        System.out.println("Digite los apellidos de la personas: ");
        apellidos= scan.nextLine();
        objpersona1.setApellidos(apellidos);
        
        System.out.println("Digite la profesion de la persona: ");
        profesion= scan.nextLine();
        objpersona1.setProfesion(profesion);
        
        System.out.println("Digite la Ciudad de nacimiento de la persona: ");
        ciudad_nacimiento= scan.nextLine();
        objpersona1.setCiudad_nacimiemto(ciudad_nacimiento);
        
        System.out.println("Digite el departamento de nacimiento de la persona: ");
        dpto_nacimiento= scan.nextLine();
        objpersona1.setDpto_nacimiemto(dpto_nacimiento);
        
        System.out.println("Digite el sexo de la persona: ");
        sexo= scan.nextLine();
        objpersona1.setSexo(sexo);
        
        System.out.println("Digite el estado civil de la persona: ");
        estado_civil= scan.nextLine();
        objpersona1.setEstado_civil(estado_civil);
        
        System.out.println("Digite el año de inicio laboral de la persona: ");
        año_inicio_laboral= scan.nextInt();
        objpersona1.setAño_inicio_laboral(año_inicio_laboral);
        
        System.out.println("Digite el numero de cedula de la persona: ");
        cedula= scan.nextInt();
        objpersona1.setCedula(cedula);
        
        System.out.println("Digite el año de nacimiento de la persona: ");
        año_nacimiento= scan.nextInt();
        objpersona1.setAño_nacimiento(año_nacimiento);
        
        //operaciones
        edad= 2023-objpersona1.getAño_nacimiento();
        años_laborando= 2023-objpersona1.getAño_inicio_laboral();
        
        //creacion de objeto con constructor parametrizado
        Persona objpersona = new Persona(nombres, apellidos, profesion, ciudad_nacimiento, dpto_nacimiento, sexo, estado_civil, año_inicio_laboral, cedula, año_nacimiento);
        
        //impresion en pantalla
        System.out.println("Documento de identidad digital: ");
        System.out.println("Nombres: "+"\t"+ objpersona1.getNombres());
        System.out.println("Apellidos: "+"\t"+ objpersona1.getApellidos());
        System.out.println("Profesion: "+"\t"+ objpersona1.getProfesion());
        System.out.println("Años laborando: "+"\t"+ años_laborando);
        System.out.println("Ciudad y departamento de nacimiento:"+"\t"+ objpersona1.getCiudad_nacimiemto()+"- "+objpersona1.getDpto_nacimiemto());
        System.out.println("Sexo: "+"\t"+ objpersona1.getSexo());
        System.out.println("Estado civil: "+"\t"+ objpersona1.getEstado_civil());
        System.out.println("Numero: "+"\t"+ objpersona1.getCedula());
        System.out.println("Año de nacimiento: "+"\t"+ objpersona1.getAño_nacimiento());
        System.out.println("Edad: "+"\t"+ edad);
        System.out.println("                                 ");
        System.out.println("                                 ");
        System.out.println("Documento de identidad digital: ");
        System.out.println("Nombres: "+"\t"+ objpersona.getNombres());
        System.out.println("Apellidos: "+"\t"+ objpersona.getApellidos());
        System.out.println("Profesion: "+"\t"+ objpersona.getProfesion());
        System.out.println("Años laborando: "+"\t"+ años_laborando);
        System.out.println("Ciudad y departamento de nacimiento:"+"\t"+ objpersona.getCiudad_nacimiemto()+"-"+objpersona.getDpto_nacimiemto());
        System.out.println("Sexo: "+"\t"+ objpersona.getSexo());
        System.out.println("Estado civil: "+"\t"+ objpersona1.getEstado_civil());
        System.out.println("Numero: "+"\t"+ objpersona.getCedula());
        System.out.println("Año de nacimiento: "+"\t"+ objpersona.getAño_nacimiento());
        System.out.println("Edad: "+"\t"+ edad);
       
    }
    
}
