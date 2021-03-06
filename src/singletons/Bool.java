package src.singletons;

import src.functionnal.AtomLam;

/**
 * Definit les booleens
 *
 * @author Adrien Baudet
 * @version 21.10.2017
 */
public abstract class Bool
{
    /**
     * Equivalent de not
     */
    abstract public Bool not();
    
    /**
     * Equivalent de and
     */
    abstract public Bool and(Bool other);
    
    /**
     * Equivalent de or
     */
    abstract public Bool or(Bool other);
    
    /**
     * Equivalent de egalite
     */
    abstract public Bool xnor(Bool other);
    
    /**
     * Equivalent de if
     */
    abstract public Unit ifTrue(AtomLam<Unit, Unit> lam);
    
    /**
     * Equivalent de unless
     */
    abstract public Unit ifFalse(AtomLam<Unit, Unit> lam);
    
    /**
     * Equivalent de ifelse
     */
    abstract public <A> A ifTrueIfFalse(AtomLam<Unit, A> lam, AtomLam<Unit, A> otherLam);
    
    /**
     * Equivalent de unlesselse
     */
    abstract public <A> A ifFalseIfTrue(AtomLam<Unit, A> lam, AtomLam<Unit, A> otherLam);
    
    /**
     * Pour ecrire dans la console
     */
    abstract public String toString();
}
