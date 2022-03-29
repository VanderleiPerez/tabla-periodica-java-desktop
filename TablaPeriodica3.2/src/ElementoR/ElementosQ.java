package ElementoR;


public abstract class ElementosQ {
    // Atributos
    private String nombreE;
    private String simbolo;
    private int z;
    private String mnemo;
    int peso;
    // Método constructor

    public ElementosQ(String nombreE, String simbolo, int z, String mnemo, int peso) {
        this.nombreE = nombreE;
        this.simbolo = simbolo;
        this.z = z;
        this.mnemo = mnemo;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    //Método abstracto
        public abstract int grupo();
        public abstract String nombre();
    // Getters and setters
    public String getNombreE() {
        return nombreE;
    }
    public void setNombreElemento(String nombreE) {
        this.nombreE = nombreE;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getMnemo() {
        return mnemo;
    }

    public void setMnemo(String mnemo) {
        this.mnemo = mnemo;
    }
}
