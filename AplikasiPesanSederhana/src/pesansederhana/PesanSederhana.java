package pesansederhana;


public class PesanSederhana {

    private Login login;
    private String greeting;
    
    PesanSederhana(String greeting){
        this.greeting = greeting;
    }
    
    public static void main(String[] args) {
        PesanSederhana simple = new PesanSederhana("Sudah menyetujui ketentuan aplikasi?");
        simple.startApp();
    }
    
    public void startApp(){
        this.login = new Login(this.greeting);
        this.login.setVisible(true);
    }
}
