/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
	
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
	  Picture swan = new Picture("src/images/swan.jpg");
	    swan.edgeDetection2(10);
	    swan.explore();
  }
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.grayscale();
	  beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water  = new Picture("src/images/water.jpg");
	  water.fixUnderwater();
	  water.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture motorcycle = new Picture("src/images/redMotorcycle.jpg");
	  motorcycle.mirrorVerticalRightToLeft();
	  motorcycle.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture motorcycle = new Picture("src/images/redMotorcycle.jpg");
	  motorcycle.mirrorHorizontal();
	  motorcycle.explore();
  }
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture motorcycle = new Picture("src/images/redMotorcycle.jpg");
	  motorcycle.mirrorHorizontalBotToTop();
	  motorcycle.explore();
  }
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("src/images/snowman.jpg");
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture ("src/images/seagull.jpg");
	  seagull.mirrorGull();
	  seagull.explore();
  }
  
  public static void testCopy()
  {
	  Picture flower = new Picture("src/images/flower1.jpg");
	  Picture empty = new Picture("src/images/640x480.jpg");
	  empty.copy(flower,18,84);
	  empty.explore();
	 
  }
  
  public static void testCopy2()
  {
	  Picture flower = new Picture("src/images/flower1.jpg");
	  Picture empty = new Picture("src/images/640x480.jpg");
	  empty.copy(flower, 18,2 ,84, 65);
	  empty.explore();
	  
  }
  
  public static void testMyCollage()
  {
	  
	  Picture empty = new Picture("src/images/640x480.jpg");
	  empty.myCollage();
	  empty.explore();
	  
  }
  
  public static void testAppleEncodeAndDecode()
  {
	  Picture apple = new Picture("src/images/apple.jpg");
	  apple = apple.scale(0.5, 0.5);
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.encode(apple);
	  beach.explore();
	  beach.decode().explore();
  }
  
  /*public static void testEncode()
  {
	  Picture apple = new Picture("src/images/apple.jpg");
	  apple = apple.scale(0.5, 0.5);
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.encode(apple);
	  beach.explore();
  }
  */
  
  public static void testMessageEncodeAndDecode()
  {
	  Picture message = new Picture("src/images/msg.jpg");
	  Picture beach = new Picture("src/images/beach.jpg");
	  
	  beach.encode(message);
	  beach.explore();
	  beach.decode().explore();
  }
  
  
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	// testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
	//testMirrorVerticalRightToLeft();
	//  testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
	// testMirrorHorizontal();
    //testCollage();
    //testCopy();
	//testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	  //testMirrorArms();
	  //testMirrorGull();
	  //testCopy2();
	 // testMyCollage();
	  //testEncode();
	  testAppleEncodeAndDecode();
	  //testMessageEncodeAndDecode();
	  
	 
	  /*Picture apple = new Picture("src/images/apple.jpg");
	  apple = apple.scale(0.5, 0.5);
	  apple.explore();*/
	  
	  
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  
	  
	
  }
}