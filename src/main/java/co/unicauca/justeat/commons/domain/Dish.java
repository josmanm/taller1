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
    private  String PlatoId;
    private String PlanNom;
    private String  PlaDesc;
    private double PlaPrecio;

    public Dish(String platoId, String planNom, String placDesc, double plaPrecio) {
        this.PlatoId = platoId;
        this.PlanNom = planNom;
        this.PlaDesc = placDesc;
        this.PlaPrecio = plaPrecio;
    }

    public String getPlatoId() {
        return PlatoId;
    }

    public String getPlanNom() {
        return PlanNom;
    }
    public String getPlaDesc(){
        return PlaDesc;
    }
    public String getPlacDesc() {
        return PlaDesc;
    }

    public double getPlaPrecio() {
        return PlaPrecio;
    }

    public void setPlatoId(String platoId) {
        this.PlatoId = platoId;
    }

    public void setPlanNom(String planNom) {
        this.PlanNom = planNom;
    }

    public void setPlacDesc(String placDesc) {
        this.PlaDesc = placDesc;
    }

    public void setPlaPrecio(double plaPrecio) {
        this.PlaPrecio = plaPrecio;
    }
    
    
}
