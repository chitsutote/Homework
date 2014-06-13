import java.io.*;
import java.net.URL;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class crawlAll{
	
	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(System.in);
		String code = input.nextLine();
		String FileName = "Allprice_"+code+".txt";

		FileWriter fw = new FileWriter(FileName);
	
		String[] year = {"2011","2012","2013","2014"};
		String[] month = {"01","02","03","04","05","06","07","08","09","10","11","12"};
		


		
		for(int i = 0; i < 4 ; i++){	
			for(int j = 0 ; j < 12 ; j++){
				if( year[i].equals("2014") && month[j].equals("07")){
					break;
				}
				//System.out.println("year"+year[i]+"Month"+month[j]);
				//Target url : Taiwan Stock Exchange
				String MinGou = Integer.toString( (Integer.valueOf(year[i])-1911) );
				String url = "http://www.twse.com.tw/ch/trading/exchange/STOCK_DAY/genpage/Report"+year[i]+month[j]+"/"+year[i]+month[j]+"_F3_1_8_"+code+".php?STK_NO="+2498+"&myear="+year[i]+"&mmon="+month[j];
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
							String day = temp.replace(MinGou,year[i]);
							fw.write(day+" ");
						}else if( count % 9 == 7){
							String value = temp;
							fw.write(temp+"\r\n");
						}
					}
				}

				}catch(IOException e){
					System.out.println("Exception occured");
				}
			}
		}
			fw.flush();
			fw.close();

	}

}
