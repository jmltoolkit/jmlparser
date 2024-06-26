package alloc;

public class Allocator {
    /*@ public normal_behavior
      @   requires size >= 0 && size < 128;
      @   assignable \nothing;
      @   ensures \fresh(\result);
      @   ensures \result.length == size;
      @   //ensures \forall int i; 0 <= i && i < size; \result[i] == (byte) 0x00;
      @*/
    public static byte[] alloc(int size) {
        return new byte[size];
    }
}
