import java.io.Console;

public class PingPong {
  public static void main(String[] args){
    // Console myConsole = System.console();

  // System.out.println("What number do you want to ping-pong?");
  //
  //  int index;
  //
  // //Integer pingPongNumber = 10;
  // Integer testNumber = 7;
  // String[] pingPongArray = new String[testNumber];
  //   // String[] pingPongNumber = myConsole.readLine();
  //   for (Integer index=1; index<= pingPongArray.length; index++){
  //     pingPongArray[index] = pingPongValue(index)
  //   }

  //  String[] pingPongArray = new Array[16];

  //  for (Integer index = 0; index < pingPongArray.length; index++ ) {
  //    pingPongArray[index] = pingPongValue(index + 1);
  //  }
  }

  public static String pingPongValue(Integer number) {

      if ((number % 3 == 0) && (number % 5 == 0))  {
       return "ping-pong";
      }
      else if (number % 3 == 0) {
        return "ping";
      }
      else if (number % 5 == 0){
        return "pong";
      }
       else
      {
        return number.toString();
      }


      // if ((index % 3 == 0) && (index % 5 == 0))
      // {
      //   System.out.println("ping-pong");
      // }
      // // else if ( index % 3 == 0 )
      // // {
      // //   System.out.println("ping");
      // // }
      // // else if ( index % 5 == 0 )
      // // {
      // //   System.out.println("pong");
      // //
      // // }
      // // else
      // // {
      // //   System.out.println(index);
      // // }
  }
}
