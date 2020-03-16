/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron;

/**
 *
 * @author Administrador
 */
public class Consola implements Cloneable {

    private String color;
    private String nombre;
    private String descripcion;

    public String encender() {
        return "Bienvenido a " + nombre + " :: " + descripcion;
    }

    @Override
    public Consola clone() {
        Consola consolaClonada = null;
        try {
            consolaClonada = (Consola) super.clone();
            consolaClonada.setColor(color);
            consolaClonada.setDescripcion(descripcion);
            consolaClonada.setNombre(nombre);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return consolaClonada;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
