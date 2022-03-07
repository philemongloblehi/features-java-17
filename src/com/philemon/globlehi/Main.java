package com.philemon.globlehi;

import com.philemon.globlehi.domaine.VoitureRecord;
import com.philemon.globlehi.enums.Pays;

public class Main {

    public static void main(String[] args) {
        // Text block
        String json = """
                {
                    "nom" : "Globlehi",
                    "prenoms" : "Philemon"
                }
                """;

        // Utilisation du Switch expression à l'intérieur de la méthode 😍
        getNationalite(Pays.ALLEMAGNE);

        // Utilisation du Record
        VoitureRecord voiture = new VoitureRecord(
                "Rouge",
                2,
                "BMW",
                360
        );
        System.out.println(voiture.toString());

    }


    public static void getNationalite(Pays pays) {
        // Switch expression
        String maNationalite = switch (pays) {
            case FRANCE -> "Je suis Français";
            case USA -> "Je suis américain";
            case ALLEMAGNE -> "Je suis allemand";
            case ITALIE -> "Je suis italien";
        };

        System.out.println(maNationalite);
    }
}
