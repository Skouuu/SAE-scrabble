public class MEE{
  /*fini*/
    //Attribut
    private int [] tabFreq;
    private int nbTotEx;

    //Constructeur

    /*pré-requis : max >= 0
    * action : crée un multi-ensemble vide dont les éléments seront
    * inférieurs à max
    */
    public MEE(int max){
        this.nbTotEx=0;
        this.tabFreq = new int[max];
    }

    /*pré-requis : les éléments de tab sont positifs ou nuls
    * action : crée un multi-ensemble dont le tableau de fréquences est
    *. une copie de tab
    */
    public MEE (int[] tab){
        this.tabFreq=tab;
        for(int i=0;i<tab.length;i++){
          if(tab[i]!=0){
            this.nbTotEx+=tab[i];
          }
        }
    }

    /*Constructeur par copie*/
    public MEE(MEE e){
        this(e.tabFreq.length);
        this.nbTotEx = e.nbTotEx;
        for (int i = 0; i < e.tabFreq.length; i++) {
            this.tabFreq[i] = e.tabFreq[i];
        }
    }


  public int getNbTotEx(){
    return this.nbTotEx;
  }
    //Méthodes
    /*résultat : vrai ssi cet ensemble est vide*/
    public boolean estVide (){
        return (nbTotEx==0);
    }

    /*pré-requis : 0 <= i < tabFreq.length
    * action : ajoute un exemplaire de i à this
    */
    public void ajoute(int i){
        this.tabFreq[i]=this.tabFreq[i]+1;
        this.nbTotEx+=1;
    }

    /*
    * pré-requis : 0 <= i < tabFreq.length
    * action/résultat : retire un exemplaire de i de this s’il en existe,
    * et retourne vrai ssi cette action a pu être effectuée
    */
    public boolean retire(int i){
        boolean estPossibleRetire;
        this.tabFreq[i]=this.tabFreq[i]-1;
        if(this.tabFreq[i]<0){
            this.tabFreq[i]=0;
            estPossibleRetire=false;
        }
        else{
          estPossibleRetire=true;
          this.nbTotEx-=1;
        }
      return estPossibleRetire;
    }

    /**
    * pré-requis : this est non vide
    * action/résultat : retire de this un exemplaire choisi aléatoirement
    * et le retourne
    */
  public int retireAleat () {
    int n=Ut.randomMinMax(0,25);
    if(this.tabFreq[n]==0){
      return 0;
    }
    else{
      this.tabFreq[n]-=1;
      this.nbTotEx-=1;
      return n;
    }
  }

  /**
  * pré-requis : 0 <= i < tabFreq.length
  * action/résultat : transfère un exemplaire de i de this vers e s’il
  * en existe, et retourne vrai ssi cette action a pu être effectuée
  */
  public boolean transfere (MEE e, int i) {
    boolean estPossibletransfere;
    if(this.tabFreq[i]==0){
      estPossibletransfere=false;
    }
    else{
      estPossibletransfere=true;
      e.tabFreq[i]+=1;
      e.nbTotEx+=1;
      this.tabFreq[i]-=1;
      this.nbTotEx-=1;
    }
    return estPossibletransfere;
  }

  /** pré-requis : k >= 0
  * action : tranfère k exemplaires choisis aléatoirement de this vers e
  * dans la limite du contenu de this
  * résultat : le nombre d’exemplaires effectivement transférés
    transfère des éléments k qui sont choisis aléatoirement à chaque fois
  */
  public int transfereAleat (MEE e, int k) {
    int nbtransfere=0;
    for(int i=0;i<k;i++){
      int n = Ut.randomMinMax(0,25);
      if(this.transfere(e,n)){
      nbtransfere++;
      }
    }
    return nbtransfere;
  }

    

  /**
  * pré-requis : tabFreq.length <= v.length
  * résultat : retourne la somme des valeurs des exemplaires des
  * éléments de this, la valeur d’un exemplaire d’un élément i
  * de this étant égale à v[i]
  */
  
  public int sommeValeurs (int[] v){
    int sommevaleurs=0;
    for (int i =0; i < this.tabFreq.length;i++){
      sommevaleurs+=this.tabFreq[i]*v[i];
    }
    return sommevaleurs;
  }
  

}