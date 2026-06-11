public class Tester_Generic {
    public static void main(String[] args) {
        MyClass<String> objStr = new MyClass<String>();
        objStr.swap("abc", "xyz");

        MyDate d1 = new MyDate(1,1,2001);
        MyDate d2 = new MyDate(2,2,2002);

        MyClass<MyDate> objDate = new MyClass <MyDate>();
        objDate.swap(d1, d2);

        // generic work with object type only?
        // object is bydefault super class 
        // every class in java implicitly extends object
        // object = new object MyDate();
        // object obj2 = new Manager();

        // tef types: class , interface , enum, arrays

        // how to use premitive types with generics
        // Ans--> use wrapper classes 

    }

}
