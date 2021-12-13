public class Case{
  private int [] couleur={1,2,3,4,5};
  private char lettre;
  private boolean libre;

  public Case (int uneCouleur){
          
      /**
      * pré-requis : uneCouleur est un entier entre 1 et 5
      * action : constructeur de Case
      */
      
      /*
      int gris = 1; //Pas d'avantage de points 
      int bleuclair = 2; // lettre compte double
      int bleudark = 3; // lettre compte triple
      int rose = 4; // mot compte double
      int rouge = 5; // mot compte triple
      */

  }

  public int getCouleur (){
      /**
      * résultat : la couleur de this, un nombre entre 1 et 5
      */
      return this.case;
  }

  public char getLettre (){
      /**
      * pré-requis : cette case est recouverte
      */
      return this.lettre;
  }

  public void setLettre (char let){
      /**
      * pré-requis : let est une lettre majuscule
      */
      this.lettre=let;
  }

  public boolean estRecouverte (){
      /**
      * résultat : vrai ssi la case est recouverte par une lettre
      */
    return (libre==false);
  }

  public String toString (){

  }

}