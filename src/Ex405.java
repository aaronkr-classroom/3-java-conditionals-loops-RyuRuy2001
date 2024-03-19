import java.util.Scanner;

public class Ex405 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요: ");
		
		Scanner z = new Scanner(System.in);
		int grade = z.nextInt();
		
		switch(grade / 10) {
		case 10: 
		case 9:
			System.out.println("A!! 넌 천재!");
		case 8:
			System.out.println("B - 괜찮아~ 괜찮아~");
		case 7:
			System.out.println("C - 어차피 졸업할 수 있자너~");
		case 6: 
			System.out.println("D - 겜좀 그만해!");
			default:  
				System.out.println("F - 사람임?");
		}
		
		
		
		if (grade >= 90 ) {
			
		} else if (grade >=80) {
			
	    } else if (grade >= 70){
	    	
	    } else if (grade >= 60) {
	    	
	    } else {
	    	
	    }
		
     	}
 
}
