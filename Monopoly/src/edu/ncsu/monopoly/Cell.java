package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable, Iownable1 {
	private String name;
	protected Player theOwner;
	private boolean available = true;

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.Iownable1#getName()
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.Iownable1#getTheOwner()
	 */
	public Player getTheOwner() {
		return theOwner;
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.Iownable1#getPrice()
	 */
	public int getPrice() {
		return 0;
	}

	public abstract boolean playAction(String msg);

	void setName(String name) {
		this.name = name;
	}

	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    public String toString() {
        return name;
    }

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
