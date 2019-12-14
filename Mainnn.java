package Mainnn;
public class Mainnn {
    public static void main(String[] args) {
        Taxi x = new Taxi("UWE123");
        x.run("CT");
        x.printCurrentLocation();
        //x:__,y:__
        x.book(10,10);
        x.run("I am leaving on a jetplane");
        System.out.println(x.reachedDestination());
        //false     
  }
}
