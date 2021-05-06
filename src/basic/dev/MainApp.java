package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12.1
				{int i;
				int sum = 0;
				for(i=1;i<=100;i++) {
					sum = sum + i;
				}
				System.out.println("tong 100 so dau tien= "+sum);}
				//12.2
				Scanner sc = new Scanner(System.in);
				{System.out.println("nhap vao so n= ");
				int n = sc.nextInt();
				int sum=0;
				for(int i = 1;i<=n;i++) {
					if (i%3==0) {
						sum=sum+i;
					}
				}
				System.out.println("tong cac so chia het cho 3 va be hon n =  "+sum);
			}
				//12.3
				{
					   int count = 100, num1 = 0, num2 = 1;
				        System.out.print("Chuỗi Fibonacci với "+count+" số là: ");
				        int i=1;
				       for(i=1;i<=count;i++)
				        {
				            System.out.print(num1+" ");
				            int sumOfPrevTwo = num1 + num2;
				            num1 = num2;
				            num2 = sumOfPrevTwo;
			
				        }
				        System.out.println();
				        System.out.println("----------------------------");		
				}
				//12.4
				{
					System.out.println("nhap vao so can kiem tra n = ");
					int n = sc.nextInt();
					int soDaoNguoc = 0;
					int soGoc;
					soGoc=n;
					while(n != 0) {
						int x = n % 10;
						soDaoNguoc = soDaoNguoc * 10 + x;
						n /= 10;
					}
					if(soGoc == soDaoNguoc) System.out.println(soGoc+ " là số đối xứng!!");
					else System.out.println(soGoc+ " không phải là số đối xứng!!");
					
				}
				//12.5
				System.out.println("Các số lớn hơn 99 và bé hơn 1000 có tổng các chữ số chia hết cho 3 là: ");
				{
					int i;
					int a,b,c;
					
				
					for(i=100;i<1000;i++){
						int x = i;
						a= x/100;
						b= (x%100)/10;
						c=(x%100)%10;
						int d = a+ b +c;
						if (d % 3 == 0) 
							System.out.print(+i+"\t");
						
					}

		}
		}}

		

