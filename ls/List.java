package ls;

import java.io.File;

class List {
  public static void main(String[] args) {
    var directory = args.length > 0 ? args[0] : System.getProperty("user.dir");

    for (var path : new File(directory).list()) {
      System.out.println(path);
    }
  }
}