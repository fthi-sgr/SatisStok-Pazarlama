package Core_Katmani;

public class CoreFields {

private String userName ="postgres";
private String password ="123456";
private String url = "jdbc:postgresql://localhost:5432";    //porjemizin database linkini buraya yapıştırmamız gerekiyor..

    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }
    
    public String getUrl() {
        return url;
    }

   


}