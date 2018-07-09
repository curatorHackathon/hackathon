package com.expedia.database;

import com.github.fakemongo.Fongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;

import javax.inject.Named;
import java.util.List;

@Named
public class DataAccessLayerImpl implements DataAccessLayer {
	private Fongo fongo = new Fongo("mongo server 1");
	private DB db = fongo.getDB("mydb");
	private DBCollection collection = db.getCollection("mycollection");

	@Override
	public void signUp(String username, String password) {
//		collection.insert(new BasicDBObject("name", "jon"));
	}

	@Override
	public void populateMetaData(List<Object> airlines) {
	}
}
