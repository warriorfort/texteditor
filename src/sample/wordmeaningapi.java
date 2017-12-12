package sample;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 * Created by Ram on 19-07-2017.
 */
import javax.net.ssl.HttpsURLConnection;
import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class wordmeaningapi {
    public static ArrayList api(String u) throws Exception {


        String c = doInBackground(u);
        //System.out.println(c);
        JSONObject object = new JSONObject(c);
        JSONArray array = object.getJSONArray("results");

        ArrayList <String> al = new ArrayList<>();
        for (int i = 0; i < array.length(); i++) {
            JSONArray array1 = array.getJSONObject(i).getJSONArray("lexicalEntries");
            for (int j = 0; j < array1.length(); j++) {

                JSONArray array2 = array1.getJSONObject(j).getJSONArray("entries");

                for (int k = 0; k < array2.length(); k++)

                {
                    JSONArray array3 = array2.getJSONObject(k).getJSONArray("senses");
                    for (int l = 0; l < array3.length(); l++) {


                        JSONArray array4 = array3.getJSONObject(l).getJSONArray("definitions");
                        for (int m = 0; m < array4.length(); m++) {
                            al.add(array4.getString(m));
                           // System.out.println(array4.getString(m));
                        }
                    }

                }
            }


        }


        return  al;
    }
    protected static String doInBackground(String s) {

        //TODO: replace with your own app id and app key
        final String app_id = "b99719be";
        final String app_key = "f57bd43c43b668910755cc5128ba1dc6";
        try {
            URL url = new URL("https://od-api.oxforddictionaries.com:443/api/v1/entries/" + "en" + "/" + s);
            HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestProperty("Accept", "application/json");
            urlConnection.setRequestProperty("app_id", app_id);
            urlConnection.setRequestProperty("app_key", app_key);

            // read the output from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();

            String line = null;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line + "\n");
            }

            return stringBuilder.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }
    }
}