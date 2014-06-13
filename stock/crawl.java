import java.io.*;
import java.net.URL;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class crawl{
	
	public static void main(String[] args){
		
		//Stock code	    
		String code = args[0];
		//Query date
		String date = args[1];

		System.out.println(code);
		System.out.println(date);

		String year = date.substring(0,4);
		String month = date.substring(4,6);
		String YearMonth = date.substring(0,6);


				
		//Target url : Taiwan Stock Exchange
        String url = "http://www.twse.com.tw/ch/trading/exchange/STOCK_DAY/genpage/Report"+YearMonth+"/"+YearMonth+"_F3_1_8_"+code+".php?STK_NO="+2498+"&myear="+year+"&mmon="+month;
		//Try crawl web information
		try{
			
			URL request = new URL(url);
			//Jsoup.parse(url,request connection time limit)
			Document doc = Jsoup.parse(request,5000);

			Elements table = doc.select("tr.basic2");

			Iterator<Element> item = table.select("td").iterator();
			
			int count=0;
			while(item.hasNext()){
				count++;
				String temp = item.next().text();
				if( count > 9){
					System.out.println("Number"+count+"  "+temp);
				}
			}

			}catch(IOException e){
				System.out.println("Exception occured");
			}


	}

}
