import java.io.*;

public class Main {
    public static void main(String[] args)  {
   //Serilization: The process of converting object into a byte stream. This byte stream can be saved as a file
   // or sent over a network, can be sent a different machine and send as a file (.ser) (platform indepent)
        User user = new User();
        user.setName("Selen");
        user.setPassword("11***99..");
        user.name_Customer("Selen_Dilek123");
        FileOutputStream fileOutputStream= null;
        ObjectOutputStream outputStream = null;
        try {
            fileOutputStream=new FileOutputStream("UserInfo.ser");
            outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(user);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long serialVersionID= ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID(); //if it is matched or not.
        System.out.println("serialVersionID = " + serialVersionID);

        System.out.println("Object info saved");

   //Deserilization: The reverse process of serilization. Converting byte stream into an object.






    }
}