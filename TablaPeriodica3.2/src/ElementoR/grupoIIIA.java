
package ElementoR;
public class grupoIIIA extends ElementosQ{
    //MÉTODO CONSTRUCTOR HEREDADO
    public grupoIIIA(String nombreE, String simbolo, int z, String mnemo, int peso) {
        super(nombreE, simbolo, z, mnemo, peso);
    }
    @Override
    public int grupo() {
        return 3;
    }

    @Override
    public String nombre() {
        return "Boroides";
    }
}