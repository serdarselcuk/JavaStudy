package day39_javaReview;

public class CellPhoneObjects {
    
    public static void main(String[] args) {
        
        CellPhone  phone1 = new CellPhone();
            System.out.println( phone1.brand );  // 
            System.out.println( phone1.color );  // 
            System.out.println( phone1.model);   // 
            System.out.println( phone1.price);   //
            System.out.println( phone1.screenSize);  //
        
        CellPhone phone2 = new CellPhone("Motorola","z2 play","gray", 200 , 6.1 );
                phone2.getInfo();
        
        CellPhone phone3 = new CellPhone("Nokia", "black", "3330", 3, 20);
                phone3.getInfo();
                
        CellPhone phone4 = new CellPhone("Samsung", "red", "GT-I7500", 700, 6.1);
                phone4.getInfo();
        
        CellPhone[] phones = {phone1, phone2, phone3, phone4 };
        
        // brand of phone3:
        System.out.println( phones[2].brand + " "+phones[2].model);
        
        // get info of phone3
        phones[2].getInfo();
                
        
        
                
    }
}


