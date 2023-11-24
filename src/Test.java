public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("Buddy", "retriever");
        d1.eat();
        d1.bark(); //wowff wowff (lowercase, because the age = 1)

        d1.age = 7;
        d1.bark(); //WOWFF WOWFF (uppercase, because the age >= 5)

        Dog d2 = new Dog("Fluffy", "chihuahua", 3);
        d2.bark(); //yaff yaff (because it is chihuahua and age < 5)

        Sphere s1 = new Sphere(); // calling default constructor (so radius should be equal to 1)
        System.out.println("surface area is "+ s1.getSurfaceArea());
        System.out.println("volume is " + s1.getVolume());

        Sphere s2 = new Sphere(2);
        System.out.println("surface area is "+ s2.getSurfaceArea());
        System.out.println("volume is " + s2.getVolume());

        Triangle t1 = new Triangle(); //we don't provide any parameter here, so all sides = 1
        System.out.println("first triangle type is: " + t1.getTriangleType());

        Triangle t2 = new Triangle(3); //so all sides = 3
        t2.side3 = 4; //but then we changed side3 = 4 (so sides are 3, 3, 4)
        System.out.println("second triangle type is: " + t2.getTriangleType());

        Triangle t3 = new Triangle(3, 4, 5);
        System.out.println("third triangle type is: " + t3.getTriangleType());

        Time tt1 = new Time(15, 30, 30);
        tt1.showTime(true);
        tt1.showTime(false);
        System.out.println("day part is: " + tt1.getDayPart());

        Time tt2 = new Time(11);
        tt2.showTime(true);
        tt2.showTime(false);
        System.out.println("day part is: " + tt2.getDayPart());

        Time tt3 = new Time(22, 15, 15);
        tt3.showTime(true);
        tt3.showTime(false);
        System.out.println("day part is: " + tt3.getDayPart());



        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    }
}
