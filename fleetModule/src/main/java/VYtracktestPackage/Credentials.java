package VYtracktestPackage;

public class Credentials {

        private static String result ="";
        private static String[] users = {"user45" , "user46" , "user47", "storemanager81" , "storemanager82" , "storemanager246", "salesmanager146" , "salesmanager147" , "salesmanager148"}; // user names array
        private static String pasWord = "UserUser123";

//getters :
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
//setters :
        public static void setResult(String result) {
            Credentials.result = result;
        }

        public static void setUsers(String[] users) {
            Credentials.users = users;
        }

        public static void setPasWord(String pasWord) {
            Credentials.pasWord = pasWord;
        }
    }
