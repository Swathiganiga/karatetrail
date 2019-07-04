Feature: Demo test api testing


Scenario: create a user and then get it by id


  
* def MongoDBExample = Java.type('com.call.mango.User')
* def result = MongoDBExample.create()
* print 'created id is: ' + result

* match result == {  name : "swathi" , lastName : "s" , age : 41 }


