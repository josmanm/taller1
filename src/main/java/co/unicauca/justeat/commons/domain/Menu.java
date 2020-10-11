package co.unicauca.justeat.commons.domain;


import java.util.Date;
import java.util.List;

/**
 *
 * @author SANTIAGO MUÑOZ
 *         KEVIN ALARCON
 *         JUAN JOSE LOPEZ
 *         SANTIAGO CORDOBA
 *         DANIEL MUÑOZ
 */
public class Menu {
    private String menuId;
    private String menuNom;
    private Date menuFecVi;
    private List<Dish> listaPlatos;
    

    public Menu(String menuId, String menuNom, Date menuFecVi) {
        this.menuId = menuId;
        this.menuNom = menuNom;
        this.menuFecVi = menuFecVi;
    }

    public String getMenuId() {
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
    
    public void setMenuId(String menuId) {
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