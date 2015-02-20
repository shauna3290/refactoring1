package edu.ncsu.monopoly;

public class CardCell extends Cell {
    private int type;
	public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public boolean playAction(String msg) {

    	boolean strFlag = false;
    	if(msg != null){
    		strFlag = true;
    	}else{
    		strFlag = false;
    	}
    	return strFlag;
    }
    
    public int getType() {
        return type;
    }
}
