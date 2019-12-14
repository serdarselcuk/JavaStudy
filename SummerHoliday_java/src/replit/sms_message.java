package replit;

import day18_stringMethods.stringMethods_Boolean;

public class sms_message {

		public static void main(String[] args) {
			String input = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
			
			String name = input.substring(input.indexOf("<")+1, input.indexOf(">"));
			String lastname = input.substring(input.indexOf("[")+1,input.indexOf("]"));
			String message = input.substring(input.indexOf("{")+1,input.indexOf("}"));
			System.out.println("Sender: "+name
					+ "\nPhone Number: "+lastname
					+"\nMessage body: "+message);
		}
}
