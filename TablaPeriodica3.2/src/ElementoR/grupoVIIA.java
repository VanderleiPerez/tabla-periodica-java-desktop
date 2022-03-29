
package ElementoR;
public class grupoVIIA extends ElementosQ{
    //MÉTODO CONSTRUCTOR HEREDADO
    public grupoVIIA(String nombreE, String simbolo, int z, String mnemo, int peso) {
        super(nombreE, simbolo, z, mnemo, peso);
    }
    @Override
    public int grupo() {
        return 7;
    }

    @Override
    public String nombre() {
        return "Halogenos";
    }
    
}
