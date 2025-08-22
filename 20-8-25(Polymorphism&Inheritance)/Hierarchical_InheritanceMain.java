class Hierarchical_InheritanceMain
{
	public static void main(String...x)
	{
		//both class inheriting feature(name,color,engintype) of Car class.
		
		Lambo lb = new Lambo();
		
		lb.setname("Lamborghini");
		lb.setcolor("Aqua");
		lb.setengintype("Electric");
		lb.setmodel("Lamborgini Urus"); //this is unique feature of Lambo Class
		
		Maruti mt = new Maruti();
		
		mt.setname("Maruti 800");
		mt.setcolor("Red");
		mt.setengintype("Petrol");
		mt.setprice(150000);  //this is unique feature of Maruti Class
		
		//Displaying Data 
		System.out.println(String.format("Car name : %s \nColor : %s \nEngin Type : %s \nModel : %s",lb.getname(),lb.getcolor(),lb.getengintype(),lb.getmodel()));
		
		System.out.println();
		
		System.out.println(String.format("Car name : %s \nColor : %s \nEngin Type : %s \nPrice : %s",mt.getname(),mt.getcolor(),mt.getengintype(),mt.getprice()));
	}
}