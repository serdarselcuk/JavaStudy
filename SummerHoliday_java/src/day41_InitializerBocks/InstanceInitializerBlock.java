package day41_InitializerBocks;

public class InstanceInitializerBlock {
	int count = 1;		// because it is an instance variable it can't be called from any static method
	
	{
		System.out.println("serdar selcuk1 - "+ count);//
		count++;
	}
	{
		System.out.println("serdar selcuk3 - "+ count);
		count++;
	}
	{
		System.out.println("serdar selcuk2 - "+ count);
		count++;
	}
	
	public InstanceInitializerBlock() {
		
		System.out.println("finaly after instance statement constructor gets executed ");
	}
	
		public static void main(String[] args) {
			
			InstanceInitializerBlock obj1 = new InstanceInitializerBlock();//	serdar selcuk11
																		//		serdar selcuk32
																		//		serdar selcuk23
		//	InstanceInitializerBlock obj2 = new InstanceInitializerBlock();//	serdar selcuk11
																		//		serdar selcuk32
																		//		serdar selcuk23
		//	InstanceInitializerBlock obj3 = new InstanceInitializerBlock();//	serdar selcuk11
																		//		serdar selcuk32
																		//		serdar selcuk23
			
		}
}
