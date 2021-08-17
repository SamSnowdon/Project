import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

//Sam Snowdon and Ibrahim Manfoud

public class Assets {
	
	static ArrayList<BufferedImage> imageList;

	static void init() {
		imageList = new ArrayList<BufferedImage>();
		try {
			System.setProperty("http.agent",
					"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.29 Safari/537.36");
			URL url = new URL(
					"https://cdn.discordapp.com/attachments/429121521529651210/876865080858382336/UpArrow.png");
			imageList.add(ImageIO.read(url.openStream()));
			url = new URL(
					"https://cdn.discordapp.com/attachments/429121521529651210/876865071236661248/DownArrow.png");
			imageList.add(ImageIO.read(url.openStream()));
			url = new URL(
					"https://cdn.discordapp.com/attachments/429121521529651210/876865091176394782/LeftArrow.png");
			imageList.add(ImageIO.read(url.openStream()));
			url = new URL(
					"https://cdn.discordapp.com/attachments/429121521529651210/876865100315770951/RightArrow.png");
			imageList.add(ImageIO.read(url.openStream()));
			url = new URL(
					"https://cdn.discordapp.com/attachments/429121521529651210/876865675438743712/UpArrowTemplate.png");
			imageList.add(ImageIO.read(url.openStream()));
			url = new URL(
					"https://cdn.discordapp.com/attachments/429121521529651210/876865673073152101/DownArrowTemplate.png");
			imageList.add(ImageIO.read(url.openStream()));
			url = new URL(
					"https://cdn.discordapp.com/attachments/429121521529651210/876865696548659250/LeftArrowTemplate.png");
			imageList.add(ImageIO.read(url.openStream()));
			url = new URL(
					"https://cdn.discordapp.com/attachments/429121521529651210/876865685748330536/RightArrowTemplate.png");
			imageList.add(ImageIO.read(url.openStream()));
			url = new URL(
					"https://cdn.discordapp.com/attachments/429121521529651210/876864184757923891/download.jpg");
			imageList.add(ImageIO.read(url.openStream()));
			url = new URL(
					"https://cdn.discordapp.com/attachments/429121521529651210/876862137773989958/border.png");
			imageList.add(ImageIO.read(url.openStream()));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
