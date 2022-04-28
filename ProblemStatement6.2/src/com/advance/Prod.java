package com.advance;

public class Prod {
	public static void main(String[] args)
	{
		String s;
		Products p = new Products();
        System.out.println("List of the Product:");
		p.AddProduct(1001, "Maruti 800");
		p.AddProduct(2002, "Maruti Zen");
		p.AddProduct(3003, "Maruti Dezire");
		p.AddProduct(4004, "Maruti Alto");

		p.PrintProducts();	// Prints list in order of ID

		System.out.println("After deletion of the product the new List :");
		p.DeleteProduct(3);
		System.out.println("Object has been deserialized ");
		System.out.println("List of the Product:");
		p.PrintProducts();	
		

}


}
