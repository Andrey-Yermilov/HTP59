package Homework2;

public class Task6DOP {
    public static void main(String[] args) {
        double y;
        for (double i = -4; i <=4 ; i=i+0.5) {
            y = 2*Math.pow(i,2)-5*i-8 ;
            System.out.printf("x = %+.1f; y = %+.1f\n",i,y);
        }
    }
}
