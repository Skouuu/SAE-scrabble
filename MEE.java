public class MEE{
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
    }

    /*Constructeur par copie*/
    public MEE(MEE e){
        this(e.tabFreq.length);
        this.nbTotEx = e.nbTotEx;
        for (int i = 0; i < e.tabFreq.length; i++) {
            this.tabFreq[i] = e.tabFreq[i];
        }
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
    }

    /*
    * pré-requis : 0 <= i < tabFreq.length
    * action/résultat : retire un exemplaire de i de this s’il en existe,
    * et retourne vrai ssi cette action a pu être effectuée
    */
    public boolean retire(int i){
        estPossibleRetire=true;
        this.tabFreq[i]=this.tabFreq[i]-1;
        if(this.tabFreq<0){
            this.tabFreq=0;
            estPossibleRetire=false;
        }
    }
}