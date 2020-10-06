/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.justeat.commons.domain;

/**
 *
 * @author juang
 */
public class Admin {

    private int adminid;
    private String adminNombre;
    private String adminApellido;

    public Admin(int adminid, String adminNombre, String adminApellido) {
        this.adminid = adminid;
        this.adminNombre = adminNombre;
        this.adminApellido = adminApellido;
    }

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getAdminNombre() {
        return adminNombre;
    }

    public void setAdminNombre(String adminNombre) {
        this.adminNombre = adminNombre;
    }

    public String getAdminApellido() {
        return adminApellido;
    }

    public void setAdminApellido(String adminApellido) {
        this.adminApellido = adminApellido;
    }

}
