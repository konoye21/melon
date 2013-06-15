import java.util.Scanner;
public class converter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dec =  0;
		double rem =  0;
		double expo =0;
		String bin = "";
		System.out.println("dame el numero decimal a convertir");
		Scanner in = new Scanner(System.in);
		dec = in.nextFloat();
		
//		System.out.println(Math.pow(2, -1));
		
		rem = dec;
		
		for (int i = -1; i >= -15; i = i-1) {
			//rem = dec - rem;
			//System.out.println(i);
	
			
			expo = Math.pow(2,i);
//			System.out.println(expo);

			if(rem  != 0){
				
				if (expo>rem){
					bin = bin+0;
					System.out.println(bin);
				}						
						}
			
			}
			//System.out.println("estado del ciclo"+ "\nrestante"+rem+"\nexpo"+expo+ "\nnumero de ciclo"+i+"\n\n\n");
			//	System.out.println("en binario es"+ bin);					
			}
		


		}



