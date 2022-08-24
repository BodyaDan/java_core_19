package hometask;

import java.io.*;

public class Methods {
    public static void serialize(File file, Serializable obj) throws Exception{
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(obj);
        oos.close();
        os.close();
    }

    public static Serializable deserialize(File file) throws Exception {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Serializable obj = (Serializable) ois.readObject();
        ois.close();
        is.close();

        return obj;
    }
}
