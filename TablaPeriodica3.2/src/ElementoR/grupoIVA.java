
package ElementoR;
public class grupoIVA extends ElementosQ{
    //MÉTODO CONSTRUCTOR HEREDADO
    public grupoIVA(String nombreE, String simbolo, int z, String mnemo, int peso) {
        super(nombreE, simbolo, z, mnemo, peso);
    }
    @Override
    public int grupo() {
        return 4;
    }

    @Override
    public String nombre() {
        return "Carbonoides";
    }
    
}
