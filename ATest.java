package OOPTest;
public class ATest extends shape {
	public static void main(String[] arg) {
		ATest ab=new ATest();
		System.out.println("Shape Information");
		System.out.println(ab.showshape());
		circle c=new circle("green",true, 1.0);
		System.out.println("Circle Information");
	    System.out.println(c.showc());
	    rectangular r=new rectangular("black",true, 2.0,3.0);
		System.out.println("Rectangular Information");
	    System.out.println(r.showr());
	    square s=new square("Pink",true, 1.0);
		System.out.println("Square Information");
	    System.out.println(s.shows());
		
	}

	double getArea() {
		
		return 0;
	}


	double getParameter() {
		
		return 0;
	}
	

}
abstract class shape{
	String color="red";
	Boolean fill=true;
	shape(){}
	shape(String color,Boolean fill){
		this.color=color;
		this.fill=fill;
	}
	public String getColor(String color) {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public Boolean getFill(Boolean fill) {
		return fill;
	}
	public void setFill(Boolean fill) {
		this.fill=fill;
	}
	abstract double getArea() ;
	abstract double getParameter();
	public String showshape() {
		return "Colour : "+color+" Fill :"+fill;
	}
}
class circle extends shape{
	double radius=0.0;
	circle(){}
	circle(String color,Boolean fill,double radius){
		super(color,fill);
		this.radius=radius;
	}
	
	double getArea() {
		
		return 3.14*radius*radius;
	}
	
	double getParameter() {
		
		return 2*3.14*radius;
	}
	public String showc() {
		return "Colour : "+color+" Fill :"+fill+" Area : "+this.getArea()+" Parameter : "+this.getParameter();
	}
}
class rectangular extends shape{
	double width,height;
	rectangular(){}
	rectangular(String color,Boolean fill,double width,double height){
		super(color,fill);
		this.width=width;
		this.height=height;
	}
	
	double getArea() {
		
		return width*height;
	}
	
	double getParameter() {
		
		return 2*(width+height);
	}
	public String showr() {
		return "Colour : "+color+" Fill :"+fill+" Area : "+this.getArea()+" Parameter : "+this.getParameter();
	}
}

class square extends shape{
	double l;
	square(){}
	
	square(String color,Boolean fill,double l){
		super(color,fill);
		this.l=l;
	}
	
	double getArea() {
		
		return l*l;
	}
	
	double getParameter() {
		
		return 4*l;
	}
	
	public String shows() {
		return "Colour : "+color+" Fill :"+fill+" Area : "+this.getArea()+" Parameter : "+this.getParameter();
	}
}

