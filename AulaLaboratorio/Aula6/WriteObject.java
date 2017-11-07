import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class WriteObject{
	public void serializeAddress(User usuarios) {
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;

		try {
			fout = new FileOutputStream("usersObj.dat", true);
			oos = new ObjectOutputStream(fout);
			oos.writeObject(usuarios);
			System.out.println("Usuario salvo");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
    		try{
    			fout.close();
	    		oos.close();
    		} catch(IOException e){
    		    e.printStackTrace();
    		}
    		    
		}
	}
}