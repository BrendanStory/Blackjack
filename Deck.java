import java.awt.*;
import java.applet.*;

class Deck extends Applet{

	private MoviePoster poster;

	private String[] suitArray =  {"Hearts","Diamonds","Spades","Clubs"};
	private int[] valueArray  = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	private Card[] deck = new Card[51];
	private int count;

	public Deck(){
		makeCards();
	}
		
	public void makeCards(){

		String cardName = "";

		for (int i = 0; i < suitArray.length; i++ ) {
			for (int j = 0; j < valueArray.length; j++ ) {
				Card card = new Card(valueArray[j], suitArray[i]);
				if (j == 0) {
					System.out.println("A" + suitArray[i]);
				} else if (j == 10) {
					System.out.println("J" + suitArray[i]);
				} else if (j == 11) {
					System.out.println("Q" + suitArray[i]);
				} else if (j == 12) {
					System.out.println("K" + suitArray[i]);
				} else {
					System.out.println(valueArray[j] + suitArray[i]);
				}
			}
		}
	}

	public void paint(Graphics g) {
		poster.draw(g, new Rectangle(50, 50, 200, 300));
	}

}