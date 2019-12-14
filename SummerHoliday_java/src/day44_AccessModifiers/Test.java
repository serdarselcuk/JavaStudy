package day44_AccessModifiers;

//import static day44_AccessModifiers.TestData.ID;
import java.util.Arrays;
//import static day44_AccessModifiers.Testdata.Name;
//                  packagename    classname.staticName
 
import static day44_AccessModifiers.TestData.*;
 
public class Test {
    public static String Name ="Muhtar";
    
    public static void main(String[] args) {
        
        System.out.println( Name );
        System.out.println(TestData.Name);
        System.out.println( ID );
        System.out.println( SchoolName);
        
        
    }
}