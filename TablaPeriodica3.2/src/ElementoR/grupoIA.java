package ElementoR;
public class grupoIA extends ElementosQ{
    //MÉTODO CONSTRUCTOR HEREDADO
    
    public grupoIA(String nombreE, String simbolo, int z, String mnemo, int peso) {
        super(nombreE, simbolo, z, mnemo, peso);
    }

    @Override
    public int grupo() {
        return 1;
    }

    @Override
    public String nombre() {
        return "Alcalinos";
    }
}
