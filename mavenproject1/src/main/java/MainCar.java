/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0786954
 */
public class MainCar 
{
    public static void main(String[] args) 
    {

	CarClass c = new CarClass(2014, "Ford", 0);
                
	System.out.println("Car year: "+c.getYear());

	System.out.println("Car make: "+c.getMake());

	System.out.println("Car speed: "+c.getSpeed());

	c.accelerate();
            System.out.println (c.getSpeed ());
	c.accelerate();
            System.out.println (c.getSpeed ());
        c.accelerate();
            System.out.println (c.getSpeed ());
        c.accelerate();
            System.out.println (c.getSpeed ());
        c.accelerate();
            System.out.println (c.getSpeed ());

	System.out.println("Car year: "+c.getYear());

	System.out.println("Car make: "+c.getMake());

	System.out.println("Car speed: "+c.getSpeed());
    }
}

