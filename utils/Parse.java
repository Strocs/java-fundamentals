package utils;

public class Parse {
  public static int[] args(String[] args) {
    int[] result = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      result[i] = Integer.parseInt(args[i]);
    }
    return result;
  }
}
