package oop.composition.composition_room_1;

public class Main {

    public static void main(String[] args) {

        //Composition is creating a master object out of smaller objects or classes

        //instantiating the necessary parts or classes to build something together
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor theMonitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "2.44");


        //using several classes to build something bigger
        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        //accessing the fields use getter to access class then have access to that classes methods
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Bill will be a java developer");

        thePC.powerUp();



        // this is the 1 room house challenge

        TV theTV = new TV("Samsung", 4, 44);
        Sink theSink = new Sink(true, false, false);
        Stove theStove = new Stove(4, 300, false);

        HouseOneRoom kristaTinyHouse = new HouseOneRoom(theTV, theSink, theStove);

        kristaTinyHouse.turnOnStove();
        kristaTinyHouse.getTheTV().powerOn();
    }
}
