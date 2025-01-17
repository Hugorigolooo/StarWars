package PasAPas;

import org.json.JSONArray;
import org.json.JSONObject;

public class Printer {

    public void printDetailsPlanets(JSONArray planetresults) {
        // Parcours des résultats des planètes
        for (int i = 0; i < planetresults.length(); i++) {
            // Extraction des détails d'une planète
            JSONObject planet = planetresults.getJSONObject(i);
            System.out.println("Planet : " + planet.getString("name"));
            System.out.println("Rotation Period : " + planet.getString("rotation_period"));
            System.out.println("Orbital Period : " + planet.getString("orbital_period"));
            System.out.println("Diameter : " + planet.getString("diameter"));
            System.out.println("Gravity : " + planet.getString("gravity"));
            System.out.println("Terrain : " + planet.getString("terrain"));
            System.out.println("Surface water : " + planet.getString("surface_water"));
            System.out.println("Population : " + planet.getString("population"));
            System.out.println("Residents : " + planet.getJSONArray("residents"));
            System.out.println("Films : " + planet.getJSONArray("films"));
           
//            // Impression des résidents de la planète
//            JSONArray residents = planet.getJSONArray("residents");
//            System.out.println("\nResidents :");
//            printArrayValues(residents, "name");
//
//            // Impression des films associés à la planète
//            JSONArray films = planet.getJSONArray("films");
//            System.out.println("\nFilms :");
//            printArrayValues(films, "title");

            System.out.println("\n");
        }
    }

    private void printArrayValues(JSONArray jsonArray, String key) {
        if (jsonArray != null) {
            // Parcours des valeurs du tableau
            for (int j = 0; j < jsonArray.length(); j++) {
                String value = jsonArray.getString(j);
                System.out.println(value);
            }
            // Si le tableau est vide, afficher un message
            if (jsonArray.length() == 0) {
                System.out.println("No results");
            }
        }
    }
}