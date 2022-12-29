// args[] 사용방법 코드

package sec03.exam01;
import java.util.Scanner;
public class Hello {
	int num ; // 필드  전역변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단 수를 입력하세요 :");
		int num = scanner.nextInt();
			for(int j=1; j < 10; j++) {
				System.out.println(num + " x " + j + " = " + num * j);
			}
			System.out.println();
		}
	}




