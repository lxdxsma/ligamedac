/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesiones;

/**
 *
 * @author victo
 */
public class Lesion {
    private String lesionAlta;
    private String lesionMedia;
    private String lesionBaja;

    public Lesion(String lesionAlta, String lesionMedia, String lesionBaja) {
        this.lesionAlta = lesionAlta;
        this.lesionMedia = lesionMedia;
        this.lesionBaja = lesionBaja;
    }

    public String getLesionAlta() {
        return lesionAlta;
    }

    public void setLesionAlta(String lesionAlta) {
        this.lesionAlta = lesionAlta;
    }

    public String getLesionMedia() {
        return lesionMedia;
    }

    public void setLesionMedia(String lesionMedia) {
        this.lesionMedia = lesionMedia;
    }

    public String getLesionBaja() {
        return lesionBaja;
    }

    public void setLesionBaja(String lesionBaja) {
        this.lesionBaja = lesionBaja;
    }
    


}
