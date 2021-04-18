# springboot +graphQL +h2 DB 

steps
  1.clone the project git clone https://github.com/ChaitanyaMM/springboot-graphql.git
  2.mvn clean install
  3.run the application
  4.http://localhost:9000/graphiql
  
  #mutation
  ========
   INPUT
  ========
  mutation {
  
  createVehicle(carBrand :"tata",modelType:"Altroz XT",registrationNumber:"6639",rcNumber:"12345",fuelType:"Petrol"){
    id
    carBrand
    modelType
    registrationNumber
    
  }
}
  ========
   OUTPUT
  ========
 {
  "data": {
    "createVehicle": {
      "id": "1",
      "carBrand": "tata",
      "modelType": "Altroz XT",
      "registrationNumber": "6639"
    }
  }
}

 #Query  -->findById
  ========
   INPUT
  ========
 query {
    findById(id:"1"){
     id
    carBrand
}
}
  ========
   OUTPUT
  ========
{
  "data": {
    "findById": {
      "id": "1",
      "carBrand": "tata"
    }
  }
}

#Query  -->findAll
  ========
   INPUT
  ========
  query {
    findAll{
     id
    carBrand
}
}
  ========
   OUTPUT
  ========
 {
  "data": {
    "findAll": [
      {
        "id": "1",
        "carBrand": "tata"
      }
    ]
  }
}






