/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_erick_martinez;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Clientes {
    public ArrayList<Productos> producto = new ArrayList();
    public String nombre;
    public int edad;

    public Clientes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public ArrayList<Productos> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Productos> producto) {
        this.producto = producto;
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

    @Override
    public String toString() {
        return nombre;
    }
    
}
