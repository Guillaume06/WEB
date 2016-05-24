import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by guillaume on 13/05/16.
 */
public class Parser {
    private String xml;

    public Parser (String path) throws JSONException {
        JSONObject json = new JSONObject(readFile(path));
        xml = XML.toString(json);

    }
    private String readFile(String filename)
    {
        String records = "";
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null)
            {
                records+=line+"\n";
            }
            reader.close();
            System.out.println(records);
            return records;
        }
        catch (Exception e)
        {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
            return null;
        }
    }

    public String getXml() {
        return xml;
    }
}
