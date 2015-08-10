import  org.junit.*;
import  static org.junit.Assert.*;

public class PingPongTest {

  // @Test
  // public void isPingPong_Divisibleby3_True(){
  //   PingPong testPingPong = new PingPong();
  //   String[] myOutputArray = {"1", "2", "ping"};
  //   assertEquals(myOutputArray, isPingPongArray(3));
  // }

  @Test
  public void pingPongValue_divisibleByThree_ping() {
    PingPong testPingPong = new PingPong();
    assertEquals(testPingPong.pingPongValue(3), "ping");
  }


  @Test
  public void pingPongValue_divisibleByThree_five() {
    PingPong testPingPong = new PingPong();
    assertEquals(testPingPong.pingPongValue(5), "pong");
  }

  @Test
  public void pingPongValue_18divisibleByThree_ping(){
    PingPong testPingPong = new PingPong();
    assertEquals(testPingPong.pingPongValue(18), "ping");
}
  @Test
  public void pingPongValue_4divisibleByThree_number(){
    PingPong testPingPong = new PingPong();
    assertEquals(testPingPong.pingPongValue(4), "4");
  }

  @Test
  public void pingPongValue_15divisibleByThreeAndFive(){
    PingPong testPingPong = new PingPong();
    assertEquals(testPingPong.pingPongValue(15), "ping-pong");
  }
}
