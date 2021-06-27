package day2;

public class Test2 {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        System.out.println(x/y);    //0，整型变量1除以2值为0，因为整型计算不算小数点的
        System.out.println(y/x);    //2，整型变量2除以1整除，结果是2
        System.out.println(x%y);    //1，整型变量1除以2取余数1
        System.out.println(y%x);    //0，整型变量2除以1取余数0
    }
}
