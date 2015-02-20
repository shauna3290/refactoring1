package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Iownable1;

public class CCCellInfoFormatter implements CellInfoFormatter {
    public String format(Iownable1 cell) {
        return "<html><font color='white'><b>" + cell.getName() + "</b></font></html>";
    }
}
