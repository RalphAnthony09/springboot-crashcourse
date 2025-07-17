# Zoo Simulator REST API Endpoints
### Ralph Anthony R. Rafael 
<br>

| Resources      | HTTP Verb   | Resource URL                     | Use Case                                                |
|:---------------|:------------|:---------------------------------|:--------------------------------------------------------|
| Zoo            | GET         | /zoos/{zooId}                    | Check zoo status (open or closed)                       |
|                | PUT         | /zoos/{zooId}/status             | Open or close the zoo                                   |
| Visitor        | POST        | /visitors                        | Register a new visitor                                  |
|                | GET         | /visitors                        | List all visitors                                       |
|                | GET         | /visitors/{visitorsId}           | Get details of a specific visitor                       |
|                | PUT         | /visitors/{visitorId}/locations  | Update visitor location                                 |
|                | GET         | /visitors/{visitorId}/tasks      | Get a visitor's available tasks/activities              |
|                | POST        | /visitors/{visitorId}/exit       | Records the exiting of the visitor                      |
| Visitor Ticket | POST        | /visitors/{visitorsId}/tickets   | Visitor buys a new ticket                               |
|                | GET         | /tickets/{ticketId}              | Get details of a specific ticket by ID                  |
|                | POST        | /tickets/{ticketId}/validate     | Validate ticket and allow zoo entry                     |
| Enclosure      | GET         | /enclosures/{enclosureId}        | Get details of a specific enclosure                     |
|                | GET         | /enclosures                      | List all enclosures                                     |
| Animal         | GET         | /animals                         | Get all animals across all enclosures and hospital      |
|                | GET         | /animals/{animalId}              | Get details of a specific animal                        |
|                | PUT         | /animals/{animalId}              | Update details of an animal (Name, Healthy, Location)   |
|                | POST        | /animals/{animalId}/eat          | Record an eating action for an animal                   |
|                | POST        | /animals/{animalId}/sleep        | Record a sleeping action for an animal                  |
|                | POST        | /animals/{animalId}/roam         | Record a roaming action for an animal                   |
|                | POST        | /animals/{animalId}/makeSound    | Record a make sound action for an animal                |
| Animal Feeding | POST        | /animals/{animalId}/feed         | Get details of a specific shop                          |
| Shop           | GET         | /shops                           | Get information of all the shops                        |
|                | GET         | /shops/{shopId}                  | Get specific information of a shop                      |
| Purchase       | POST        | /shops/{shopId}/purchases        | Record a purchase in a shop                             |
| Hospital       | GET         | /hospital                        | Get general hospital information                        |
|                | POST        | /hospital/admit                  | Admit an animal to the hospital                         |
|                | POST        | /hospital/discharge              | Discharge an animal from the hospital                   |
| Lecture        | GET         | /hospital/lectures               | List all science lectures                               |
|                | GET         | /hospital/lectures/{lectureId}   | Get details of a specific science lecture               |
| Manager        | GET         | /managers                        | List all managers                                       |
|                | GET         | /managers/{managerId}            | Get details of a specific manager                       |
|                | PUT         | /managers/{managerId}/locations  | Update manager location                                 |
| Vendor         | GET         | /vendors                         | List all vendors                                        |
|                | GET         | /vendors/{vendorId}              | Get details of a specific vendor                        |
|                | PUT         | /vendors/{vendorId}/locations    | Update vendor location                                  |
|                | POST        | /vendors/{vendorId}/sell         | Vendor sells an item (alternative to Purchase endpoint) |
| Handler        | GET         | /handlers                        | List all handlers                                       |
|                | GET         | /handlers/{handlerId}            | Get details of a specific handler                       |
|                | PUT         | /handlers/{handlerId}/locations  | Update handler location                                 |
|                | POST        | /handlers/{handlerId}/exercise   | Handler exercises an animal                             |
|                | POST        | /handlers/{handlerId}/examine    | Handler examines an animal                              |
| Veterinarian   | GET         | /veterinarians                   | List all veterinarians                                  |
|                | GET         | /veterinarians/{vetId}           | Get details of a specific veterinarian                  |
|                | PUT         | /veterinarians/{vetId}/locations | Update veterinarian location                            |
|                | POST        | /veterinarians/{vetId}/heal      | Veterinarian heals an animal                            |
|                | POST        | /veterinarians/{vetId}/lecture   | Veterinarian gives a lecture                            |