// This file is part of KeY - Integrated Deductive Software Design 
//
// Copyright (C) 2001-2011 Universitaet Karlsruhe (TH), Germany 
//                         Universitaet Koblenz-Landau, Germany
//                         Chalmers University of Technology, Sweden
// Copyright (C) 2011-2013 Karlsruhe Institute of Technology, Germany 
//                         Technical University Darmstadt, Germany
//                         Chalmers University of Technology, Sweden
//
// The KeY system is protected by the GNU General 
// Public License. See LICENSE.TXT for details.
// 

public class Demo {

    static boolean limit = false;

    public static void main(String args[]) {
        System.out.println((new Demo()).mul(3, 3, 8));
    }

    int mul(int x, int y, int MAX) {
        int z = 0;
        while (y > 0) {
            if (z + x > MAX) {
                limit = true;
                break;
            }
            z = z + x;
            y = y - 1;
        }
        return z;
    }


}
