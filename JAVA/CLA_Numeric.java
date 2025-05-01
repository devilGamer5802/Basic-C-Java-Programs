class CLA_Numeric {
  public static void main(String[] args) {

    for(String str: args) {
// converting string type to integer type
    int argument = Integer.parseInt(str);
    System.out.println("Argument in integer form: " + argument);
    }

  }
}
// java CLA_Numeric 1 2 3 4