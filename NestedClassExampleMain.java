public class NestedClassExampleMain {
    
    // We can create an inner class locally in a method. In this case here,
    // we have a method which contains both the declaration and the implementation
    // of the inner class. So we can instantiate it, and access every method we need,
    // but ONLY in the scope of this method.
    public static void createLocalInnerClass() {
        
        class LocalInnerClass {
            public void printLocalInnerClass() {
                System.out.println("A new local inner class!");
                System.out.println("Hiiii");
               System.out.println("Everyone");
		               System.out.println("Modifications");
            }
        }
        
        
        
        // Instantiation and use inside the method.
        LocalInnerClass local = new LocalInnerClass();
        local.printLocalInnerClass();
        System.out.println("Hiiii");
    }

    
}
class LocalInnerClass1 {
   
}