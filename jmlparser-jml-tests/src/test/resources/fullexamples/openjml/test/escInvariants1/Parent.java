package esc;

public class Parent {
    /*@ spec_public */ private final int my_integer;

    //@ pure
    public Parent(int the_integer) {
        my_integer = the_integer;
    }
}
