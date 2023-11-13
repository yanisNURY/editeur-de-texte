package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**remplace le texte du teste entre deux indices par un autre texte
     * @param start indice de début de remplacement
     * @param end indice de fin de remplacement
     * @param remplacement texte de remplacement
     * */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }
    /**met le texte en majuscule entre les indice
    * @param start et
     * @param end */
    public void majuscules(int start, int end) {
        String leftPart = texte.substring(0, start);
        String middleUppercase=texte.substring(start,end).toUpperCase();
        String rightPart = texte.substring(end);
        texte = leftPart + middleUppercase + rightPart;
    }
    /** supprime du texte entre les indices
     * @param start et
     * @param end */
    public void supprimer(int start, int end){
        String leftPart=texte.substring(0,start);
        String rightPart=texte.substring(end);
        texte=leftPart+rightPart;
    }

    /**supprime l'entièreté du texte*/
    public void clear(){
        texte="";
    }

    /**
     * insere du texte a un indice donné
     * @param i indice d'insertion
     * @param t texte a inserer*/
    public void inserer(int i , String t) {
        String leftPart = texte.substring(0, i);
        String rightPart = texte.substring(i);
        texte = leftPart + t + rightPart;
    }
}
