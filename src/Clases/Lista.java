package Clases;

public class Lista {

    Nodo cabeza;
    int cantidad_nodos;

    public Lista() {
        cabeza = null;
        cantidad_nodos = 0;
    }

    public boolean estaVacio() {
        return (cabeza == null);
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public int getCantidad_nodos() {
        return cantidad_nodos;
    }

    public void insertarPrimerNodo(String nombre, int cedula, int edad, int genero, String observaciones) {
            
       
        Nodo nuevoNodo = new Nodo(cedula, nombre, edad);
         if (genero == 1) {
            nuevoNodo.setGenero("Femenino");
        } else {
            if (genero == 2) {
                nuevoNodo.setGenero("Masculino");
            } else {
                nuevoNodo.setGenero("Otro");
            }

        }
        nuevoNodo.setObservaciones(observaciones);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        cantidad_nodos++;
    }
    
    public void cuantos(){
        System.out.println("Hay "+cantidad_nodos+ ((cantidad_nodos == 1)? " nodo" : " nodos"));
    }

    public Nodo EliminarPrimero() {

        Nodo referencia = cabeza;

        if (!estaVacio()) {
            cabeza = cabeza.siguiente;
        } else {
            System.out.println("Lista esta vacia");
        }
        return referencia;
    }

    public void mostrar() {
        Nodo Nodo = cabeza;
        while (Nodo != null) {
            Nodo.mostrar();
            System.out.println("Siguiente " + Nodo.siguiente);
            Nodo = Nodo.siguiente;
            System.out.println();
        }
    }

    public Nodo buscar(int cedula) {

        Nodo nodo = cabeza;

        if (!estaVacio()) {

            while (nodo.cedula != cedula) {

                if (nodo.siguiente == null) {
                    return null;
                } else {
                    nodo = nodo.siguiente;
                }
            }
        } else {
            System.out.println("Lista esta vacia");
        }
        return nodo;
    }

    public Nodo EliminarNodo(int cedula) {

        Nodo nodoActual = cabeza;
        Nodo nodoSiguiente = cabeza;

        while (nodoActual.cedula != cedula) {

            if (nodoActual.siguiente == null) {
                return null;
            } else {
                nodoSiguiente = nodoActual;
                nodoActual = nodoActual.siguiente;
            }
        }

        if (nodoActual == cabeza) {
            cabeza = cabeza.siguiente;

        } else {
            nodoSiguiente.siguiente = nodoActual.siguiente;
        }

        return nodoActual;

    }

}

