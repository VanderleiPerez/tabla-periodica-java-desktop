package ElementoR;
import java.util.ArrayList;
public class Negocio {
     ArrayList<ElementosQ> elem = new ArrayList<>();
    public Negocio() {
       
        // ALCALINOS
        elem.add(new grupoIA("Hidrogeno","H", 1,"H",1));
        elem.add(new grupoIA("Litio","Li", 3,"Li",7));
        elem.add(new grupoIA("Sodio","Na", 11,"Na",23));
        elem.add(new grupoIA("Potasio","K", 19,"K",40));
        elem.add(new grupoIA("Rubidio","Rb", 37,"Rubia",85));
        elem.add(new grupoIA("Cesio","Cs", 55,"Casada",133));
        elem.add(new grupoIA("Francio","Fr", 87,"Frances",223));
        // ALCALINOS TERREOS
        elem.add(new grupoIIA("Berilio","Be", 4,"Be",9));    
        elem.add(new grupoIIA("Magnesio","Mg", 12,"Magnate",24));   
        elem.add(new grupoIIA("Calcio","Ca", 20,"Cayo",40));   
        elem.add(new grupoIIA("Estroncio","Sr", 38,"Señor",88));
        elem.add(new grupoIIA("Bario","Ba", 56,"Ba",137));   
        elem.add(new grupoIIA("Radio","Ra", 88,"Ra",226)); 
        // BOROIDES
        elem.add(new grupoIIIA("Boro", "B", 5,"Barrigón",10));
        elem.add(new grupoIIIA("Aluminio", "Al", 13,"Alan",27));
        elem.add(new grupoIIIA("Galio", "Ga", 31,"Garcia",70));
        elem.add(new grupoIIIA("Indio", "In", 49,"Indio",115));
        elem.add(new grupoIIIA("Talio", "Tl", 81,"Toledo",204));
        // CARBONOIDES
        elem.add(new grupoIVA("Carbono", "C", 6,"Carmen",12));
        elem.add(new grupoIVA("Silicio", "Si", 14,"Si",28));
        elem.add(new grupoIVA("Germanio", "Ge", 32,"German",73));
        elem.add(new grupoIVA("Estaño", "Sn", 50,"Sin",119));
        elem.add(new grupoIVA("Plomo", "Pb", 82,"Pensarlo bien",207));
        // NITROGENOIDES
        elem.add(new grupoVA("Nitrogeno", "N", 7,"No",14));
        elem.add(new grupoVA("Fosforo", "P", 15,"Puedo",31));
        elem.add(new grupoVA("Arsénico", "As", 33,"Asta",75));
        elem.add(new grupoVA("Antimonio", "Sb", 51,"Sabado",122));
        elem.add(new grupoVA("Bismuto", "Bi", 83,"Bigoton",209));
        // ANFIGENOS
        elem.add(new grupoVIA("Oxigeno", "O", 8,"¡Oh!",16));
        elem.add(new grupoVIA("Azufre", "S", 16,"Susana",32));      
        elem.add(new grupoVIA("Selenio", "Se", 34,"Se",79));
        elem.add(new grupoVIA("Telurio", "Te", 52,"Te",128));
        elem.add(new grupoVIA("Polonio", "Po", 84,"Polonio",209));
        // HALOGENOS
        elem.add(new grupoVIIA("Fluor", "F", 9,"Fumo",19));
        elem.add(new grupoVIIA("Cloro", "Cl", 17,"Cloro",35));
        elem.add(new grupoVIIA("Bromo", "Br", 35,"Barato",80));
        elem.add(new grupoVIIA("Iodo", "I", 53,"Ivan",127));
        elem.add(new grupoVIIA("Ástato", "At", 85,"Atorrante",210));
        // GASES NOBLES
        elem.add(new grupoVIIIA("Helio", "He", 2,"Helena",4));
        elem.add(new grupoVIIIA("Neón", "Ne", 10,"Negó",20));
        elem.add(new grupoVIIIA("Argón", "Ar", 18,"Arturo",40));
        elem.add(new grupoVIIIA("Kriptón", "Kr", 36,"Korrer",84));
        elem.add(new grupoVIIIA("Xenón", "Xe", 54,"Xenón",131));
        elem.add(new grupoVIIIA("Radón", "Rn", 86,"Rincón",222));
    }
    // SIMBOLO
    public ElementosQ dElemento(int z){ // empleado
       for(ElementosQ x:elem){
           if(x.getZ()==z){
               return x;    // return x
           }
       }
       return null;
    }
   
    
}
