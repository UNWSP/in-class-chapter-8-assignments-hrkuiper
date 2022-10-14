package parallelarrays;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class ThreeParallelArrays {

	public static void main(String[] args) {
		String states[] = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		String statesAbbreviation[] = {"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
		String capitals[] = {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta","Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort","Baton Rouge","Augusta","Annapolis","Boston","Lansing","St. Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus","Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City","Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"};
		
		
		
		// creating while statement 
		while(true) {
			// creating user input 
			String StateInput = JOptionPane.showInputDialog(null, "please enter a state");
			
			// intiating index variable
			int index = -1;
			
			// searching array with user input 
			for(int i=0; i<50; i++) {if( states[i].equals(StateInput)){index=i;break;}
			}
			// checking to make sure that the user entered a correct state
			if(index != -1) {
				String abrev = statesAbbreviation[index];
				String cap = capitals[index];
				
				JOptionPane.showMessageDialog(null,"here is the abbreviation " + abrev + " here is capital city " + cap +"\n");
				// asking user for zip code 
				String zip = JOptionPane.showInputDialog(null, "please enter your zip code");
				// adding to array
				Array.set(capitals, index, cap + "-"+ zip);
				
			}
			else {
				JOptionPane.showMessageDialog(null, "That is not a valid state");
				
			}
			
		}
		
	}
}