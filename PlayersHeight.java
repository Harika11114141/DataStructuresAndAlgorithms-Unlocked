import java.util.Scanner;
public class PlayersHeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of students");
		// Creation of Array
		float []height = new float[sc.nextInt()];
		// Storing the Array
		for(int i = 0; i <= height.length-1 ; i++) {
			System.out.println("Enter the players height: " + i);
			height[i] = sc.nextFloat();
		}
		//traditional way to accessing the elements
//		for(int i = 0; i<= height.length-1 ; i++) {
//			System.out.println(height[i]);
//		}
		// Traversing the Array
		//for each data is present in array height and take the data store it one variable called 'element'
		for(float element : height) {
			System.out.println(element);
		}
		sc.close();
	}
}
