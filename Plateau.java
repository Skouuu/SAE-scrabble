public String toString (){
    /**
    * résultat : chaîne décrivant ce Plateau
    */
}

public boolean placementValide(String mot, int numLig, int numCol, char sens, MEE e) {
    /**
    * pré-requis : mot est un mot accepté par CapeloDico,
    * 0 <= numLig <= 14, 0 <= numCol <= 14, sens est un élément
    * de {’h’,’v’} et l’entier maximum prévu pour e est au moins 25
    * résultat : retourne vrai ssi le placement de mot sur this à partir
    * de la case (numLig, numCol) dans le sens donné par sens à l’aide
    * des jetons de e est valide.
    */

}

public int nbPointsPlacement(String mot, int numLig, int numCol, char sens, int[] nbPointsJet) {
    /**
    * pré-requis : le placement de mot sur this à partir de la case
    * (numLig, numCol) dans le sens donné par sens est valide
    * résultat : retourne le nombre de points rapportés par ce placement, le
    * nombre de points de chaque jeton étant donné par le tableau nbPointsJet.
    */
}

public int place(String mot, int numLig, int numCol, char sens, MEE e){
    /**
    * pré-requis : le placement de mot sur this à partir de la case
    * (numLig, numCol) dans le sens donné par sens à l’aide des
    * jetons de e est valide.
    * action/résultat : effectue ce placement et retourne le
    * nombre de jetons retirés de e.
    */
}

