package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            case "remplacer":return new CommandeRemplacer(document,parameters);
            case "majuscule":return new CommandeMajuscule(document,parameters);
            case "supprimer":return new CommandeSupprimer(document,parameters);
            case "clear":return new CommandeClear(document,parameters);
            case "inserer":return new CommandeInserer(document,parameters);
            default: return null;
        }
    }

}
