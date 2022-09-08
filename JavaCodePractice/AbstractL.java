

 
    abstract class B {
      //declaring inner class as abstract with abstract method
        abstract class C {
            abstract void myAbstractMethod();
        }
    }
    class D extends B {
        class E extends C {
          // implementing the abstract method
            void myAbstractMethod() { System.out.println("Inside abstract method implementation"); }
        }
    }
     
    public class AbstractL {
     
        public static void main(String args[])
        {
            // Instantiating the outer class
            D outer = new D();
     
            // Instantiating the inner class
            D.E inner = outer.new E();
            inner.myAbstractMethod();
        }
    }
    

