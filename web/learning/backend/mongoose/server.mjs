// Import the mongoose library, which is an Object Data Modeling (ODM) library for MongoDB.
import mongoose from 'mongoose';

// Define an asynchronous function to connect to the MongoDB database.
async function connectToDatabase() {
    try {
        // Attempt to connect to the 'amazonclone' database on the local MongoDB server.
        await mongoose.connect('mongodb://127.0.0.1:27017/amazonclone', {
            useNewUrlParser: true, // Use the new URL parser.
            useUnifiedTopology: true, // Use the new Server Discovery and Monitoring engine.
        });
        console.log('MongoDB connected successfully');

    } catch (error) {
        // If there's an error during the connection attempt, log the error.
        console.error('MongoDB connection error:', error);
    }
}

// Call the connectToDatabase function to initiate the database connection.
connectToDatabase();

// Define a schema for the 'Kitten' model. A schema defines the structure of documents in MongoDB.
const kittySchema = new mongoose.Schema({
    name: String // Define a field 'name' of type String.
});

// Define a method 'speak' for documents created based on the 'kittySchema'.
kittySchema.methods.speak = function speak() {
    const greeting = "My name is " + this.name;
    console.log(greeting);
};

// Create a model 'Kitten' based on the 'kittySchema'. Models provide an interface for interacting with MongoDB collections.
const Kitten = mongoose.model('Kitten', kittySchema);

// Create a new Kitten document with the name 'Samsung S 20'.
const hello = new Kitten({ name: 'Samsung S 20' });

// Log the 'name' property of the 'hello' document.
console.log(hello.name);

// Save the 'hello' document to the MongoDB 'Kitten' collection.
await hello.save();

// Call the 'speak' method on the 'hello' document, which logs a greeting based on the document's 'name'.
hello.speak();

//finding
const kittens = await Kitten.find();
console.log(kittens);