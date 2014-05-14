package intenglish;

import java.util.Scanner;

public class IntToEng {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println(translateEng(input));
        
    }
    
    // 数値を英訳する変換するメソッド
    public String translateEng(int n) {
    	String[] num1={"zero", "one", "two", "three", "four", "five", "six", "seven","eight","nine","ten", "eleven","twelve","thirteen", "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] num2={"twenty", "thirty", "forty","fifty","sixty","seventy","eighty","ninety","hundred"};
        String number;
        if(n<0) {
        	throw new NumberFormatException();
        }
        else if(n<20){
        	number=num1[n];
        } else if(n<=100){
        	if(n%10==0){
        		int x=n/10;
        		number=num2[x-2];
        	}
        	else{
        		int y=n/10;
        		int z=n%10;
        		number=num2[y-2]+" "+num1[z];
        	}
        }else if(n<1000){
        	if(n%100==0){
        		int a=n/100;
        		number=num1[a]+"hundred";
        	}else{
        	
        		int c=n/100;
        		int b=n%100;
        		String number2;
        		if(b<20){
                	number2=num1[n];
                } else{
                	if(b%10==0){
                		int x=b/10;
                		number2=num2[x-2];
                	}
                	else{
                		int y=b/10;
                		int z=b%10;
                		number2=num2[y-2]+" "+num1[z];
                	}
                }
        		number=num1[c]+" hundred "+number2;
        	}
        }else{
        	throw new NumberFormatException();
        }
    	return number;
    }
}