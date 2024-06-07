import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.mongodb.client.FindIterable
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.CreateCollectionOptions
import com.mongodb.client.MongoCollection
import internal.GlobalVariable
import org.bson.Document
import static com.mongodb.client.model.Filters.eq
import com.mongodb.client.model.Filters;

import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.mongodb.*;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;




public class MongoDB {

	@Keyword
	def connectDB(String databaseName, String collectionName) {

		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)


		try {

			// Connect to a Collection
			MongoCollection<Document> collection = database.getCollection(collectionName);
			println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

			insertBlockService(collection)
			// deleteBlockService(collection)


			// Close the connection
			mongoClient.close()
		} catch (MongoException me) {
			System.err.println(me);
		}
	}


	def insertBlockService(MongoCollection<Document> collection) {


		// Define the document to insert
		def doc = new Document("_id", "11")
				.append("services", "/openCIF")
				.append("status", "blocked")



		// Insert the document into the collection
		collection.insertOne(doc)


		// Print the inserted document
		println("Inserted Document:")
	}

	def updateBlockService(MongoCollection<Document> collection) {


		// Define filter to find the documents you want to update
		Document filter = new Document("_id", "11")
				.append("services", "/openCIFTest")
				.append("status", "blocked");




		// Define the document to update
		def doc = new Document("_id", "11")



		// Update the document into the collection
		collection.updateOne(doc, "/openCIFTest")


		// Print the updated document
		println("Updated Document:")
	}

	def deleteBlockService(MongoCollection<Document> collection) {


		collection.deleteOne(Filters.eq("_id", "11"));
	}

	def viewBlockService(MongoCollection<Document> collection) {


		FindIterable<Document> data = collection.find();

		for(Document doc : data) {


			println("Result : " + doc)
		}
	}

	def retrievingCollections( String databaseName, MongoDatabase database) {

		// Retrieving collections
		println('\nList of DB Collections in Database - "'+databaseName+'" are: ');
		for (String collectionList : database.listCollectionNames()) {
			println("-- "+collectionList)
		}
	}


	@Keyword
	def insertOpenCIF(String databaseName, String collectionName) {

		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)


		try {

			// Connect to a Collection
			MongoCollection<Document> collection = database.getCollection(collectionName);
			println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

			insertBlockService(collection)


			// Close the connection
			mongoClient.close()
		} catch (MongoException me) {
			System.err.println(me);
		}
	}


	@Keyword
	def deleteOpenCIF(String databaseName, String collectionName) {

		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)


		try {

			// Connect to a Collection
			MongoCollection<Document> collection = database.getCollection(collectionName);
			println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

			collection.deleteOne(Filters.eq("_id", "11"));

			// Print the delete document
			println("Deleted Document:")


			// Close the connection
			mongoClient.close()
		} catch (MongoException me) {
			System.err.println(me);
		}
	}
}
