//@ import pkg.JmlClassOtherFile;

public class CompleteResolutionExample {
    int x;
    int y;
    int z;

    /*@ public normal_behavior
        forall String next;
        ensures x == y;
        ensures next != null ;
     */
    public void foo(int y/*!label=paramY*/) {
        /*@ ghost boolean Q = next //!ref: faNext
                                !=null;
         */

         //@ghost int f = other.field;
         //@ghost int g = f  + clazz.field;
         //@ghost int h = g + f + clazz.other.field + clazz.x;
    }

    /*@
        invariant (\forall int x//!ref: bindX
                        ; x //!ref: bindX
                        > 0;
                        x //!ref: bindX
                            !=
                                (\num_of int x//!bindX2;
                                        x //!ref:bindX2
                                        > 0; 1));
     */


    /*@ model class JmlInnerClass {} */
    //@ ghost JmlClassSameFile clazz = new JmlClassSameFile();    
    //@ ghost JmlClassOtherFile other = new JmlClassOtherFile();    

    
}

/*@
    public model class JmlClassSameFile extends JmlClassOtherFile {
        int x;       
        JmlClassOtherFile other;
        JmlClassSameFile self = new JmlClassSameFile();
    }
 */