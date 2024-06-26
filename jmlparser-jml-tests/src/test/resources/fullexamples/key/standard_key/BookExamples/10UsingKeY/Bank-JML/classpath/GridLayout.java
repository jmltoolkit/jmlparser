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
 * Date: Wed May 14 11:55:32 CEST 2008
 */
package java.awt;

public class GridLayout extends java.lang.Object implements java.awt.LayoutManager, java.io.Serializable {

    public GridLayout();

    public GridLayout(int arg0, int arg1);

    public GridLayout(int arg0, int arg1, int arg2, int arg3);

    public int getRows();

    public void setRows(int arg0);

    public int getColumns();

    public void setColumns(int arg0);

    public int getHgap();

    public void setHgap(int arg0);

    public int getVgap();

    public void setVgap(int arg0);

    public void addLayoutComponent(java.lang.String arg0, java.awt.Component arg1);

    public void removeLayoutComponent(java.awt.Component arg0);

    public java.awt.Dimension preferredLayoutSize(java.awt.Container arg0);

    public java.awt.Dimension minimumLayoutSize(java.awt.Container arg0);

    public void layoutContainer(java.awt.Container arg0);

    public java.lang.String toString();
}
