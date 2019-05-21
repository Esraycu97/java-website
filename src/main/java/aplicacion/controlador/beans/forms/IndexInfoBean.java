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

    public List<Object> fillCabildo() {
        List<Object> list = new ArrayList<>();
        list.add(new Place("18 de diciembre de 1837","MADRID 1000"));
        setCabildo(list);
        return getCabildo();
    }
    
    public List<Object> fillCasaGobierno() {
        List<Object> list = new ArrayList<>();
        list.add(new Place("19 de octubre de 1954","San Martin 100"));
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
