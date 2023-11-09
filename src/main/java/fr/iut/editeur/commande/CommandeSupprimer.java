package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeSupprimer extends CommandeDocument{
    public CommandeSupprimer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : supprimer;int depart;int arrive");
            return;
        }
        this.document.supprimer(Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2]));
        super.executer();
    }
}
