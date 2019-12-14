package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Amazon {

		public static void main(String[] args) {
			ArrayList<ArrayList<Integer>>list = new ArrayList<>(Arrays.asList(1,1,0,0));
			int [] liste = {1,1,0,0};
			
			ArrayList<Integer>island = new ArrayList<>();
			System.out.println(list);
			ArrayList<ArrayList<Integer>> ArrayListOfLists = new ArrayList<ArrayList<Integer>>();
/*			for (int i = 0; i< island.length; i++) {
				for(int j = 0 ; j< island[i].length ; j++) {
					if (island[i][j] == 1) {
						list.add((10*i)+j);
						
					}
				}
			}System.out.println(list);
			ArrayList<Integer>control = new ArrayList<>();
			int i = 0;
			int count = 0;
			while(0< list.size()) {
				Integer cont = list.get(i);
				while(list.remove(cont)) {
					cont += 1;
						
					
				}
				
			}
			System.out.println(control);
			System.out.println(count +"<===count");*/
		}
}
