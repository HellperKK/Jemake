/**
 * Classe pour outrepasser la recursive stack
 *
 * @author Hellper (Adrien Baudet)
 * @version 21/11/2017
 */
public class RecExtend<A>
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private AtomLam<A, A> lam;

    /**
     * Constructeur d'objets de classe RecExtend
     */
    public RecExtend(AtomLam<A, A> lam)
    {
        // initialisation des variables d'instance
        this.lam = lam;
    }

    /**
     * Methode d'extension
     */
    public A execute(Mint pow, Container<A> cont)
    {
        
        pow.eq(new Mint(0)).ifTrueIfFalse(
            (x) -> {
                cont.set(lam.call(cont.value));
                return Constantes.unit;
            },
            (x) -> {
                this.execute(pow.subs(1), cont);
                this.execute(pow.subs(1), cont);
                return Constantes.unit;
            }
        );
        return cont.value;
    }
    
    /**
     * Methode d'appel
     */
    public A sampleMethod(A value)
    {
        Container<A> cont = new Container<A>(value);
        return cont.value;
    }

}