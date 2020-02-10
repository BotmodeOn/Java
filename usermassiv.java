package usermassiv;
import java.util.*;

public class usermassiv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите размер массива");
		int a = sc.nextInt();
		int mas [] = new int[a];
		for (int i = 0; i < mas.length; i++) {
			   System.out.println("¬ведите значение массива "+ (i+1)+" :");
			   mas[i] = sc.nextInt();
		}
		for(int c:mas) {
			System.out.print(c+" ");
		}
		

	}

}
