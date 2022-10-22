public class Test4{
	public static double calcTriangleArea(double bottom, double height) {
		double TriangleArea = bottom * height / 2;
		return TriangleArea;
	}
	public static double calcCircleArea(double radius) {
		double CircleArea = radius * radius * 3.14;
		return CircleArea;
	}
	public static void main(String[] args) {
		double TriangleArea = calcTriangleArea(10.0, 5.0);
		double CircleArea = calcCircleArea(5.0);
		System.out.println("三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は" + TriangleArea +"㎠");
		System.out.println("円の半径が5.0cmの場合、面積は" + CircleArea + "㎠");
		
	}
}