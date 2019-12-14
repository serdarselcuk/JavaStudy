public class CredentialsForvYtrack {
    private static String result ="";
    private static String[] users = {"user45" , "user46" , "user47", "storemanager81" , "storemanager82" , "storemanager246", "salesmanager146" , "salesmanager147" , "salesmanager148"}; // user names array
    private static String pasWord = "UserUser123";


    public static String getResult() {
        return result;
    }

    public static String getUsers(int i) {// overloaded getUsers to reach the elements
        return users[i];

    }

    public static String[] getUsers() {
        return users;

    }


    public static String getPasWord() {
        return pasWord;
    }

    public static void setResult(String result) {
        CredentialsForvYtrack.result = result;
    }

    public static void setUsers(String[] users) {
        CredentialsForvYtrack.users = users;
    }

    public static void setPasWord(String pasWord) {
        CredentialsForvYtrack.pasWord = pasWord;
    }
}

}
