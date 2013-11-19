import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.util.Random;

public class Deck {

	private int counter;
	private MoviePoster poster;
	private Rectangle r = new Rectangle(0,0,100,150);
	private int x;
	private int y;

	private String[] suitArray =  {"Hearts","Diamonds","Spades","Clubs"};
	private int[] valueArray  = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	private Card[] deck = new Card[51];
	private int count;

	private Random random = new Random();

	String cardName = "";

	public Deck(Graphics g){
		

		for (int i = 0; i < suitArray.length; i++ ) {
			for (int j = 0; j < valueArray.length; j++ ) {
				Card card = new Card(valueArray[j], suitArray[i]);

				if (j == 0) {
					cardName = "A" + suitArray[i];
				} else if (j == 10) {
					cardName = "J" + suitArray[i];
				} else if (j == 11) {
					cardName = "Q" + suitArray[i];
				} else if (j == 12) {
					cardName = "K" + suitArray[i];
				} else {
					cardName = valueArray[j] + suitArray[i];
				}

			}
		}
	}

	public void shuffle() {
		int randomCard = 0;
		Card temp = new Card(2,"Hearts");	

		for (int i = 0; i < deck.length; i++) {
			randomCard = random.nextInt(52);
			temp = deck[i];
			deck[i] = deck[randomCard];
			deck[randomCard] = temp;
		}
	}



	public void print(Graphics g) {
	
		poster = new MoviePoster(cardName);

		for (int i =0; i <deck.length; i++) {
		
	

			if (x > 1000) {
				x = 0;
				y += 125;
			}

			Rectangle a = new Rectangle(x,y,100,150);
	                                               
			poster.draw(g,a);

			x += 100;
		}
	}
}