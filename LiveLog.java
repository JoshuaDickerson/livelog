
public class LiveLog{
  public LiveLog(String data){
    String urlParameters = "data="+data;
    String request = "http://localhost/LiveLogCatch.php";
    URL url = new URL(request); 
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();           
    connection.setDoOutput(true);
    connection.setDoInput(true);
    connection.setInstanceFollowRedirects(false); 
    connection.setRequestMethod("POST"); 
    connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); 
    connection.setRequestProperty("charset", "utf-8");
    connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
    connection.setUseCaches (false);

    DataOutputStream wr = new DataOutputStream(connection.getOutputStream ());
    wr.writeBytes(urlParameters);
    wr.flush();
    wr.close();
    connection.disconnect();
  }
}