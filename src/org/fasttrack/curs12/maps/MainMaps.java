package org.fasttrack.curs12.maps;

import java.util.*;

public class MainMaps {

    public static void main(String[] args) {
        List<String> nume = new ArrayList<>();
        nume.add("Denis");
        nume.add("Emi");
        nume.add("Cristina");
        nume.add("Sergiu");

        Map<Integer, String> numeById = new HashMap<>();
        numeById.put(1, "Abel");
        numeById.put(2, "Edi");
        numeById.put(3, "Irina");

        System.out.println(numeById.get(3));
        numeById.remove(2);
        System.out.println("Avem Irina? " + numeById.containsValue("Irina"));
        numeById.put(3, "Sergiu");
        System.out.println(numeById.get(3));

        numeById.containsKey(3);
        System.out.println("Avem Irina? " + numeById.containsValue("Irina"));

        Set<Integer> allKeys = numeById.keySet();
        //print all values using keys
        for (Integer currentKey: allKeys) {
            System.out.println("ELEM: " + numeById.get(currentKey));
        }
        System.out.println();
        System.out.println(allKeys);

        Collection<String> myStuff = numeById.values();
        System.out.println(myStuff);

        //set of key pair values <1, Abel> si <3, Sergiu>
        Set<Map.Entry<Integer, String>> entries = numeById.entrySet();

        Map<String, List<String>> sweetsAndBrands = new HashMap<>();
        String inghetata = "inghetata";
        List<String> branduriInghetata = new ArrayList<>();
        branduriInghetata.add("algida");
        branduriInghetata.add("magnum");
        branduriInghetata.add("napoca");
        String sucuri = "sucuri";
        List<String> brandSucuri = new ArrayList<>();
        brandSucuri.add("cola");
        brandSucuri.add("pepsi");
        sweetsAndBrands.put(inghetata, branduriInghetata);
        sweetsAndBrands.put(sucuri, brandSucuri);

        System.out.println("Print sucuri");
        System.out.println("Sucuri: " + sweetsAndBrands.get(sucuri));

        addBenAndJerry(sweetsAndBrands);
        System.out.println("Inghetate post update: " + sweetsAndBrands.get("inghetata"));

        //colectii
        //A B C D E F
        //0 1 2 3 4 5
    }

    public static void addBenAndJerry(Map<String, List<String>> sweetsAndBrands) {
        List<String> branduriDeInghetata = sweetsAndBrands.get("inghetata");
        System.out.println("Inghetatele initiale: " + branduriDeInghetata);
        branduriDeInghetata.add("ben&jerry");
        sweetsAndBrands.put("inghetata", branduriDeInghetata);
    }
}
