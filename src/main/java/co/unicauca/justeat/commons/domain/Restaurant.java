package co.unicauca.justeat.commons.domain;

import java.util.List;

/**
 *
 * @author SANTIAGO MUÑOZ
 *         KEVIN ALARCON
 *         JUAN JOSE LOPEZ
 *         SANTIAGO CORDOBA
 *         DANIEL MUÑOZ
 */
public class Restaurant {

    private String resId;
    private String UserName;
    private String resNom;
    private String resDireccion;
    private String resCiudad;
    private String resTematicaComida;
    //private List<Menu> listaMenus;

    public Restaurant(String resId, String UserName, String resNom, String resDireccion, String resCiudad, String resTematicaComida) {
        this.resId = resId;
        this.UserName = UserName;
        this.resNom = resNom;
        this.resDireccion = resDireccion;
        this.resCiudad = resCiudad;
        this.resTematicaComida = resTematicaComida;
    }

    public Restaurant() {
    }

    public String getResId() {
        return resId;
    }

    public String getUserName() {
        return UserName;
    }
    
    public String getResNom() {
        return resNom;
    }

    public String getResDireccion() {
        return resDireccion;
    }

    public String getResCiudad() {
        return resCiudad;
    }

    public String getResTematicaComida() {
        return resTematicaComida;
    }

//    public List<Menu> getListaMenus() {
//        return listaMenus;
//    }

    public void setResId(String resId) {
        this.resId = resId;
    }
    public void setResNom(String resNom) {
        this.resNom = resNom;
    }

    public void setResDireccion(String resDireccion) {
        this.resDireccion = resDireccion;
    }

    public void setResCiudad(String resCiudad) {
        this.resCiudad = resCiudad;
    }

    public void setResTematicaComida(String resTematicaComida) {
        this.resTematicaComida = resTematicaComida;
    }
    
//    public void setListaMenus(Menu parMenu) {
//        listaMenus.add(parMenu);
//    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
}
