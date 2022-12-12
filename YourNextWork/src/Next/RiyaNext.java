package Next;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class RiyaNext {
	
	public static void main(String args[]) {
		try {
			BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\I304138\\eclipse-workspace\\YourNextWork\\src\\Next\\RiyaWorklist.txt"));
			String line;
			Integer i = 1;
			HashMap<Integer,String> map=new HashMap<Integer,String>();
			while((line = buff.readLine()) != null) {
				map.put(i, line);
				i++;
			}
			buff.close();
			int randomNum = ThreadLocalRandom.current().nextInt(1, i + 1);
			String value = map.get(randomNum);
			System.out.println(value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	

}
}

