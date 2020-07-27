package java_Programs;
import java.util.Scanner;
public class A3_P4_GiftCardTest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		A3_P4_Giftcard gt= new A3_P4_Giftcard(1001,5000.0,true);
		
		gt.reachargeCard(2000);
		System.out.println(" current balance : Rs."+gt.getBalance());
		
		gt.swipeCard(400);
		System.out.println("Updated balance : Rs."+gt.getBalance());
		
		gt.swipeCard(500);
		System.out.println("Updated  balance "+gt.getBalance());
		
		
		System.out.println("------------------------------");
		
		A3_P4_Giftcard ngt=new A3_P4_Giftcard();
		ngt.setActive(true);
		ngt.reachargeCard(3000);
		ngt.swipeCard(500);
		ngt.swipeCard(2600);
		System.out.println("current balance : Rs."+ngt.getBalance());
		
		
	}
	
	

}