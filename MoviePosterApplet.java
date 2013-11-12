import java.awt.*;
import java.applet.*;

public class MoviePosterApplet extends Applet {

	private MoviePoster poster;

	public void init() {
		poster = new MoviePoster ("BlackJack");
	}
	
	public void paint(Graphics g) {
		poster.draw(g, new Rectangle(50,50,200,300));
	}
}