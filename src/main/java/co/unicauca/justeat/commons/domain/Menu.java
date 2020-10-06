/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.justeat.commons.domain;


import java.util.Date;
import java.util.List;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class Menu {
    private int menuId;
    private String menuNom;
    private Date menuFecVi;
    private List<Dish> listaPlatos;
    

    public Menu(int menuId, String menuNom, Date menuFecVi) {
        this.menuId = menuId;
        this.menuNom = menuNom;
        this.menuFecVi = menuFecVi;
    }

    public int getMenuId() {
        return menuId;
    }

    public String getMenuNom() {
        return menuNom;
    }

    public Date getMenuFecVi() {
        return menuFecVi;
    }

    public List<Dish> getListaPlatos() {
        return listaPlatos;
    }
    
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public void setMenuNom(String menuNom) {
        this.menuNom = menuNom;
    }

    public void setMenuFecVi(Date menuFecVi) {
        this.menuFecVi = menuFecVi;
    }

    public void setListaPlatos(Dish parPlato) {
        listaPlatos.add(parPlato) ;
    }
    
    
}