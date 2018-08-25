package com.example.mg2013_0864.recyclercardview;

public class MarcaPais {
    private String marca;
    private String pais;

    public MarcaPais(String marca, String pais){
        this.marca = marca;
        this.pais = pais;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getPais(){
        return this.pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }
}
