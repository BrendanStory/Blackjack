import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MoviePoster {
	
	private String name;
	private Image image;

	public MoviePoster(String name) {
		setName(name);
		this.image = MoviePoster.loadImage(name);
	}

	public void draw(Graphics g, Rectangle r) {
		g.drawImage(image, r.x, r.y, r.width, r.height, null);
	}

	public static Image loadImage(String name) {
	 Image image = null;
	 String path = null;
		try	{
 			path = "cards" + File.separator + name + ".png";
 			image = ImageIO.read(new File(path));
		}  catch(IOException e) {
			System.out.println("Could not load image at path: " + path) ;
			System.exit(1);
		 }

		 return image;
	}

	public String name(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

}