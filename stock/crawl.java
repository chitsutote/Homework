import java.io.*;
import java.net.URL;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class crawl{
	
	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(System.in);
		
		//Stock code	    
		String code = input.nextLine();
		//Query date
		String date = input.nextLine();

		
		String FileName = "price_"+code+".txt";
		FileWriter fw = new FileWriter(FileName);


		String year = date.substring(0,4);
		String month = date.substring(4,6);
		String YearMonth = date.substring(0,6);

		String MinGou = Integer.toString( (Integer.valueOf(year)-1911) );
	


				
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
					if( count % 9 == 1){
						String day = temp.replace(MinGou,year);

						fw.write(day+" ");
					}else if( count % 9 == 7){
						String value = temp;
						fw.write(value+"\r\n");
					}
				}
			}

			}catch(IOException e){
				System.out.println("Exception occured");
			}
			fw.flush();
			fw.close();

	}

}
