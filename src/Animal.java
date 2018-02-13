interface Animal {

    public void showImage();

    default void hello(){
      System.out.print("hello");
    }

}

interface Animal1 {

    public void showImage();


}
 class ImageProxy implements Animal,Animal1 {

    /**
     * Private Proxy data
     */
    private String imageFilePath;

    /**
     * Reference to RealSubject
     */
  //  private Image proxifiedImage;




    @Override
    public void showImage() {


    }

     public static void main(String[] args) {
         ImageProxy p1=new ImageProxy();
         p1.hello();
     }
 }