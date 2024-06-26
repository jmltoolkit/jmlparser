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
 * Date: Wed May 14 11:55:45 CEST 2008
 */
package java.awt;

public class Window extends java.awt.Container implements javax.accessibility.Accessible {

    public Window(java.awt.Frame arg0);

    public Window(java.awt.Window arg0);

    public Window(java.awt.Window arg0, java.awt.GraphicsConfiguration arg1);

    public java.util.List getIconImages();

    public void setIconImages(java.util.List arg0);

    public void setIconImage(java.awt.Image arg0);

    public void addNotify();

    public void removeNotify();

    public void pack();

    public void setMinimumSize(java.awt.Dimension arg0);

    public void setSize(java.awt.Dimension arg0);

    public void setSize(int arg0, int arg1);

    public void reshape(int arg0, int arg1, int arg2, int arg3);

    public void setVisible(boolean arg0);

    public void show();

    public void hide();

    public void dispose();

    public void toFront();

    public void toBack();

    public java.awt.Toolkit getToolkit();

    public final java.lang.String getWarningString();

    public java.util.Locale getLocale();

    public java.awt.im.InputContext getInputContext();

    public void setCursor(java.awt.Cursor arg0);

    public java.awt.Window getOwner();

    public java.awt.Window[] getOwnedWindows();

    public static java.awt.Window[] getWindows();

    public static java.awt.Window[] getOwnerlessWindows();

    public void setModalExclusionType(java.awt.Dialog$ModalExclusionType arg0);

    public java.awt.Dialog$ModalExclusionType getModalExclusionType();

    public void addWindowListener(java.awt.event.WindowListener arg0);

    public void addWindowStateListener(java.awt.event.WindowStateListener arg0);

    public void addWindowFocusListener(java.awt.event.WindowFocusListener arg0);

    public void removeWindowListener(java.awt.event.WindowListener arg0);

    public void removeWindowStateListener(java.awt.event.WindowStateListener arg0);

    public void removeWindowFocusListener(java.awt.event.WindowFocusListener arg0);

    public java.awt.event.WindowListener[] getWindowListeners();

    public java.awt.event.WindowFocusListener[] getWindowFocusListeners();

    public java.awt.event.WindowStateListener[] getWindowStateListeners();

    public java.util.EventListener[] getListeners(java.lang.Class arg0);

    protected void processEvent(java.awt.AWTEvent arg0);

    protected void processWindowEvent(java.awt.event.WindowEvent arg0);

    protected void processWindowFocusEvent(java.awt.event.WindowEvent arg0);

    protected void processWindowStateEvent(java.awt.event.WindowEvent arg0);

    public final void setAlwaysOnTop(boolean arg0) throws java.lang.SecurityException;

    public boolean isAlwaysOnTopSupported();

    public final boolean isAlwaysOnTop();

    public java.awt.Component getFocusOwner();

    public java.awt.Component getMostRecentFocusOwner();

    public boolean isActive();

    public boolean isFocused();

    public java.util.Set getFocusTraversalKeys(int arg0);

    public final void setFocusCycleRoot(boolean arg0);

    public final boolean isFocusCycleRoot();

    public final java.awt.Container getFocusCycleRootAncestor();

    public final boolean isFocusableWindow();

    public boolean getFocusableWindowState();

    public void setFocusableWindowState(boolean arg0);

    public void addPropertyChangeListener(java.beans.PropertyChangeListener arg0);

    public void addPropertyChangeListener(java.lang.String arg0, java.beans.PropertyChangeListener arg1);

    public boolean postEvent(java.awt.Event arg0);

    public boolean isShowing();

    public void applyResourceBundle(java.util.ResourceBundle arg0);

    public void applyResourceBundle(java.lang.String arg0);

    public javax.accessibility.AccessibleContext getAccessibleContext();

    public java.awt.GraphicsConfiguration getGraphicsConfiguration();

    public void setLocationRelativeTo(java.awt.Component arg0);

    public void createBufferStrategy(int arg0);

    public void createBufferStrategy(int arg0, java.awt.BufferCapabilities arg1) throws java.awt.AWTException;

    public java.awt.image.BufferStrategy getBufferStrategy();

    public void setLocationByPlatform(boolean arg0);

    public boolean isLocationByPlatform();

    public void setBounds(int arg0, int arg1, int arg2, int arg3);

    public void setBounds(java.awt.Rectangle arg0);
}
