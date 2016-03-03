import java.util.Random;
import java.util.Scanner;


public class GuessNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //y,n받을 수 있게 오브젝트 생성
		String answer = "y"; //일단 y로 지정
		
		do{//일단 한번 실행
			
		Random r = new Random();
		int comvalue = r.nextInt(100) + 1; //수 랜덤결정
		
		int lowest = 1; //낮은 값
		int highest = 100; //높은 값
		int trial = 1; //시도횟수
		Scanner sc = new Scanner(System.in); //스캔받는 오브젝트
		int uservalue = 0; //사용자가 입력할 값의 변수
		
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요."); //처음에 나오는 말
		
		do{
		
			System.out.println(lowest+"-"+highest);
			System.out.print(trial+">>");
			uservalue = sc.nextInt(); //사용자가 수 입력
			
			//comvalue와 uservalue가 같으면 '맞았습니다'
			if(uservalue==comvalue){
				System.out.println("맞았습니다.");
			}
	    	
			//comvalue와 uservalue가 다르면 '더 높게' 또는 '더 낮게'
			else if(uservalue < comvalue){
				System.out.println("더 높게");
				lowest = uservalue; //lowest 값을 update				
			}
			
			else{
				System.out.println("더 낮게");
				highest = uservalue; //최대값 변경
			}
						
			//update
			trial++; 
		}while(uservalue != comvalue);		
		
		System.out.print("다시 하시겠습니까(y/n)>>");
		answer = scanner.next();		
		
		}while(answer.equals("y"));
		
		System.out.println("종료되었습니다.");
	  }
	}


