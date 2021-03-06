package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Iownable1;
import edu.ncsu.monopoly.Player;
import edu.ncsu.monopoly.RailRoadCell;

public class RRCellInfoFormatter implements CellInfoFormatter {
    public String format(Iownable1 cell) {
        RailRoadCell c = (RailRoadCell)cell;
        StringBuffer buf = new StringBuffer();
        Player owner = cell.getTheOwner();
        String ownerName = "";
        if(owner != null) {
        	ownerName = owner.getName();
        }
        buf.append("<html><b><font color='lime'>")
                .append(cell.getName())
                .append("</font></b><br>")
                .append("$").append(c.getPrice())
				.append("<br>Owner: ").append(ownerName)
                .append("</html>");
        return buf.toString();
    }
}
