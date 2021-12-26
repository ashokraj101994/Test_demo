import java.util.Scanner;

public class IfDemo{

public static void main(String[] args){

int[] arr={10,20,30,50,50};

System.out.println("Please enter value to be searched");

Scanner in = new Scanner(System.in);

int target = in.nextInt();
for(int i=0;i<5;i++){
if(arr[i]==target){

System.out.println("Value found");

}
if(arr[i]!=target)
{System.out.println("Value not found");
} break;

}

}

}