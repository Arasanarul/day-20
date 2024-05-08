
import java.util.*;
public class hello{
  public static boolean exactlyKNonZeroDigits(int val,int k){
    int count=0;
    while(val>0){
      if(val%10!=0){
        count++;
      }
      val/=10;
    }
    return count==k;
  }
  public static void main(String[] args){
    //exactly k non zero digits
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int Y=sc.nextInt();
    int K=sc.nextInt();
    boolean print=false;
    for(int i=x;i<=y;i++){
      if(exactlyKNonZeroDigits(i,K)){
        System.out.print(i+" ");
        print=true;
      }
    }
    if(!print){
      System.out.print("-1");
    }
  }
    
