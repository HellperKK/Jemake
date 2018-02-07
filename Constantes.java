/**
 * Classe contenant des constantes
 *
 * @author Hellper (Adrien Baudet)
 * @version 21/11/2017
 */

final class Constantes{
    public static Bool vrai = new Bool(){
        public Bool not(){
            return Constantes.faux;
        }
    
        public Bool and(Bool otherBool){
            return otherBool;
        }
        
        public Bool or(Bool otherBool){
            return Constantes.vrai;
        }
        
        public Bool xnor(Bool otherBool){
            return otherBool;
        }
        
        public Unit ifTrue(AtomLam<Unit, Unit> lam)
        {
            return lam.call(Constantes.unit);
        }
        
        public Unit ifFalse(AtomLam<Unit, Unit> lam)
        {
            return Constantes.unit;
        }
        
        public Unit ifTrueIfFalse(AtomLam<Unit, Unit> lam, AtomLam<Unit, Unit> otherLam)
        {
            return lam.call(Constantes.unit);
        }
        
        public Unit ifFalseIfTrue(AtomLam<Unit, Unit> lam, AtomLam<Unit, Unit> otherLam)
        {
            return otherLam.call(Constantes.unit);
        }
    };
    public static Bool faux = new Bool(){
        
        public Bool not(){
            return Constantes.vrai;
        }
        
        public Bool and(Bool otherBool){
            return Constantes.faux;
        }
        
        public Bool or(Bool otherBool){
            return otherBool;
        }
        
        public Bool xnor(Bool otherBool){
            return otherBool.not();
        }
        
        public Unit ifTrue(AtomLam<Unit, Unit> lam)
        {
            return Constantes.unit;
        }
        
        public Unit ifFalse(AtomLam<Unit, Unit> lam)
        {
            return lam.call(Constantes.unit);
        }
        
        public Unit ifTrueIfFalse(AtomLam<Unit, Unit> lam, AtomLam<Unit, Unit> otherLam)
        {
            return otherLam.call(Constantes.unit);
        }
        
        public Unit ifFalseIfTrue(AtomLam<Unit, Unit> lam, AtomLam<Unit, Unit> otherLam)
        {
            return lam.call(Constantes.unit);
        }
    };
    
    public static Unit unit = new Unit();
}