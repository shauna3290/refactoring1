package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Iownable1;

public class JailCellInfoFormatter implements CellInfoFormatter {

    public static final String JAIL_CELL_LABEL = "<html><b>Jail</b></html>";

    public String format(Iownable1 cell) {
		return JAIL_CELL_LABEL;
	}

}
