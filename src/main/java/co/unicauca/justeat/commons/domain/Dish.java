package co.unicauca.justeat.commons.domain;

/**
 *
 * @author SANTIAGO MUÑOZ
 *         KEVIN ALARCON
 *         JUAN JOSE LOPEZ
 *         SANTIAGO CORDOBA
 *         DANIEL MUÑOZ
 */
public class Dish {
    private  int platoId;
    private String planNom;
    private String  placDesc;
    private int plaPrecio;

    public Dish(int platoId, String planNom, String placDesc, int plaPrecio) {
        this.platoId = platoId;
        this.planNom = planNom;
        this.placDesc = placDesc;
        this.plaPrecio = plaPrecio;
    }

    public int getPlatoId() {
        return platoId;
    }

    public String getPlanNom() {
        return planNom;
    }

    public String getPlacDesc() {
        return placDesc;
    }

    public int getPlaPrecio() {
        return plaPrecio;
    }

    public void setPlatoId(int platoId) {
        this.platoId = platoId;
    }

    public void setPlanNom(String planNom) {
        this.planNom = planNom;
    }

    public void setPlacDesc(String placDesc) {
        this.placDesc = placDesc;
    }

    public void setPlaPrecio(int plaPrecio) {
        this.plaPrecio = plaPrecio;
    }
    
    
}
