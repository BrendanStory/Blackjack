class Card {
	private int cardValue;
	private Boolean faceDown;
	private String suit;

	public Card(int cardValue, String suit){
		setValue(cardValue);
		setSuit(suit);
		

	}

	public int cardValue(){
		return cardValue;
		
	}
	public void setValue(int cardValue){
		this.cardValue = cardValue;
	}

	public String suit(){
		return suit;
	}
	public void setSuit(String suit){
		this.suit = suit;
	}
}