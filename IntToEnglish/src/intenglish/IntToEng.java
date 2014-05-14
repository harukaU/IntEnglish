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
        String[] num2={"twenty", "thirty", "forty","fifty","sixty","seventy","eighty","ninety"};
        String number;
        if(n<0) {
        	throw new NumberFormatException();
        }
        else if(n<20){
        	number=num1[n];
        } else{
        	if(n%10==0){
        		int x=n/10;
        		number=num2[x-2];
        	}
        	else{
        		int y=n/10;
        		int z=n%10;
        		number=num2[y-2]+" "+num1[z];
        	}
        }
    	return number;
    }
}