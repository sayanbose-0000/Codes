# CRUD operations in mongoDB (CRUD- create, read, update and delete.)

<!--start server-->
mongod

<!--connect to the server (don't close the prv window)-->
mongosh

<!--start using it...if amazonclone is not present, it will be created-->
use amazonclone

<!------------------------------------------------------------------------------------------------------>

<!--Insert one document-->
db.items.insertOne({name:"Samsung S23 Ultra", price:100000, rating: 4.9, quantity: 233, sold: 98}) //we make a collection named items... and inside it
<!-- 'items' is a collection and the datas inside the item collection are called documents -->

<!-- Insert many documents -->
db.items.insertMany([{name:"Samsung M20",price:20000,rating:2.1,quantity:30, sold:0},{name:"Nokia 3310",price:0.005,rating:5,quantity:1000, sold:1001}])
<!-- We need not have the same parameters for each document -->

<!------------------------------------------------------------------------------------------------------>

Primary Key
    _id: ObjectId("6522f6af986adb1e6a55b79b"),


    created by mongodb


<!------------------------------------------------------------------------------------------------------>

<!--show collections-->
show collections
<!-- In this case, "items" will be shown-->

<!-- find all inserted items a.k.a quering -->
db.items.find()

<!-- find particular inserted items a.k.a quering -->
amazonclone> db.items.find({price: 100000})

<!--Only show the rating object of the documents whose rating is greater than 2.0-->
amazonclone> db.items.find({rating: {$gte: 2.0}},{rating: 1})

<!--greater than or equal to (gte)-->
db.items.find({rating: {$gte: 2.0}})

<!--rating >= 2.0 (gte) and price > 20000-->
db.items.find({rating: {$gte: 2.0},price:{$gt:45000}})

<!--rating >= 2.0 (gte) or price > 20000-->
db.items.find({$or:[{rating:{$gte: 2.0}},{price:{$gt:45000}}]})

<!------------------------------------------------------------------------------------------------------>

<!--deleting one item of correct match mongodb-->
db.items.deleteOne({price:5000}) <!--delets only one even if multiple items of same value are present-->

<!--deleting more than item of correct match-->
db.items.deleteMany({price:5000}) <!--deletes all items that match the value-->

<!------------------------------------------------------------------------------------------------------>

<!--Updating data in database for only once -->
db.items.updateOne({name:"Nokia 3310"},{$set:{price:2}}) <!--first one is searching parameter and second one is updating parameter-->

<!--Updating data in database for all -->
db.items.updateMany({name:"Nokia 3310"},{$set:{price:2}})<!--first one is searching parameter and second one is updating parameter-->
