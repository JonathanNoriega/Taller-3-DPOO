package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente {
    // Constante
    public static final String NATURAL = "Natural";

    // Atributos específicos
    private String nombre;

    // Constructor
    public ClienteNatural(String nombre) {
        this.nombre = nombre;
    }

    // Implementación de métodos abstractos
    @Override
    public String getTipoCliente() {
        return NATURAL;
    }

    @Override
    public String getIdentificador() {
        return nombre;
    }

    @Override
    public void agregarTiquete(Tiquete tiquete) {
        if (tiquete != null) {
            tiquetes.add(tiquete);
        }    
    }

    @Override
    public int calcularValorTotalTiquetes() {
        int totalValor = 0;
        for (Tiquete tiquete : tiquetes) {
            totalValor += tiquete.getPrecio();
        }
        return totalValor;
    }

    @Override
    public void usarTiquetes(Vuelo vuelo) {
        for (Tiquete tiquete : tiquetes) {
            if (tiquete.getVuelo().equals(vuelo)) {
                tiquete.setUsado(true);
            }
        }
    }

    // Métodos adicionales
    public String getNombre() {
        return nombre;
    }
}
