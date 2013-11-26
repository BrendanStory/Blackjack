import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.util.Random;

public class Deck {

	private int counter;
	private MoviePoster poster = null;
	private Rectangle r = new Rectangle(0,0,50,1575);
	private int x;
	private int y;
	private MoviePoster randomc = null;

	//setting up arrays

	private String[] suitArray =  {"Hearts","Diamonds","Spades","Clubs"};
	private int[] valueArray  = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	private Card[] deck = new Card[51];
	private Card[] unShuffled = new Card[51];
	private int count;

	Random random = new Random();

	

	public Deck(Graphics g){

		String cardName = "";

		//Goes through each suit, and in each suit it goes through each number creating a card.
		//if a card has a specific vaulue, it changes the name to represent that vaulue better.
		//This only applies to face cards.
		

		for (int i = 0; i < suitArray.length; i++ ) {
			for (int j = 0; j < valueArray.length; j++ ) {
				Card card = new Card(valueArray[j], suitArray[i]);

				if (valueArray[j] == 1) {
					cardName = "A" + suitArray[i];
				} else if (valueArray[j] == 11) {
					cardName = "J" + suitArray[i];
				} else if (valueArray[j] == 12) {
					cardName = "Q" + suitArray[i];
				} else if (valueArray[j] == 13) {
					cardName = "K" + suitArray[i];
				} else {
					cardName = valueArray[j] + suitArray[i];
				}

				poster = new MoviePoster(cardName);

				if (x > 1000) {
					x = 0;
					y += 75;
				}

				Rectangle a = new Rectangle(x,y,50,75);
				                                             
				poster.draw(g,a);

				x += 50;
			}
		}
	}

	// One of the next two parts doesn't work and I don't know which
	// No one has been able to find the error that causes it not to shuffle
	// or print a shuffle yet. It's not variables, like cardName being the same
	// in prior commands, because I have changed every variable multiple times.

	public void shuffle() {
	    int randomCard = 0;
	    Card temp = new Card(2,"Hearts");

	    for (int i = 0; i < deck.length;i++ ) {
	        randomCard = random.nextInt(51);
	        temp = deck[i];
	        deck[i] = deck[randomCard];
	        deck[randomCard] = temp;
	                      
	    }
 	}



	public void printShuffle(Graphics g) {

		int q = 0;
		int z = 250;
	
		String cardName = null;

		for (int i = 0; i < deck.length; i++) {
			if (deck[i].cardValue == 0) {
				cardName = "A" + deck[i].suit;
			} else if (deck[i].cardValue == 11) {
				cardName = "J" + deck[i].suit;
			} else if (deck[i].cardValue == 12) {
				cardName = "Q" + deck[i].suit;
			} else if (deck[i].cardValue == 13) {
				cardName = "K" + deck[i].suit;
			} else	{
				cardName = deck[i].cardValue + deck[i].suit;
			}

			poster = new MoviePoster(cardName);

			if (q > 1000) {
				q = 0;
				z += 75;
			}

			Rectangle b = new Rectangle(q, z, 50, 75);

			poster.draw(g,b);

			q += 50;
		}
	}
}