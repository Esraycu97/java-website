/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Place;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author alexa
 */

@ManagedBean
@ViewScoped
public class IndexInfoBean {
    private List<Object> cabildo;
    private List<Object> casaGobierno;

    /**
     *  Llena los campos del objeto de tipo Place, en este caso el cabildo.
     * @return 
     */
    public List<Object> fillCabildo() {
        List<Object> list = new ArrayList<>();
        list.add(new Place("17 de Abril de 1593","Gral. Belgrano 493, San Salvador de Jujuy"));
        setCabildo(list);
        return getCabildo();
    }
    /**
     * Llena los campos del objeto de tipo Place, en este caso la casa de gobierno.
     * @return 
     */
    public List<Object> fillCasaGobierno() {
        List<Object> list = new ArrayList<>();
        list.add(new Place("10 de noviembre de 1921","San Martin 450, San Salvador de Jujuy"));
        setCasaGobierno(list);
        return getCasaGobierno();
    }

    /**
     * @return the cabildo
     */
    public List<Object> getCabildo() {
        return cabildo;
    }

    /**
     * @param cabildo the cabildo to set
     */
    public void setCabildo(List<Object> cabildo) {
        this.cabildo = cabildo;
    }

    /**
     * @return the casaGobierno
     */
    public List<Object> getCasaGobierno() {
        return casaGobierno;
    }

    /**
     * @param casaGobierno the casaGobierno to set
     */
    public void setCasaGobierno(List<Object> casaGobierno) {
        this.casaGobierno = casaGobierno;
    }
    
}
