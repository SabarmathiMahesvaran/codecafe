package Abstraction;

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       square sq=new square();
       Rectangle rl=new Rectangle();
       sq.calArea();
       sq.display();
       rl.calArea();
       rl.display();
       System.out.println("---------------------------------------------");
       //runtime Polymorphism / Dynamic binding / late binding
       //for example method overrieding
       shape Shape;
       Shape=new square(10.3f);
       Shape.calArea();//now we inkoved the square class calARea
       Shape.display();
       Shape=new Rectangle(10.3f,22.3f);//now we inkoved the rectangle class calArea
       Shape.calArea();
       Shape.display();
       
        
        
        
       
       
       
       
	}

}
