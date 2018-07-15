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
            }
        }
        
        
        
        // Instantiation and use inside the method.
        LocalInnerClass local = new LocalInnerClass();
        local.printLocalInnerClass();
        System.out.println("Hiiii");
    }

    public static void main(String[] args) {
        
        // We instantiate the outer class, in order to be able to instantiate/access
        // the inner class.
        OuterClass outer = new OuterClass("Outer Class");
        outer.outerClassPrint();
        
        // 1st way of accessing the inner class: we instantiate it inside the outer class,
        // and we access it by using a method of the outer class.
        outer.createAndAccessInnerClass();
        
        // 2nd way of accessing the inner class: We instantiate it OUTSIDE of the main
        // class, and we access its methods o
        urselves. Since it is an inner class however,
        // we need to make it clear that it is considered a member of the outer class,
        // and this is why we use OuterClass.InnerClass in the declaration.
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printOuterClassName();

        // We create the local class here.
        createLocalInnerClass();
        
        // Instead of using the interface by implementing it in another class,
        //we create an anonymous inner class here and use it without a problem.
        AnonymousClassInterface anonymous = new AnonymousClassInterface() {

            @Override
            public void printAnonymousClass() {
                System.out.println("A new anonymous inner class!");
            }
        };
        
        anonymous.printAnonymousClass();
        
        
        // Static Inner Class example: We instantiate only the inner class,
        // and from there we use it as any other top-level class.
        OuterWithStaticInner.InnerClass staticInner = new OuterWithStaticInner.InnerClass();
        staticInner.printStaticInnerClass();
    }
}
class LocalInnerClass1 {
    public void printLocalInnerClass1() {
        System.out.println("A new local inner class1!");
        System.out.println("Hiiii");
    }
    public void printLocalInnerClass2() {
        System.out.println("A new local inner class1!");
        System.out.println("Hiiii");
    }
}