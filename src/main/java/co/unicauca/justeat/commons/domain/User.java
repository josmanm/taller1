/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.justeat.commons.domain;

/**
 *
 * @author SANTIAGO MUÑOZ
 */
public class User {
    private String UserName;
    private String  UserContrasena;
    private String UserNombre;
    private String  UserApellido;
    private String  UserCedula;
    private String UserCiudad;
    private String UserDireccion;
    private String UserCelular;
    
    public User(){
    } 
    public User(String UserName, String UserContrasena, String UserApellido, String UserCedula, String UserCiudad, String UserDireccion, String UserCelular) {
        this.UserName = UserName;
        this.UserContrasena = UserContrasena;
        this.UserApellido = UserApellido;
        this.UserCedula = UserCedula;
        this.UserCiudad = UserCiudad;
        this.UserDireccion = UserDireccion;
        this.UserCelular = UserCelular;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserContrasena() {
        return UserContrasena;
    }

    public String getUserNombre() {
        return UserNombre;
    }

    public String getUserApellido() {
        return UserApellido;
    }

    public String getUserCedula() {
        return UserCedula;
    }

    public String getUserCiudad() {
        return UserCiudad;
    }

    public String getUserDireccion() {
        return UserDireccion;
    }

    public String getUserCelular() {
        return UserCelular;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setUserContrasena(String UserContrasena) {
        this.UserContrasena = UserContrasena;
    }

    public void setUserNombre(String UserNombre) {
        this.UserNombre = UserNombre;
    }

    public void setUserApellido(String UserApellido) {
        this.UserApellido = UserApellido;
    }

    public void setUserCedula(String UserCedula) {
        this.UserCedula = UserCedula;
    }

    public void setUserCiudad(String UserCiudad) {
        this.UserCiudad = UserCiudad;
    }

    public void setUserDireccion(String UserDireccion) {
        this.UserDireccion = UserDireccion;
    }

    public void setUserCelular(String UserCelular) {
        this.UserCelular = UserCelular;
    }

    
}
