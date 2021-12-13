public class Plateau{
  public String toString (){
    /**
    * résultat : chaîne décrivant ce Plateau
    */
    String p = "     ";
    int i = 0;
    int j = 0;
    for(j = 0; j < 15;j++){
      if(j <= 9){
        p += j;
        p += "   ";
      }
      else{             //Vu que un chiffre et un nombre        
        p += j;         //n'occupent pas le même espace on
        p += "  ";      //vérifie pour bien les aligner
      }                 //par rapport à la grille
      
    }
    for(i = 0; i < 15 ;i++){
      p += "\n   -------------------------------------------------------------\n";
      if(i <= 9){
        p += " ";        //même chose avec les chiffres et nombres
      }
      p += i;
      for(j = 0; j < 15 ;j++){
        p += " | ";              //on place les séparations
        p += this.[i][j];        //on place les données des mots
      }                          //a leur place
      p += " |";
    }
    p += "\n   -------------------------------------------------------------\n";
    return p;
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
    return true;
  }

  public int nbPointsPlacement(String mot, int numLig, int numCol, char sens, int[] nbPointsJet) {
    /**
    * pré-requis : le placement de mot sur this à partir de la case
    * (numLig, numCol) dans le sens donné par sens est valide
    * résultat : retourne le nombre de points rapportés par ce placement, le
    * nombre de points de chaque jeton étant donné par le tableau nbPointsJet.
    */
    return 1;
  }

  public int place(String mot, int numLig, int numCol, char sens, MEE e){
    /**
    * pré-requis : le placement de mot sur this à partir de la case
    * (numLig, numCol) dans le sens donné par sens à l’aide des
    * jetons de e est valide.
    * action/résultat : effectue ce placement et retourne le
    * nombre de jetons retirés de e.
    */
    return 1;
  }
}
