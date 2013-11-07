import awt.Graphics;
import awt.Image;
import awt.Rectangle;

import java.io.File;
import java.io.IOException;

import java.imageio.ImageIO;

public class MoviePoster {
	
	private String name;
	private Image image;

	public MoviePoster(String name) {
		this.name = name;
		this.image = MoviePoster.loadImage(name);
	}

	public void draw(Graphics g, Rectangle r) {
		g.drawImage(image, r.x, r.y, r.width, null);
	}

	public static Image load(String name) {
		try	{
 			path = "images" + File.separator + name + ".jpg";
 			File file = new File(path);
 			image = ImageIO.read(file);
		}  catch(IOException e) {
			System.out.println("Could not load image at path: " + path) ;
			System.exit(1);
		 }

	}


}