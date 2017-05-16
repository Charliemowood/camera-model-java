import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.assertNotNull;

public class PhotographerTest{
  Photographer photographer;
  AnalogCamera analogCamera;
  DigitalCamera digitalCamera;

  @Before
  public void before() {
    photographer = new Photographer("Steve");
  }

  @Test
  public void hasName(){
    assertEquals("Steve", photographer.getName());
  }

  @Test
  public void hasEmptyArrayOfCameras() {
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canAddCamera() {
    photographer.add(analogCamera);
    assertEquals(1, photographer.cameraCount());
  }
}
