class Problem1 extends ConsoleProgram {

  /**
  * A program that takes in the user's information and outputs a username and password
  * @author: Caelen Y
  */
  
  public void run() {

    // Set up the variables
    String userFirst;
    String userLast;
    String userNumber;
    String userPassword;

    // Retrieve the inputs
    System.out.println("***** Student Account Registration *****");
    userFirst = readLine("Enter your first name: ");
    userLast = readLine("Enter your last name: ");
    userNumber = readLine("Enter your student number: ");
    userPassword = readLine("Enter a new password: ");


    // Create the username
    String username = createUserName(userFirst, userLast, userNumber);

    // Validate the password
    boolean validate = validatePassword(userPassword);

    // Output results
    System.out.println("Your username is: " + username);
    System.out.println("Valid Password: " + validate);
     
  }

  /**
    * Creates a username, in a certain format, with the information given
    *
    * @param strFirst  The first name
    * @param strLast  The second name
    * @param strNumber  The student number
    * @return The full username
    *
    */
  public String createUserName(String strFirst, String strLast, String strNumber){
    
    // Makes the first name uppercase, and only uses first letter
    strFirst = strFirst.toUpperCase();
    strFirst = strFirst.substring(0,1);

    // Makes the last name lowercase, and only uses the first four
    strLast = strLast.toLowerCase();
    strLast = strLast.substring(0,4);

    // Uses only the last 3 digits of the student number
    strNumber = strNumber.substring(6,9);

    // Check to see if the inputs are valid
    String blank = "";

    // Throw exceptions
    if(strFirst.equals(blank)){
      throw new IllegalArgumentException("Incorrect Parameter");
    }
    if(strLast.equals(blank)){
      throw new IllegalArgumentException("Incorrect Parameter");
    }
    if(strNumber.equals(blank)){
      throw new IllegalArgumentException("Incorrect Parameter");
    }

    return strFirst + strLast + strNumber;

  }

  /**
    * Validates the password given by the user
    *
    * @param strPassword  The password
    * @return The validation, either true or false
    *
    */
  public boolean validatePassword(String strPassword){

    // Get the length of the password
    int intLength = strPassword.length();

    // Check if the password is valid
    if (intLength >= 7){
      
      return true;
    }

    else {
      
      return false;
    
    }

  }




}