import java.security.*;
import java.math.*;
import java.io.Serializable;

class User implements Serializable{
    private String nomeCompleto;
    private String login;
    private String senha;
    
    public void setName(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    public String getName(){
        return this.nomeCompleto;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return this.login;
    }
    
    public String getCrypto(String senha) throws Exception{
        MessageDigest m=MessageDigest.getInstance("MD5");
        m.update(senha.getBytes(),0,senha.length());
        String ret = new BigInteger(1,m.digest()).toString(16);
        return ret;
    }
    public void setPass(String senha){
        try{
            String password = getCrypto(senha);
            this.senha = password;
        }catch(Exception e){
            System.out.println("Erro ao gerar MD5");
        }
    }
    public String getPass(){
        return this.senha;
    }
    
    public Boolean checkPass(String senha){       
        try{
            String password = getCrypto(senha);
            if(this.senha == password)
                return true;
            else
                return false;
        }catch(Exception e){
            System.out.println("Erro ao gerar MD5");
            return false;
        }
    }
}