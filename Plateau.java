public class Plateau{

  //Attribut 
  private Case [][] g;  //g pour grille
  //Constructeurs
  public Plateau(){
    this.g = new Case[15][15];
    int [][] plateau ={ {5,0,0,2,0,0,0,5,0,0,0,2,0,0,5} , 
                        {0,4,0,0,0,3,0,0,0,3,0,0,0,4,0} , 
                        {0,0,4,0,0,0,2,0,2,0,0,0,4,0,0} ,
                        {2,0,0,4,0,0,0,2,0,0,0,4,0,0,2} ,
                        {0,0,0,0,4,0,0,0,0,0,4,0,0,0,0} ,
                        {0,3,0,0,0,3,0,0,0,3,0,0,0,0,0} ,
                        {0,0,2,0,0,0,2,0,2,0,0,0,0,0,0} ,
                        {5,0,0,2,0,0,0,4,0,0,0,0,0,0,5} ,  //initialisation du plateau
                        {0,0,2,0,0,0,2,0,2,0,0,0,0,0,0} ,
                        {0,3,0,0,0,3,0,0,0,3,0,0,0,0,0} ,
                        {0,0,0,0,4,0,0,0,0,0,4,0,0,0,0} ,
                        {2,0,0,4,0,0,0,2,0,0,0,4,0,0,2} ,
                        {0,0,4,0,0,0,2,0,2,0,0,0,4,0,0} ,
                        {0,4,0,0,0,3,0,0,0,3,0,0,0,4,0} ,
                        {5,0,0,2,0,0,0,5,0,0,0,2,0,0,5} ,
                      } ;
    for(int i = 0; i < 15; i++){
      for(int j = 0;j < 15; j++){
        this.g[i][j] = new Case(plateau[i][j]);
      }
    }
  }
  public String toString(){
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
        p += " | ";             //on place les séparations
        p += g[i][j].getCouleur();        //on place les données des mots
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
    boolean vide = true;
    for(int a = 0; a < 15; a++){
      for(int b = 0; b < 15; b++){
        if(g[a][b].estRecouverte()){
          vide = false; 
        }
      }
    }
    boolean valide = false;
    //Si le plateau est vide 
    int i = numLig;
    int j = numCol;
    //on vérifie que le mot fait 2 lettres ou plus
    if(vide && mot.length() >= 2){
      //la case [7][7] doit être recouverte par le mot pour être validé
      if(sens == 'v'){
        // si le sens est vertical alors j doit être égal à 7
        if(j == 7){
          boolean ligne = false;
          while(!ligne && i < mot.length()){
            if(i == 7){
              ligne = true;
            }
            i += 1;
          }
        }
      }
      else if(sens == 'h'){
        //si le sens est horizontal le mot doit être dans la ligne 7
        if(i == 7){
          //on détermine la position de la dernière lettre et on peut donc vérifier si le mot passe par la case [7][7]
          boolean colonne = false;
          while(!colonne && j < mot.length()){
            if(j == 7){
              colonne = true;
            }
            j += 1;
          }
        }
      }
      //son chevalet doit contenir les lettres du mot

      valide = true;
    }

    //si le plateau a au moins un mot
    if(!vide){
      //on vérifie que le mot ne dépasse pas de la grille 
      if(sens == 'v'){
        for(i = 0; i <= 13; i++){
          boolean ligne = false;
          while(!ligne && i < mot.length()){
            if(i <= 15){
              ligne = true;
            i += 1;
            }
          }
        } 
      //pas de lettre avant ou après le mot ou le bord de la grille
      //le mot doit ajouté une lettre sur le plateau
      //le mot doit utiliser une lettre du plateau
      //les lettres utilisé du plateau doivent correspondre à celles du mot
      //son chevalet doit contenir les lettres du mot (hors celles qui sont déjà sur le plateau)
      valide = true;
      }
    }
    return valide;
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
    //utiliser setLettre
    return 1;
  }
}
