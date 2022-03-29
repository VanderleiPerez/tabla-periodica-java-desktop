package ElementoR;
public class grupoVIA extends ElementosQ{
    //MÉTODO CONSTRUCTOR HEREDADO
    public grupoVIA(String nombreE, String simbolo, int z, String mnemo, int peso) {
        super(nombreE, simbolo, z, mnemo, peso);
    }
    @Override
    public int grupo() {
       return 6;
    }

    @Override
    public String nombre() {
        return "Anfigenos";
    }
    
}
