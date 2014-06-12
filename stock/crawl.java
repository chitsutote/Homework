import java.io.*;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class crawl{
	
	public static void main(String[] args){
	
		try{
			//Document doc = Jsoup.connect("http://merry.ee.ncku.edu.tw/~chitsutote/HowMuchi/").get();
			Document doc = Jsoup.connect("https://tw.stock.yahoo.com/q/q?s=2498").get();
		    String title = doc.title();
			System.out.println(title);
			System.out.println(doc.body().text());
			}catch(IOException e){
				System.out.println("Exception occured");
			}


	}

}
