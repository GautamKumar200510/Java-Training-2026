public class Client_1 {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        objA.publicFunctionParent();
        // objA.protectedFunctionParent(); // not available from this context
        // protected access is only available to subclasses or within the same package
        // default access is package-private and not accessible from other packages
    }

}
