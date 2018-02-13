public  class NestedStaticExample {

    public void name(){
        System.out.println("NestedStaticExample class in java");
    }


    //static nested class in java
    static class StaticNested{
        int a=10;
        public static void name1(){
            System.out.println("StaticNested example in java");
        }
    }
}
 class Child extends NestedStaticExample{
     public void name(){
         System.out.println("Child class in java");
     }
     public void name1(){
         System.out.println("NestedStaticExample example in java");
     }
     public static void main(String[] args) {
         NestedStaticExample obj=new NestedStaticExample();
         Child obj1=new Child();
         StaticNested obj3=new StaticNested();
         obj.name();
         obj1.name();
         obj3.name1();
     }
}
