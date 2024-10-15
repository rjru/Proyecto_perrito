import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Perrito> id_perritos = new HashMap<String, Perrito>();
        ArrayList<Perrito> perritos_array = new ArrayList<Perrito>();


        Perrito perrito1 = new Perrito("Criollo");
        perrito1.setNombre("Firulais");
        //System.out.println(perrito1.getNombre());
        //System.out.println(perrito1.raza);

        System.out.println();
        Perrito perrito2 = new Perrito("Pastor Aleman");
        perrito2.setNombre("Pipo");
        //System.out.println(perrito2.getNombre());
        //System.out.println(perrito2.raza);

        System.out.println();
        Perrito perrito3 = new Perrito("Callejerito");
        perrito3.setNombre("Pepito");
        //System.out.println(perrito3.getNombre());
        //System.out.println(perrito3.raza);

        // ARRAYLIST
        perritos_array.add(perrito3); // indice 0
        perritos_array.add(perrito2); // indice 1
        perritos_array.add(perrito1); // indice 2

        System.out.println("Soy un Arraylist: " + perritos_array);

        // HASHMAP
        id_perritos.put("0003", perrito3);
        id_perritos.put("0002", perrito2);
        id_perritos.put("0001", perrito1);
        id_perritos.put("0004", perrito1);
        id_perritos.put("0005", perrito1);
        id_perritos.put("0006", perrito1);

        // INGRESE EL ID DE PERRITO:
        // 003
        System.out.println("Soy un HashMap: " + id_perritos.get("0001").getNombre());
        System.out.println("Soy un HashMap: " + id_perritos.get("0002").getNombre());
        System.out.println("Soy un HashMap: " + id_perritos.get("0003").getNombre());
        System.out.println("Soy un HashMap: " + id_perritos.get("0004").getNombre());

    }

}
