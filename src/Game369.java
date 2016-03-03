

public class Game369 {
	public static void main(String[] args) {
		for(int i=1; i<100; i++){
			String number = String.valueOf(i);
			
			int numlength = number.length();
			int count =0;
			
			for(int j=0; j<numlength; j++){
				if((number.charAt(j)=='3')||(number.charAt(j)=='6')||(number.charAt(j)=='9')){ 
					count++;
				}
			if(count!=0){
				System.out.print(number+" ");
			for(int k=0; k<count; k++){
				System.out.print("짝");
			}
				System.out.println();
				}
			}
		}
	}
}
