// A full charged battery of 5 KW capacity is connected to a fan of 2 KWH with 1500 RPM (revolution per minute). Calculate what is the charging present after making 1,35,000 revolutions? 
//Now the battery is charged with an additional 0.5KW, Now calculate how many hours can the fan run ?
//Output:  2KW and 1.25 hours



public class JLQ4Fan {
	public static void main(String[] args) {
		double capacity = 5;
		double fan = 2;
		double rpm = 1500;
		double trpm = 135000;
		double remainrpm = trpm / rpm;
		// System.out.println(remainrpm);
		double usage = remainrpm * 0.033;
		double chargingleft=capacity - usage;
		System.out.println(chargingleft+"KW left");
		double aditional=0.5;
		double totalcapacity=chargingleft+aditional;
		// System.out.println(totalcapacity);
		double fanruns=totalcapacity/fan;
		System.out.println("the fan can run :"+fanruns+"hours");

	}

}
