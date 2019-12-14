import java.util.ArrayList;
import java.util.Scanner;

public class DataBank {

    protected String name;
    protected String title;
    public static int month;
    public ArrayList<Integer>istenmeynGunler=new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);

    public DataBank(int i) {
        istenmeynGunler.add(i);
    }
    public void ist_GunGir(){

        String cont ="";
        int gun ;
        do {
            System.out.println("Istenmeyen_Gunleri Gir :");
            cont = this.scan.nextLine();

            if(if_num(cont)){
                istenmeynGunler.add(Integer.parseInt(cont));

            }
        } while ( true );
    }
    public boolean if_num(String cont){

        for(int i =0; i< cont.length(); i++){

            if((cont.charAt(i)<48) || (cont.charAt(i)>57)){
                return  false;
            }
        }return true;
    }

    public static void main(String[] args) {

    }

}
