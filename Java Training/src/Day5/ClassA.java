public class ClassA {
    public void publicFunctionParent(){
        System.out.println("======Class A public Functiion=========");
        privateFunctionParent();
    }
    private void privateFunctionParent(){
        System.out.println("=========Class A private Functiion=========");
    }
    void defaultFunction(){
        System.out.println("===");
    }


}
