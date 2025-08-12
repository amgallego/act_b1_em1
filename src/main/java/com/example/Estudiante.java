package com.example;

public class Estudiante {
    // TODO: Declarar atributos privados para nombre, edad y promedio

    private String nombre;
    private int edad;
    private double promedio; 
    
    // TODO: Crear constructor que reciba nombre, edad y promedio como parámetros

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre= nombre;
        this.edad= edad;
        this.promedio= promedio;
    }
    
    // TODO: Implementar métodos getter para cada atributo

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public double getPromedio(){
        return promedio;
    }
    
    // TODO: Implementar métodos setter para cada atributo
    // Nota: En el setter de edad, validar que sea mayor o igual a 0
    // Nota: En el setter de promedio, validar que esté entre 0.0 y 10.0

    public void setNombre(String nombre) {
    if (nombre == null ) {
        throw new IllegalArgumentException("El nombre no puede ser nulo");
    }
    this.nombre = nombre;
}

public void seteEdad(int edad) {
    if (edad>=0) {
        throw new IllegalArgumentException("tiene que ser mayor o igual a cero ");
    }
    this.edad = edad;
}

public void setPromedio(double promedio) {
    if (promedio  >= 0.0 && promedio < 10.0) {
        throw new IllegalArgumentException("elige un numero del o al 10");
    }
    this.promedio = promedio;
}
    
    // TODO: Crear método mostrarInformacion que imprima los datos del estudiante
    
   public void  mostrarInformacion(){
    System.out.println("nombre: " + this.nombre);
    System.out.println("edad: " + this.edad);
    System.out.println("promedio: " + this.promedio);
    
   }
}
