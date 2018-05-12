package hotelManagement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Room.Room;

public class DatabaseManager {
	String urlString = "http://localhost/HotelManagment/";
	String postData;
	URL url;
	String jsonOutput="";
	
		public DatabaseManager(String urlString) {
				this.urlString += urlString;
		}
		
		public DatabaseManager() {
			postData = "";
			// TODO Auto-generated constructor stub
		}
		public void setID(String key, String id) throws IOException{
			 postData = URLEncoder.encode(key, "UTF-8") + "=" + URLEncoder.encode(id, "UTF-8");
			  url = new URL(urlString);
			  sendRequest();
		}
		public void sendRequest() throws IOException{
			jsonOutput = "";
			 HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		     httpURLConnection.setRequestMethod("POST");
		     httpURLConnection.setDoOutput(true);
		     httpURLConnection.setDoInput(true);
		     OutputStream outputStream = httpURLConnection.getOutputStream();
		     BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
		     bufferedWriter.write(postData);
		     bufferedWriter.flush();
		     bufferedWriter.close();
		     outputStream.close();
		     InputStream inputStream = httpURLConnection.getInputStream();
		     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
		     String line = "";
		     while ((line = bufferedReader.readLine()) != null) {
		    	 jsonOutput += line;
		     }     
		     bufferedReader.close();
		     inputStream.close();
		     httpURLConnection.disconnect();
		   	}
    	
		public String getJsonOutput() {
		return jsonOutput;
    	}
		
		public boolean checkin(String MemberName, String ConfirmationNo, String MemberType, String roomNumber) throws IOException{
			urlString ="http://35.173.198.1/HotelManagment/checkin.php";
			 postData = URLEncoder.encode("MemberName", "UTF-8") + "=" + URLEncoder.encode(MemberName, "UTF-8") + "&"+
					 URLEncoder.encode("ConfirmationNo", "UTF-8") + "=" + URLEncoder.encode(ConfirmationNo, "UTF-8") + "&"+
					 URLEncoder.encode("MemberType", "UTF-8") + "=" + URLEncoder.encode(MemberType, "UTF-8") + "&"
              		 + URLEncoder.encode("roomNumber", "UTF-8") + "=" + URLEncoder.encode(roomNumber, "UTF-8");
			url = new URL(urlString);
			sendRequest();
			if(jsonOutput.equals("inserted successfully")){
				return true;
			}else{
				return false;
			}
		}
		
		public boolean updateRoomStatusHK(String RoomID,String statusHK) throws IOException{
			urlString ="http://35.173.198.1/HotelManagment/updateStatusHK.php";
			 postData = URLEncoder.encode("roomID", "UTF-8") + "=" + URLEncoder.encode(RoomID, "UTF-8") + "&"
               		 + URLEncoder.encode("roomStatusHK", "UTF-8") + "=" + URLEncoder.encode(statusHK, "UTF-8");
			url = new URL(urlString);
			sendRequest();
			if(jsonOutput.equals("status updated successfully")){
				return true;
			}else{
				return false;
			}
			
		}
		
	
		public boolean updateRoomStatusRS(String RoomID,String statusRS) throws IOException{
			urlString ="http://35.173.198.1/HotelManagment/updateStatusRS.php";
			 postData = URLEncoder.encode("roomID", "UTF-8") + "=" + URLEncoder.encode(RoomID, "UTF-8") + "&"
               		 + URLEncoder.encode("roomStatusRS", "UTF-8") + "=" + URLEncoder.encode(statusRS, "UTF-8");
			url = new URL(urlString);
			sendRequest();
			if(jsonOutput.equals("status updated successfully")){
				return true;
			}else{
				return false;
			}
			
		}
		
		
		public ArrayList<Room> getVDRoom() throws IOException{
			ArrayList<Room> roomList = new ArrayList<Room>();
			urlString ="http://35.173.198.1/HotelManagment/getVDRooms.php";
			url = new URL(urlString);
			sendRequest();
			if(!jsonOutput.equals("Failed")){
				JSONObject parentObject = null; 
				 try {
					 parentObject = new JSONObject(jsonOutput);
					 JSONArray parentArray = parentObject.getJSONArray("dirtyRooms");
					 for (int i = 0; i < parentArray.length(); i++) {
			             JSONObject finalObject = parentArray.getJSONObject(i);
			             roomList.add(new Room(Integer.parseInt(finalObject.getString("RoomID")),
			            		 				Integer.parseInt(finalObject.getString("RoomNo")),
			            		 	          finalObject.getString("StatusHK"),
			            		 	         finalObject.getString("StatusRS")));      
				  }
				 }catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}else{
				return null;
			}
			return roomList;
		}
		
		public ArrayList<Room> getAllRooms() throws IOException{
			ArrayList<Room> roomList = new ArrayList<Room>();
			urlString ="http://35.173.198.1/HotelManagment/getAllRoomList.php";
			url = new URL(urlString);
			sendRequest();
			if(!jsonOutput.equals("Failed")){
				JSONObject parentObject = null; 
				 try {
					 parentObject = new JSONObject(jsonOutput);
					 JSONArray parentArray = parentObject.getJSONArray("roomList");
					 for (int i = 0; i < parentArray.length(); i++) {
			             JSONObject finalObject = parentArray.getJSONObject(i);
			             roomList.add(new Room(Integer.parseInt(finalObject.getString("RoomNo")),
			            		 	          finalObject.getString("StatusHK"),
			            		 	         finalObject.getString("StatusRS")));      
				  }
				 }catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}else{
				return null;
			}
			return roomList;
		}
		
		public ArrayList<Room> getAvailableRooms() throws IOException{
			ArrayList<Room> roomList = new ArrayList<Room>();
			urlString ="http://35.173.198.1/HotelManagment/availableRooms.php";
			url = new URL(urlString);
			sendRequest();
			if(!jsonOutput.equals("Failed")){
				JSONObject parentObject = null; 
				 try {
					 parentObject = new JSONObject(jsonOutput);
					 JSONArray parentArray = parentObject.getJSONArray("availableRooms");
					 for (int i = 0; i < parentArray.length(); i++) {
			             JSONObject finalObject = parentArray.getJSONObject(i);
			             roomList.add(new Room(Integer.parseInt(finalObject.getString("RoomNo")),
			            		 	          finalObject.getString("StatusHK"),
			            		 	         finalObject.getString("StatusRS")));      
				  }
				 }catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}else{
				return null;
			}
			return roomList;
		}
		
		public ArrayList<Room> getVCRooms() throws IOException{
			ArrayList<Room> roomList = new ArrayList<Room>();
			urlString ="http://localhost/HotelManagment/getVCRooms.php";
			url = new URL(urlString);
			sendRequest();
			if(!jsonOutput.equals("Failed")){
				JSONObject parentObject = null; 
				 try {
					 parentObject = new JSONObject(jsonOutput);
					 JSONArray parentArray = parentObject.getJSONArray("VCRooms");
					 for (int i = 0; i < parentArray.length(); i++) {
			             JSONObject finalObject = parentArray.getJSONObject(i);
			             roomList.add(new Room(Integer.parseInt(finalObject.getString("RoomID")),
			            		 			Integer.parseInt(finalObject.getString("RoomNo")),
			            		 	          finalObject.getString("StatusHK"),
			            		 	         finalObject.getString("StatusRS")));      
				  }
				 }catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}else{
				return null;
			}
			return roomList;
		}

}
