package src.OOPS_Concept.Encapsulation;

public class lab15 {

    public static void main(String[] args) {

        vwoLoginFixed lf = new vwoLoginFixed("admin", "admin");


        boolean check = lf.isLoggedIn("admin", "password");
        String  u = lf.getUsername();
        System.out.println(u);
        System.out.println(check);

    }


}

    class vwoLoginFixed{

        public String getUsername() {
            return userName;
        }

        public void setUsername(String username) {
            this.userName = username;
        }

        private  String userName;


        private  String  Password;



        vwoLoginFixed (String u, String p) {
            this.userName = u;
            this.Password = p;

        }


//        private void Maruf(){  // Within the class I can Use private but not outside the class
//            System.out.println("I am Private ");
//        }



        boolean isLoggedIn (String username, String password){
            if (this.userName.toLowerCase().equals(username) && this.Password.toLowerCase().equals(password)){
                System.out.println("Logged In");
                return true;
            }else{
                System.out.println("Wrong !!");
                return false;
            }

        }




}
