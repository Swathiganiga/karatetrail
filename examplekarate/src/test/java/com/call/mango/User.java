package com.call.mango;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class User{
public static void main(String[] args)  throws UnknownHostException{ 
	create();
}
public static Object create()
{
	MongoClient mongo=null;
	try {
		mongo = new MongoClient("localhost", 27017);
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	 DB database = mongo.getDB("testdb22");
		database.createCollection("users22", null);
	DBCollection table = database.getCollection("users22");
	BasicDBObject document = new BasicDBObject();
	
	document.put("name", "swathi");
	document.put("lastName", "s");
	document.put("age", 41);
	return document;
	
}
}