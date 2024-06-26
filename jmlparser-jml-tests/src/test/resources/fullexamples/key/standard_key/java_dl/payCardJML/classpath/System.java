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

/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed May 14 11:55:48 CEST 2008
 */
package java.lang;

public final class System extends java.lang.Object {
    public final static java.io.InputStream in;
    public final static java.io.PrintStream out;
    public final static java.io.PrintStream err;

    public static void setIn(java.io.InputStream arg0);

    public static void setOut(java.io.PrintStream arg0);

    public static void setErr(java.io.PrintStream arg0);

    public static java.io.Console console();

    public static java.nio.channels.Channel inheritedChannel() throws java.io.IOException;

    public static void setSecurityManager(java.lang.SecurityManager arg0);

    public static java.lang.SecurityManager getSecurityManager();

    public static long currentTimeMillis();

    public static long nanoTime();

    public static void arraycopy(java.lang.Object arg0, int arg1, java.lang.Object arg2, int arg3, int arg4);

    public static int identityHashCode(java.lang.Object arg0);

    public static java.util.Properties getProperties();

    public static void setProperties(java.util.Properties arg0);

    public static java.lang.String getProperty(java.lang.String arg0);

    public static java.lang.String getProperty(java.lang.String arg0, java.lang.String arg1);

    public static java.lang.String setProperty(java.lang.String arg0, java.lang.String arg1);

    public static java.lang.String clearProperty(java.lang.String arg0);

    public static java.lang.String getenv(java.lang.String arg0);

    public static java.util.Map getenv();

    public static void exit(int arg0);

    public static void gc();

    public static void runFinalization();

    public static void runFinalizersOnExit(boolean arg0);

    public static void load(java.lang.String arg0);

    public static void loadLibrary(java.lang.String arg0);

    public static java.lang.String mapLibraryName(java.lang.String arg0);
}
