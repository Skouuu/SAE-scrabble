public class Joueur{
  private String nom;
  private MEE chevalet;
  private int score;


  public Joueur(String unNom){
    this.nom=unNom;
    this.score=0;
    this.chevalet=new MEE(26);
  }

  public String toString(){
    String a = "";
    a += this.nom;
    a += " a un score de ";
    a += this.score;
    a+= "son chevalet est "
    a+=this.chevalet;
    return a;
  }

  public int getScore(){
    return this.score;
  }

  public void ajouteScore(int nb){
    this.score+=nb;
  }

  public int nbPointsChevalet (int[] nbPointsJet){
      /**
      * pré-requis : nbPointsJet indique le nombre de points rapportés par
      * chaque jeton/lettre
      * résultat : le nombre de points total sur le chevalet de ce joueur
      * suggestion : bien relire la classe MEE !
      */
    return this.chevalet.sommeValeurs(nbPointsJet);
  }

  public void prendJetons (MEE s, int nbJetons) {
      /**
      * pré-requis : les éléments de s sont inférieurs à 26
      * action : simule la prise de nbJetons jetons par this dans le sac s,
      * dans la limite de son contenu.
      */
    int prendre=s.transfereAleat(this.chevalet, nbJetons);
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
      int choix;
      Ut.afficherSL("Que voulez-vous faire ?");
      Ut.afficherSL("1 : Proposer un mot");
      Ut.afficherSL("2 : Echanger des jetons");
      Ut.afficherSL("3 : Passer votre tour");
      int n=Ut.saisirEntier();
      if(n<1 | n>3){
        Ut.afficherSL("Que voulez-vous faire ?");
        Ut.afficherSL("1 : Proposer un mot");
        Ut.afficherSL("2 : Echanger des jetons");
        Ut.afficherSL("3 : Passer votre tour");
        int n=Ut.saisirEntier();
      }
      if(n==1){
        
      }
    else if (n==2){
      
    }
    else {
      choix=-1;
    }
      return 1;
      

  }

  public boolean joueMot(Plateau p, MEE s, int[] nbPointsJet) {
      /** pré-requis : les éléments de s sont inférieurs
      * à 26 et nbPointsJet.length >= 26
      * action/résultat : simule le placement d’un mot de this
      * et retourne vrai ssi ce coup est valide
      * (accepté par CapeloDico et satisfaisant les
      * règles détaillées plus haut)
      */
      return true;
  }

  public void echangeJetons(MEE sac) {
      /**
      * pré-requis : les éléments de sac sont inférieurs à 26
      * action : simule l’échange de jetons de ce joueur
      */
  }
}

