//Changing the return types
public class Sample {
    int disp(int x){
        return x;   
    }
    double display(int y){
        return y;
    }
    public static void main(String args[]){
    Sample s = new Sample();
    System.out.println("Value of x : " + s.disp(5));
    System.out.println("Value of y : " + s.display((int)6.5));
    }  
}