import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

 PaintAll pixel = new PaintAll();

//sets up grid for design
pixel.paintBackground("pink",16);
pixel.resetPosition();

//Paints the design    
pixel.paintDolphin();
    
//Makes painter move off main design
pixel.getOffDesign();
  }
}
