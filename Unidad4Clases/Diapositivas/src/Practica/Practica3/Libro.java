package Practica.Practica3;

import Utilities.Table;

public class Libro {

    private String isbn;

    private String titulo;

    private int ano;

    private double price;

    private Editorial editorial;

    public Libro(){}

    public Libro(String isbn, String titulo, int ano, double price) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.ano = ano;
        this.price = price;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void print()
    {
        Table.instance()
                .addRow("Libro")
                .addRow(this.titulo)
                .addRow("ISBN", this.isbn)
                .addRow( "año", this.ano+"")
                .addRow( "Precio", this.price+"")
                .print();
    }
}
