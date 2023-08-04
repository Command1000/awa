import java.util.Scanner;

public class awa{
    public static void main(String []args){
    int n1;
    Scanner input = new Scanner(System.in);
    System.out.println("請從阿拉伯數字1至10選擇一個輸入");
    n1=input.nextInt();

    if(n1==0){
        System.out.println("我猜你選的數字是0");
    }
    else if(n1==1){
        System.out.println("我猜你選的數字是1");
    }
    else if(n1==2){
        System.out.println("我猜你選的數字是2");
    }
    else if(n1==3){
        System.out.println("我猜你選的數字是3");
    }
    else if(n1==4){
        System.out.println("我猜你選的數字是4");
    }
    else if(n1==5){
        System.out.println("我猜你選的數字是5");
    }
    else if(n1==6){
        System.out.println("我猜你選的數字是6");
    }
    else if(n1==7){
        System.out.println("我猜你選的數字是7");
    }
    else if(n1==8){
        System.out.println("我猜你選的數字是8");
    }
    else if(n1==9){
        System.out.println("我猜你選的數字是9");
    }
    else if(n1==10){
        System.out.println("我猜你選的數字是10");
    }
    else{
        System.out.println("error");
    }
}
}   