package mainPackage;

public class Triangle extends GeometricObject{
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	double peri = getPerimeter();

	public Triangle(){
	
	}
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}


	public double getArea(){
			
		double area = Math.pow((peri * ((peri-side1)*(peri-side2)*(peri-side3))), (1/2));
		return area;
	
	}
	public double getPerimeter(){
		return ((side1 + side2 + side3)/2);
	}

	public String toString() {
		return "TriangleClass [side1= " + side1 + ", side2= " + side2
			+ ", side3= " + side3 + ", peri= " + peri + "]";
}

}


