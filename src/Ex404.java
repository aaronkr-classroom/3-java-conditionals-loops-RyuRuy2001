import java.util.Scanner;
public class Ex404 {

	public static void main(String[] args) {
		System.out.print("당신의 나이가 뭐에요?");
		System.out.print("\n당신의 키가 몇 cm이에요?");
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int height = s.nextInt();
		
		if(age > 15) {
			if (height > 140) {
				System.out.println("T-익스프레스르 탈 수 있어요!");
			} else {
		System.out.println("미안해요, 키 때문에 못타요");
			} 
		}else {
		System.out.println("미안해요, 나이 때문에 못타요");
		}

	}
	
}
