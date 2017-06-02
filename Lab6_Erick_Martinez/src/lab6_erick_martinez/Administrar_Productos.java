/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_erick_martinez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Administrar_Productos {

    public ArrayList<Productos> listaProductos = new ArrayList();
    public File archivo = null;

    public Administrar_Productos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setProducto(Productos p){
        this.listaProductos.add(p);
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            for (Productos p : listaProductos) {
                bw.write(p.getNombre() + ";");
                bw.write(p.getCategoria() + ";");
                bw.write(p.getPrecio() + ";");
                bw.write(p.getNombre() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void CargarArchivo(){
        Scanner sc = null;
        listaProductos = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while(sc.hasNext()){
                listaProductos.add(new Productos(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble()));
            }
        } catch (Exception e) {
        }
    }
}
