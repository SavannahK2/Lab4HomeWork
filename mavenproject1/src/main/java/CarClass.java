/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0786954
 */
public class CarClass 
{
    class Car{
    int year;
    String make;
    int speed;
    public Car(int y,String m,double s)
    {
        this.year = y;
        this.make = m;
        this.speed = 0;
    }
    
    public double getSpeed()
    {
        return this.speed;
    }
    
    public String getMake()
    {
        return this.make;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    public void setMake(String make) 
    {
        this.make = make;
    }

    public void setSpeed(int speed) 
    {
        this.speed = speed;
    }
    
    public int getYear()
    {
        return this.year;
    }

    public int accelerate()
    {
        this.speed+=5;
        return speed;
    }
    }
}
