//package CatchWeb;

import java.io.*;
import java.net.URL;
import java.util.Iterator;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {
	public static void main(String[] args) throws IOException{
		int count = 0;
		FileWriter fw = new FileWriter("new.txt");
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
	    URL url = new URL("https://tw.stock.yahoo.com/q/h?s=" + number);
	    Document doc = Jsoup.parse(url, 3000);
	    Element table0 = doc.select("table[border=0]").get(5);
	    Iterator <Element> item = table0.select("td").iterator();
	    
	    while(item.hasNext())
		{
		    count++;
		    String temp = item.next().text();
		    if(count % 3 == 2){
		    	fw.write(temp+"\r\n");
		    }
		    if(count % 3 == 0){
		    	String AfterSplit = temp.replace("(", "");
		    	AfterSplit = AfterSplit.replace(")", "");
		    	String []SplitArray = AfterSplit.split(" ");
		    	fw.write(SplitArray[0]+"\r\n");
		   }
		}
		fw.flush();
		fw.close();
    	}
}
