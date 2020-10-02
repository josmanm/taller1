/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.justeat.commons.domain;

import java.util.List;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class Restaurant {
     private int resId;
    private int adminId;
    private String resNom;
    private String resDireccion;
    private String resCiudad;
    private String resTematicaComida;
    private List<Menu> listaMenus;
    

    public Restaurant(int resId, int adminId, String resNom, String resDireccion, String resCiudad, String resTematicaComida) {
        this.resId = resId;
        this.adminId = adminId;
        this.resNom = resNom;
        this.resDireccion = resDireccion;
        this.resCiudad = resCiudad;
        this.resTematicaComida = resTematicaComida;
    }
    public Restaurant(){
    }

    public int getResId() {
        return resId;
    }

    public int getAdminId() {
        return adminId;
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

    public List<Menu> getListaMenus() {
        return listaMenus;
    }
    
    public void setResId(int resId) {
        this.resId = resId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
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

    public void setListaMenus(Menu parMenu) {
        listaMenus.add(parMenu);
    }
}
