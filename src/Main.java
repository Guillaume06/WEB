import org.json.JSONException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by guillaume on 13/05/16.
 */
public class Main {
    public static void main(String[] args) throws JSONException, FileNotFoundException, UnsupportedEncodingException {
        Parser p = new Parser("./data/data.json");
        System.out.println(System.getProperties().get("user.dir"));

        PrintWriter writer = new PrintWriter("out.xml", "UTF-8");
        writer.println("<?xml version = \"1.0\" encoding=\"UTF-8\" standalone=\"yes\" ?>");
        writer.println("<?xml-stylesheet href=\"style.css\" type=\"text/css\" ?>\n");
        writer.println("<global>");
        writer.println(p.getXml());
        writer.println("</global>");
        writer.close();

    }
}
