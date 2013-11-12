class Card {
	private int cardValue;
	private Boolean faceUp;
	private String suit;

	public Card(int cardValue, String suit){
		setCardValue(cardValue);
		setSuit(suit);
		

	}

	public int cardValue(){
		return cardValue;
		
	}
	public void setCardValue(int cardValue){
		this.cardValue = cardValue;
	}

	public String suit(){
		return suit;
	}
	public void setSuit(String suit){
		this.suit = suit;
	}
}