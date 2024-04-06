import java.util.Scanner;

class SomarDoisNumeros {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		float x, y;
		
		x = sc.nextFloat();
		y = sc.nextFloat();
		
		System.out.println(x + y);
		
		sc.close();
	}
}
