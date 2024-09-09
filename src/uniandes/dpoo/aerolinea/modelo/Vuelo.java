package uniandes.dpoo.aerolinea.modelo;

import java.util.List;

public class Vuelo {
    private Ruta ruta;
    private Avion avion;
    private List<Tiquete> tiquetes; 
    public String fecha;

    
    // Constructor
    public Vuelo(Ruta ruta, Avion avion) {
        this.ruta = ruta;
        this.avion = avion;
        this.estado = estado;
    }
    
    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    
    public Avion getAvion() {
        return avion;
    }
    
    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    


    public List<Tiquete> getTiquetes() {
        return tiquetes;
    }

    public void setTiquetes(List<Tiquete> tiquetes) {
        this.tiquetes = tiquetes;
    }

    // Método según el UML: mostrarListaClientes
    public void mostrarListaClientes() {
        System.out.println("Clientes en el vuelo " + codVuelo + ":");
        for (Tiquete tiquete : tiquetes) {
            Cliente cliente = tiquete.getCliente();
            System.out.println(cliente.getNombre());  // Asumimos que Cliente tiene un método getNombre()
        }
    }

    // Método según el UML: calcularTotalTiquetes
    public double calcularTotalTiquetes() {
        double total = 0;
        for (Tiquete tiquete : tiquetes) {
            total += tiquete.getPrecio();  // Asumimos que Tiquete tiene un método getPrecio()
        }
        return total;
    }
}