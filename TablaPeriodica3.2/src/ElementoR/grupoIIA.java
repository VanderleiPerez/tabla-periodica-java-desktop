package ElementoR;
public class grupoIIA extends ElementosQ{
    //MÉTODO CONSTRUCTOR HEREDADO
    public grupoIIA(String nombreE, String simbolo, int z, String mnemo, int peso) {
        super(nombreE, simbolo, z, mnemo, peso);
    }
    @Override
    public int grupo() {
        return 2;
    }

    @Override
    public String nombre() {
        return "Alcalinos terreos";
    }
    
}
