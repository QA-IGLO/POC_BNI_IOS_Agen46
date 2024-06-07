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

import internal.GlobalVariable

import com.mongodb.client.FindIterable
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.CreateCollectionOptions
import com.mongodb.client.MongoCollection
import org.bson.Document
import static com.mongodb.client.model.Filters.eq
import com.mongodb.client.model.Filters;

import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.mongodb.*;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;

public class BlockService {

	@Keyword
	def insertTiketInquiry(String databaseName, String collectionName) {

		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)



		// Connect to a Collection
		MongoCollection<Document> collection = database.getCollection(collectionName);
		println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

		// Define the document to insert
		def doc = new Document("_id", "12")
				.append("services", "/tiketInquiry")
				.append("status", "blocked")



		// Insert the document into the collection
		collection.insertOne(doc)


		// Print the inserted document
		println("Inserted Document:")


		// Close the connection
		mongoClient.close()
	}

	@Keyword
	def deleteTiketInquiry(String databaseName, String collectionName) {

		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)


		// Connect to a Collection
		MongoCollection<Document> collection = database.getCollection(collectionName);
		println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

		collection.deleteOne(Filters.eq("services", "/tiketInquiry"));

		// Print the delete document
		println("Deleted Document:")


		// Close the connection
		mongoClient.close()
	}

	@Keyword
	def insertSetorTunaiInquiry(String databaseName, String collectionName) {

		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)



		// Connect to a Collection
		MongoCollection<Document> collection = database.getCollection(collectionName);
		println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

		// Define the document to insert
		def doc = new Document("services", "/setorTunaiInquiry")
				.append("status", "blocked")




		// Insert the document into the collection
		collection.insertOne(doc)


		// Print the inserted document
		println("Inserted Document:")


		// Close the connection
		mongoClient.close()
	}

	@Keyword
	def deleteSetorTunaiInquiry(String databaseName, String collectionName) {

		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)


		// Connect to a Collection
		MongoCollection<Document> collection = database.getCollection(collectionName);
		println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

		// Delete
		collection.deleteOne(Filters.eq("services", "/setorTunaiInquiry"));

		// Print the delete document
		println("Deleted Document:")


		// Close the connection
		mongoClient.close()
	}

	@Keyword
	def insertTransferBNIInquiry(String databaseName, String collectionName) {

		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)



		// Connect to a Collection
		MongoCollection<Document> collection = database.getCollection(collectionName);
		println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

		// Define the document to insert
		def doc = new Document("services", "/transferBNIInquiry")
				.append("status", "blocked")




		// Insert the document into the collection
		collection.insertOne(doc)


		// Print the inserted document
		println("Inserted Document:")


		// Close the connection
		mongoClient.close()
	}

	@Keyword
	def deleteTransferBNIInquiry(String databaseName, String collectionName) {

		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)


		// Connect to a Collection
		MongoCollection<Document> collection = database.getCollection(collectionName);
		println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

		collection.deleteOne(Filters.eq("services", "/transferBNIInquiry"));

		// Print the delete document
		println("Deleted Document:")


		// Close the connection
		mongoClient.close()
	}

	@Keyword
	def insertTfInquiry(String databaseName, String collectionName) {

		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)



		// Connect to a Collection
		MongoCollection<Document> collection = database.getCollection(collectionName);
		println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

		// Define the document to insert
		def doc = new Document("services", "/tfInquiry")
				.append("status", "blocked")




		// Insert the document into the collection
		collection.insertOne(doc)


		// Print the inserted document
		println("Inserted Document:")


		// Close the connection
		mongoClient.close()
	}

	@Keyword
	def deleteTfInquiry(String databaseName, String collectionName) {

		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)


		// Connect to a Collection
		MongoCollection<Document> collection = database.getCollection(collectionName);
		println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

		collection.deleteOne(Filters.eq("services", "/tfInquiry"));

		// Print the delete document
		println("Deleted Document:")


		// Close the connection
		mongoClient.close()
	}

	
	
	@Keyword
	def insertServiceBlock(String nameServiceBlock) {
		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter
		
		String databaseName = "lkpd"
		String collectionName = "blocked_services_flutter"

		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)



		// Connect to a Collection
		MongoCollection<Document> collection = database.getCollection(collectionName);
		println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)

		// Define the document to insert
		
		String serviceBlock = selectServiceBlock(nameServiceBlock)
		
		def doc = new Document("services", "/"+nameServiceBlock)
				.append("status", "blocked")




		// Insert the document into the collection
		collection.insertOne(doc)


		// Print the inserted document
		println("Inserted Document:")


		// Close the connection
		mongoClient.close()
		
		
		
	}
	
	
	@Keyword
	def deleteServiceBlock(String nameServiceBlock) {
		
		// Replace the placeholder with your Atlas connection string
		// DatabaseName : lkpd || Collection : blocked_services_flutter

		String databaseName = "lkpd"
		String collectionName = "blocked_services_flutter"
		
		String uri = "mongodb://192.168.141.50:27017/"+databaseName+"?retryWrites=true&directConnection=true&serverSelectionTimeoutMS=5000"

		// Creating a Mongo client
		MongoClient mongoClient = MongoClients.create(uri)

		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase(databaseName)
		println("\nConnected Successfully to Database: " +database)


		// Connect to a Collection
		MongoCollection<Document> collection = database.getCollection(collectionName);
		println("\nConnected Successfully to Collection: " +collection.getNamespace().collectionName)
		
		String serviceBlock = selectServiceBlock(nameServiceBlock)

		collection.deleteOne(Filters.eq("services", "/"+nameServiceBlock));

		// Print the delete document
		println("Deleted Document:")


		// Close the connection
		mongoClient.close()
		
	}
	
	def selectServiceBlock(String serviceBlock) {
		
		
		if (serviceBlock.equals("openCIF")) {
			
			return "/openCIF"
			
		} else if (serviceBlock.equals("tiketInquiry")) {
			
			return "/tiketInquiry"
			
		} else if (serviceBlock.equals("setorTunaiInquiry")) {
			
			return "/setorTunaiInquiry"
			
		} else if (serviceBlock.equals("transferBNIInquiry")) {
			
			return "/transferBNIInquiry"
			
		} else if (serviceBlock.equals("tfInquiry")) {
			
			return "/tfInquiry"
			
		} 
		
		
		
	}

		
	
}


