
public class Demo {

	public static void main(String[] args) {
		
		CompassArrows north = CompassArrows.N;
//		System.out.println(north);
//		CompassArrows east = north.next();
//		System.out.println(east);
//		CompassArrows south = east.next();
//		System.out.println(south);
//		CompassArrows west = south.next();
//		System.out.println(west);
//		
//		north = west.next();
//		System.out.println(north);
//		
		System.out.println(north.prev().prev().prev().prev().prev());
//		System.out.println(north.next());
		
	}

}
