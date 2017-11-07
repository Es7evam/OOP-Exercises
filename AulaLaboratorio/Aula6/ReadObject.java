import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class ReadObject{
    ObjectInputStream in = null;
    Boolean sucesso = false;
    public Boolean readObj(User usuario){
        try{
            while(sucesso == false){
                in = new ObjectInputStream(new FileInputStream("usersObj.dat"));
                User user = (User) in.readObject();    
                
                if(user.getLogin() == usuario.getLogin()){
                    if(user.getPass() == usuario.getPass()){
                        sucesso = true;
                    }
                }
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                in.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return sucesso;
    }
}

