import java.util.*;
class Body{
    int bmi;
    double bmi(double wt, double ht){
        double bmi;
        bmi=wt/(ht*ht);
        double d=bmi;
        if(d<18.5){
        System.out.println("Underweight");
       }
       else if(18.5<d && d<24.9){
        System.out.println("Normal weight");
       }
       else if(24<d && d<29.9){
        System.out.println("Overweight");
       }
       else{
        System.out.println("O"+"bese");
       }
        return bmi;
    }      
} 
public class ma {
    public static void main(String[] args){
        // double weight=68.0;
        // double height=1.65;
        Scanner src =new Scanner(System.in);
        double weight=src.nextDouble();
        double height=src.nextDouble();
        Body b1=new Body() ;
        double d=b1.bmi(weight,height);
        System.out.println("BMI is :"+d);
      
        
}
}