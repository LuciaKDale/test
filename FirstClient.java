
import objectdraw.*;
import java.awt.*;

public class FirstClient extends WindowController{

  public static void main(String[] args) {
    new FirstClient().startController(525,1000);
  }

  public void onMouseClick(Location point){
    new FilledRect(400,500, 90,25, canvas);
  }

  public void onMousePress(Location point){
    new Text("I'm touched", 40, 50, canvas);
  }

  public void onMouseRelease(Location point){
    canvas.clear();
  }


}
