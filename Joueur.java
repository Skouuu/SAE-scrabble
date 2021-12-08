public int nbPointsChevalet (int[] nbPointsJet){
    /**
    * pré-requis : nbPointsJet indique le nombre de points rapportés par
    * chaque jeton/lettre
    * résultat : le nombre de points total sur le chevalet de ce joueur
    * suggestion : bien relire la classe MEE !
    */
}

public void prendJetons (MEE s, int nbJetons) {
    /**
    * pré-requis : les éléments de s sont inférieurs à 26
    * action : simule la prise de nbJetons jetons par this dans le sac s,
    * dans la limite de son contenu.
    */
}

public int joue(Plateau p, MEE s, int[] nbPointsJet) {
    /**
    * pré-requis : les éléments de s sont inférieurs à 26
    * et nbPointsJet.length >= 26
    * action : simule le coup de this : this choisit de passer son tour,
    * d’échanger des jetons ou de placer un mot
    * résultat : -1 si this a passé son tour, 1 si son chevalet est vide,
    * et 0 sinon
    */
}

public boolean joueMot(Plateau p, MEE s, int[] nbPointsJet) {
    /** pré-requis : les éléments de s sont inférieurs
    * à 26 et nbPointsJet.length >= 26
    * action/résultat : simule le placement d’un mot de this
    * et retourne vrai ssi ce coup est valide
    * (accepté par CapeloDico et satisfaisant les
    * règles détaillées plus haut)
    */
}

public void echangeJetons(MEE sac) {
    /**
    * pré-requis : les éléments de sac sont inférieurs à 26
    * action : simule l’échange de jetons de ce joueur
    */
}

