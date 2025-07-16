package src.OOPS_Concept.Inheritance.SingleInheritance;

public class lab10 {

    public static void main(String[] args) {


        // It means you can get some features from your parents

        // It provides a way to create a new class from an existing class.

        // SuperClas || ParentClass || BaseClass -> All are the same
        // SubClass || ChildClass || DerivedClass -> All are same

        // We Used Extend Keyword to get the details


        // Syntax:
        // SubClass extends ParentClass{
        // Content of SUbClass
        // }


        Programming p = new Programming(); // ParentClass or SuperClass or BaseClass

        // Programming -> class
        // p -> ref variable to the object
        // new Programming() -> Object
        // DC is Called
        p.printInfo();


        Programming p2 = new Programming("Perl", 12);

        // Programming -> class
        // p2 -> ref variable to the object
        // new Programming() -> Object
        // PC is Called
        p2.printInfo();









    }



}
