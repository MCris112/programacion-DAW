package com.darkredgm.formulariogui;

public class FormData {

    private String nombre, telefono, direccion, genero, imageUrl, nacimiento;

    public FormData(String nombre, String telefono, String direccion, String genero) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getGenero() {
        return genero;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String day, String month, String year) {
        this.nacimiento = "%s/%s/%s".formatted(day, month, year);
    }

    @Override
    public String toString() {
        return "FormData{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", genero='" + genero + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
