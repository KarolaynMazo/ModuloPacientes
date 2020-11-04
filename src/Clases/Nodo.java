
package Clases;


public class Nodo {
    public int cedula; 
    public String nombre;
    public int edad;
    public String genero;
    public String observaciones;
    public Nodo siguiente; //referencia al Nodo anterior conectado.
    

    public Nodo(int cedula,String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println(nombre + " - " + cedula + " - " + edad);
    }

    public String toString() {
        return cedula + " | " + nombre + " | " + edad + " años" + " | " + genero;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
   

    
    
}
