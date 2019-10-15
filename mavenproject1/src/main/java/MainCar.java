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

		CarClass c = new CarClass();
                c.Car(2010,"200");
                        
		System.out.println("Car year: "+c.getYear());

		System.out.println("Car make: "+c.getMake());

		System.out.println("Car speed: "+c.getSpeed());

		c.accelerate();

		c.accelerate();

		System.out.println("Car year: "+c.getYear());

		System.out.println("Car make: "+c.getMake());

		System.out.println("Car speed: "+c.getSpeed());
    }
}


//ignore example here vvvv
int yearModel;

        String make;

        

        BuildCar carBuild = new BuildCar();

            carBuild.CarBuild(2014, "200");

            

        for(int i = 0; i < 5; i++) {

            carBuild.accelerate();

            System.out.println(carBuild.getSpeed());

        }

        

        for(int i = 0; i < 5; i++) {

            carBuild.brake();

            System.out.println(carBuild.getSpeed());

        }

        

    }