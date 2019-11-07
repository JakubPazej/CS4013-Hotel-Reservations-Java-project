public class user{
    String user;
    public user(String user){
        if(user.toUpperCase() == "SUPERVISOR"){this.user="SUPERVISOR";
        }else if(user.toUpperCase() == "DESK"){this.user="DESK";
        }else if(user.toUpperCase() == "CUSTOMER"){this.user="USER";
        }
    }
}