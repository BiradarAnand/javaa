class student{
   String name;
   int age;
void display(){
	System.out.println("Name " + name);	
	System.out.println("Age "+age);
}
}
public class Main{
 public static void main(String[] args){
	student s1= new student();
    s1.name="Anand";
	s1.age=18;
	s1.display();
}
}