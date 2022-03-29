package ElementoR;
public class grupoVIIIA extends ElementosQ{
    //MÉTODO CONSTRUCTOR HEREDADO
   public grupoVIIIA(String nombreE, String simbolo, int z, String mnemo, int peso) {
        super(nombreE, simbolo, z, mnemo, peso);
    }
    @Override
    public int grupo() {
        return 8;
    }

    @Override
    public String nombre() {
        return "Gases nobles";
    }
    
}
