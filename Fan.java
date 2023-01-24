
public class Fan {
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
