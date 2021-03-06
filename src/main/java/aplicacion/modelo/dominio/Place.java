/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author alexa
 */
public class Place {
    private String fechaFundacion;
    private String ubicacion;
    /**
     * Constructor del objeto Place que se usa para guardar los datos en forma general para lugares historicos.
     * @param fechaFundacion
     * @param ubicacion 
     */
    public Place(String fechaFundacion, String ubicacion) {
        this.fechaFundacion = fechaFundacion;
        this.ubicacion = ubicacion;
    }

    //----Getters y Setters
    /**
     * @return the fechaFundacion
     */
    public String getFechaFundacion() {
        return fechaFundacion;
    }

    /**
     * @param fechaFundacion the fechaFundacion to set
     */
    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
   
}