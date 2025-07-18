package src.OOPS_Concept.Encapsulation;

public class BadExample {
    public static void main(String[] args) {

        vwoLogin vwo = new vwoLogin("admin", "admin");


        boolean check = vwo.isLoggedIn("admin", "password");
        vwo.setUsername("admin");
        System.out.println(vwo.getPassword());

//        vwo.password = "password";  // possible if access modifier of  variable is public

        boolean check2 = vwo.isLoggedIn("admin", "password");
        System.out.println(check2);

    }
}


    class vwoLogin {

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        private String username ;

        public String getPassword() {
            return password;
        }

        private String password ;


        public vwoLogin(String username , String  password){
            this.username = username;
            this.password = password;
        }


        boolean isLoggedIn(String username , String  password){
            if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)){

                System.out.println("Logged In!!");
                return true;
            }
            else {
                System.out.println("Wrong !!");
                return false;
            }

        }


    }

