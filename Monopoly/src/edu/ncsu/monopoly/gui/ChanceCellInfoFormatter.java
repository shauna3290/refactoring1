package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Iownable1;

public class ChanceCellInfoFormatter implements CellInfoFormatter {
    
    public static final String CHANCE_CELL_LABEL = "<html><font color='teal'><b>Chance</b></font></html>";
    
    public String format(Iownable1 cell) {
        return CHANCE_CELL_LABEL;
    }
}
