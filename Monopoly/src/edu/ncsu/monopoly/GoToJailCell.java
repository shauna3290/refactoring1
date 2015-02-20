package edu.ncsu.monopoly;

public class GoToJailCell extends Cell {
	
	public GoToJailCell() {
		setName("Go to Jail");
	}

	public boolean playAction(String msg) {
		Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		JailCell jail = (JailCell)(GameMaster.instance().getGameBoard().queryCell("Jail"));
		GameMaster.instance().sendToJail(currentPlayer);

    	boolean strFlag = false;
    	if(msg != null){
    		strFlag = true;
    	}else{
    		strFlag = false;
    	}
    	return strFlag;
	}
}
