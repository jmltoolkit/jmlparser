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
 * Date: Wed May 14 11:55:40 CEST 2008
 */
package javax.swing;

public class JFrame extends java.awt.Frame implements javax.swing.WindowConstants, javax.accessibility.Accessible, javax.swing.RootPaneContainer, javax.swing.TransferHandler$HasGetTransferHandler {
    public final static int EXIT_ON_CLOSE = 3;
    protected javax.swing.JRootPane rootPane;
    protected boolean rootPaneCheckingEnabled;
    protected javax.accessibility.AccessibleContext accessibleContext;

    public JFrame() throws java.awt.HeadlessException;

    public JFrame(java.awt.GraphicsConfiguration arg0);

    public JFrame(java.lang.String arg0) throws java.awt.HeadlessException;

    public JFrame(java.lang.String arg0, java.awt.GraphicsConfiguration arg1);

    protected void frameInit();

    protected javax.swing.JRootPane createRootPane();

    protected void processWindowEvent(java.awt.event.WindowEvent arg0);

    public void setDefaultCloseOperation(int arg0);

    public int getDefaultCloseOperation();

    public void setTransferHandler(javax.swing.TransferHandler arg0);

    public javax.swing.TransferHandler getTransferHandler();

    public void update(java.awt.Graphics arg0);

    public void setJMenuBar(javax.swing.JMenuBar arg0);

    public javax.swing.JMenuBar getJMenuBar();

    protected boolean isRootPaneCheckingEnabled();

    protected void setRootPaneCheckingEnabled(boolean arg0);

    protected void addImpl(java.awt.Component arg0, java.lang.Object arg1, int arg2);

    public void remove(java.awt.Component arg0);

    public void setLayout(java.awt.LayoutManager arg0);

    public javax.swing.JRootPane getRootPane();

    protected void setRootPane(javax.swing.JRootPane arg0);

    public void setIconImage(java.awt.Image arg0);

    public java.awt.Container getContentPane();

    public void setContentPane(java.awt.Container arg0);

    public javax.swing.JLayeredPane getLayeredPane();

    public void setLayeredPane(javax.swing.JLayeredPane arg0);

    public java.awt.Component getGlassPane();

    public void setGlassPane(java.awt.Component arg0);

    public java.awt.Graphics getGraphics();

    public void repaint(long arg0, int arg1, int arg2, int arg3, int arg4);

    public static void setDefaultLookAndFeelDecorated(boolean arg0);

    public static boolean isDefaultLookAndFeelDecorated();

    protected java.lang.String paramString();

    public javax.accessibility.AccessibleContext getAccessibleContext();
}
