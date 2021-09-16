# Jungle

Java RESTful API.

following the requirements, the API return a Json of all the animals and what they eat, also you can search animals by name or by food, and you can create a new food. 

**At run the API**
----
Return json with a List Animals and what they eat.

**Data example**

```json
 {
   "name": "rabbit",
   "diet": [
     "carrot"
   ]
  },  
  {
    "name": "bear",
    "diet": [
      "honey",
      "carrot"
    ]
  },
  ...
```

**Get an Animal by name**
----
Returns json data about the animal.

**URL** : `/animal/{animalName}`

**Method** : `GET`

**Success Response:**

**Code** : `200 OK`

**Body:**
```json
  {
    "name":"bear",
    "diet":[
      {"name":"honey"},
      {"name":"carrot"}
    ]
  }
```

**Get animals by food**
----
Returns json data about the food.

**URL** : `/food/{foodName}`

**Method** : `GET`

**Success Response:**

**Code** : `200 OK`

**Body:**
```json
  {
    "name":"carrot",
    "eatenBy":[
      "rabbit",
      "bear"
    ]
  }
```
**Create a new food**
----
Returns json data about the food.

**URL** : `/animal`

**Method** : `POST`

**Body**

``` json
  {
      "name": "food name" 
  }
```
**Data example**

```json
  {
    "name": "onion"
  }
```

**Success Response:**

**Code** : `201 CREATED`

**Body:**
```json
  {
    "name":"onion",
    "eatenBy":[]
  }
```