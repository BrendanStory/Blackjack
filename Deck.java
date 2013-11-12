import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.applet.*;


import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.util.Random;

class Deck extends Applet{

	private int counter;
	private MoviePoster poster;
	private Rectangle r = new Rectangle(0,0,100,150);
	private int x;
	private int y;

	private String[] suitArray =  {"Hearts","Diamonds","Spades","Clubs"};
	private int[] valueArray  = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	private Card[] deck = new Card[51];
	private int count;

	public Deck(Graphics g){
		String cardName = "";

		for (int i = 0; i < suitArray.length; i++ ) {
			for (int j = 0; j < valueArray.length; j++ ) {
				Card card = new Card(valueArray[j], suitArray[i]);

				if (j == 1) {
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

				poster = new MoviePoster(cardName);

				if (x > 1000) {
					x = 0;
					y =+ 125;
				}

				Rectangle a = new Rectangle(x,y,100,150);
				                                               
				poster.draw(g,a);

				x += 100;
			}
		}
	}
}