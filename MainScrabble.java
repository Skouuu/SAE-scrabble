public class MainScrabble{
  public static void main(String []args){
    /*
    Ut.afficherSL("=======================================================");
    Ut.afficher("| ");
    Ut.afficher("           Bienvenue au jeu du Scrabble            ");
    Ut.afficherSL(" |");
    Ut.afficher("| ");
    Ut.afficher("     2 joueurs requis et un peu de réfléxion !     ");
    Ut.afficherSL(" |");
    Ut.afficher("| ");
    Ut.afficher(" Projet dévellopé par DRONNE Laura et KICIEN Tania ");
    Ut.afficherSL(" |");
    Ut.afficherSL("=======================================================");
    Ut.afficherSL("             |    Commencer une partie    |           ");
    Ut.afficherSL("             |          Quitter           |           ");
    Ut.afficherSL("             ==============================           ");
  */
  int n ;
  do {
    Ut.afficher("Saisissez le nombre de joueurs: ");
  n=Ut.saisirEntier();
  } while (n<1|n>14);    
  

   
  }
}