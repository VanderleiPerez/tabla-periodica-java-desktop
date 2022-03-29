package ElementoR;
public class grupoVA extends ElementosQ{
    //MÉTODO CONSTRUCTOR HEREDADO
    public grupoVA(String nombreE, String simbolo, int z, String mnemo, int peso) {
        super(nombreE, simbolo, z, mnemo, peso);
    }
    @Override
    public int grupo() {
        return 5;
    }

    @Override
    public String nombre() {
        return "Nitrogenoides";
    }
    
}
