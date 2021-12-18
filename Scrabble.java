public class Scrabble{
  private Joueur[] joueurs;
  private int numJoueur; // joueur courant (entre 0 et joueurs.length-1)
  private Plateau plateau;
  private MEE sac;
  private static int [] nbPointsJeton={1,3,3,2,1,4,2,4,1,8,10,1,2,1,1,1,1,1,4,10,10,10,10};

  public Scrabble(Joueur[] desJoueurs){
    this.joueurs=desJoueurs;
    this.numJoueur=Ut.randomMinMax(0, joueurs.length-1);
    this.plateau=new Plateau();

  }

  public String toString(){
    String s="";
    s+="Le joueur qui a la main est ";
    s+= this.numJoueur;
    s+= "Le plateau est ";
    s+= this.plateau;
  return s;
  }

  /*1. la distribution initiale des jetons aux joueurs,
2. des itérations sur les différents tours de jeu jusqu’à la fin de la partie,
3. le calcul des scores finaux,
4. l’affichage du ou des gagnants.
La partie peut se terminer pour deux raisons.
La partie se termine généralement quand le joueur courant n’a plus de jetons (et que le sac
est vide). Ce joueur récupère alors les points des jetons restants des autres joueurs et, pour
chaque autre joueur, le nombre de points de ses jetons restants est retiré de son score.
L’autre cas de terminaison (rare) se produit lors d’un "blocage", c’est-à-dire quand tous les
joueurs ont passé leur tour 3
. Dans ce cas, le nombre de points des jetons restants est retiré
du score de chaque joueur.
Le gagnant de la partie est le joueur ayant le nombre maximum de points. Il peut y avoir des
ex aequo.

  */
  public  void partie(){
    //Inialisation du sac
    int [] sac = {9,2,2,3,15,2,2,2,8,1,1,5,3,6,6,2,1,6,6,6,6,2,1,1,1,1};
    this.sac =new MEE(sac);
    //Chaque joueur pioche 7 jetons dans le sac
    for (int i=0; i<joueurs.length;i++){
      joueurs[i].prendJetons(this.sac, 7);
    }
    
    
    
    
    
    
    
  }

  
}
