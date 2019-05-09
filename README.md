# Assessment 2

**READ THIS DOCUMENT COMPLETELY BEFORE STARTING THE ASSESSMENT**

## Overview
Because of the excellent work you did before, Cognizant has been hired to help the now successful online clothing company **Ali Snobba** become even more successful.

As part of the engagement, their monolithic e-commerce app is being reorganized into a microservices architecture. 

## Your Task
- Factor out their search feature into a separate ProductSearch service based on the requirements below.

## Time to Complete
- You have 1 hour and 30 minutes to complete this assessment.  (Ends at 12pm.)
- Once you are done, take lunch and be back in the room at 1pm sharp for assessment 3.

## Stories
- As a customer, I can filter search results by brand.
- As a customer, I can filter search results by color.
- As a customer, I can filter search results by price range.
- As a customer, I can combine multiple filters.

## Test Data
| category | brand |color	| price |
| :--- | :--- | :--- | :--- |
| dresses	| Gucci	| yellow | 2,272.00 |
| dresses	| Gucci | red	| 1,966.00 |
| dresses	| Marni	| brown	| 999.00 |
| dresses	| Marni	| pink	| 1,129.00 |
| dresses	| Bottega Veneta | black | 2,200.00 |
| dresses | Prada	| black | 1,650.00 |
| dresses	| Victoria Beckham | blue | 927.00 |
| dresses | Celine | beige | 1,901.00 |
| dresses | Jil Sander | orange | 511.00 |

## Test Data Loading
Assuming you have a ProductService that connects to your ProductRepository, the following code can be used/modified to load the test data above.  This can be put in your Main class or a configuration class - it's up to you.

```java
@Bean
CommandLineRunner runner(ProductService productService) {

    return args -> {

        // adding test data
        productService.save(Product.builder().withCategory("dresses").withBrand("gucci").withColor("yellow").withPrice(2272.0).build());
        productService.save(Product.builder().withCategory("dresses").withBrand("gucci").withColor("red").withPrice(1966.0).build());
        productService.save(Product.builder().withCategory("dresses").withBrand("marni").withColor("brown").withPrice(999.0).build());
        productService.save(Product.builder().withCategory("dresses").withBrand("marni").withColor("pink").withPrice(1129.0).build());
        productService.save(Product.builder().withCategory("dresses").withBrand("bottega veneta").withColor("black").withPrice(2200.0).build());
        productService.save(Product.builder().withCategory("dresses").withBrand("prada").withColor("black").withPrice(1650.0).build());
        productService.save(Product.builder().withCategory("dresses").withBrand("victoria beckham").withColor("blue").withPrice(927.0).build());
        productService.save(Product.builder().withCategory("dresses").withBrand("celine").withColor("beige").withPrice(1901.0).build());
        productService.save(Product.builder().withCategory("dresses").withBrand("jil sander").withColor("orange").withPrice(511.0).build());


    };
}
```
If your Product class doesn't use a Builder, you can adjust the code above to work with a Product constructor as well.

## Technical requirements
- Use Spring.
- Use Spring REST services.
- Use Spring Data JPA.
- Use an in-memory H2 database.
- Use plain Java (and Spring) to search -- don’t over-engineer the exercise by trying to use frameworks like ElasticSearch.
- Write clean, modularized code.
- Make small, meaningful git commits.
- Write unit tests.

## Notes
- There is NOT a free-text search aspect to this -- just filter on brand, color, price range, as stated.
- There is NOT a UI aspect to this exercise. You are ONLY making the “headless” search service via a RESTful interface.
- There IS a database aspect to this exercise. Use Spring Data JPA to store data in an H2 database.
- Use a CommandLineRunner to pre-load the database with the data above. (See example code above on how to do this.)
- ONLY implement what is specified above. If you aren’t sure whether something is in scope, ask!

## How to Submit Your Work
- **Fork** this repo to your own github account.
- Check out your new repo into your IDE.
- Commit your code often and when you're done with the assessment.
- Don't change the name of the repo.

## Grading Rubric
- 5% - Project completed.
- 10% - Code compiles, builds and runs.
- 10% - Unit tests passed.
- 15% - Followed instructions fully.
- 20% - Unit tests written.
- 20% - Coding best practices used.
- 20% - Implemented all stories.
