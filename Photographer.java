import java.util.*;

public class Photographer {

  private String name;
  private ArrayList<AnalogCamera> cameraList;

  public Photographer(String name){
    this.name = name;
    this.cameraList = new ArrayList<AnalogCamera>();
  }

  public String getName() {
    return this.name;
  }

  public int cameraCount() {
    return this.cameraList.size();
  }

  public void add(AnalogCamera analogCamera) {
    this.cameraList.add(analogCamera);
  }

}
