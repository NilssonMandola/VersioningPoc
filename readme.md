The idea is to support multiple versions of an api with shared DTOs via a simple request header.

Solved issues:
* Old clients need to be supported with old DTOs
* New clients want to use the latest and greatest without thinking about old DTOs
* When old clients no longer use the API we want to be able to safely delete old DTOs without breaking anything

