class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class Exercise163
{
	public static void main(String[] args)
	{
		Address uno, dos, tres, cuatro, cinco;
		
		uno = new Address();
		uno.street = "191 Marigold Lane";
		uno.city = "Miami";
		uno.state = "FL";
		uno.zip = 33179;
		
		dos = new Address();
		dos.street = "3029 Losh Lane";
		dos.city = "Crafton";
		dos.state = "PA";
		dos.zip = 15205;
		
		tres = new Address();
		tres.street = "2693 Hannah Street";
		tres.city = "Hickory";
		tres.state = "NC";
		tres.zip = 28601;
		
		cuatro = new Address();
		cuatro.street = "6436 Beckman Glen Ct.";
		cuatro.city = "Las Vegas";
		cuatro.state = "NV";
		cuatro.zip = 89141;
		
		cinco = new Address();
		cinco.street = "400 E Stewart Avenue";
		cinco.city = "Las Vegas";
		cinco.state = "NV";
		cinco.zip = 89101;
		
		System.out.println(uno.street + "\n" + uno.city + ", " + uno.state + " " + uno.zip + "\n");
		System.out.println(dos.street + "\n" + dos.city + ", " + dos.state + " " + dos.zip + "\n");
		System.out.println(tres.street + "\n" + tres.city + ", " + tres.state + " " + tres.zip + "\n");
		System.out.println(cuatro.street + "\n" + cuatro.city + ", " + cuatro.state + " " + cuatro.zip + "\n");
		System.out.println(cinco.street + "\n" + cinco.city + ", " + cinco.state + " " + cinco.zip + "\n");
	}
}