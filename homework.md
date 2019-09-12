# Homework ideas

Here's a list of possible homework ideas. These are here to give you pointers on the kinds of applications you may choose to create. You can choose modified versions of these ideas, or completely custom ideas as well.

### Complex number class

Implement a `Complex` (or `Rational`) number type which is idiomatic Kotlin. Have it implement any applicable standard interfaces, and all operators that make sense for such a type. Cover the class with JUnit based tests.

>Optionally, make sure that your implementation is multiplatform-ready, by placing it all in a common module. Have your tests execute on multiple platforms, at least the JVM and JavaScript.

Other, similar ideas: `Vector` or `Matrix` classes with convenient operator support.

### Game of Life

Implement the classic Game of Life cellular automaton. Use JavaFX/[TornadoFX](https://tornadofx.io/) for the graphical user interface, and make it interactive. Let users select and unselect cells, and start/stop/reset the simulation.

### Data analysis

Process a freely available dataset using Kotlin's advanced File handling and collection processing features. Pay attention to the readability and performance of your code. For example, using [this](https://www.kaggle.com/datasnaek/youtube-new) data set about Trending YouTube videos from [Kaggle](https://www.kaggle.com), answer questions such as:

- What are the top 5 categories of trending videos in Germany?
- Which videos trended in more than half of the countries?
- Are there any videos that trended in almost all countries, but are missing from just one or two of them?
- Which videos with more than 100k views have the best and worst like/dislike ratios?
- How many channels had just a single highly trending video?

Come up with interesting questions that *you* would want to know about a data set, and answer those!

Another interesting source of data might be [data.world](https://data.world/datasets/open-data).

### Custom sequences

Implement your own [`Sequence`](https://kotlinlang.org/docs/reference/sequences.html) type, with lazily evaluated operations, and terminal operators. The implementation can build on similar concepts as the original implementation, but of course, may not be a straight copy of it. Cover your implementation with JUnit based tests.

>Optionally, make sure that your implementation is multiplatform-ready, by placing it all in a common module. Have your tests execute on multiple platforms, at least the JVM and JavaScript.

### API browser

Create a JavaFX/[TornadoFX](https://tornadofx.io/) application that accesses data from a public API, and enables browsing that data. Display lists of the data from the API (with sorting/filtering options), show a details page when the user selects a specific item (with related items), load images, etc.

You can find a wide variety of free, public APIs [here](https://github.com/public-apis/public-apis). Some might require you to register for an access token to authenticate with.

For your networking needs, the [Ktor client](https://ktor.io/clients/http-client.html) or [Retrofit](https://square.github.io/retrofit/) are both good choices.

### Multiplatform hello-world

Create a simple application (for example, a basic tip calculator) that can compile to a variety different target platforms of Kotlin: the JVM, JavaScript, and at least one Native target (Windows, macOS, Linux, iOS, or WebAssembly).

>Bonus points for performing network calls or using a database in the application.

### Ktor app

Use [Ktor](https://ktor.io/), a *very Kotlin* web framework from JetBrains to create a simple web application that provides a REST API and stores data persistently in a database. The application should contain at least some basic business logic.

This can be a pizza delivery service, a favourite movies app, or anything else that provides similar functionality.

### Spring Boot app

Same as the Ktor app idea above, using the [Spring Boot](https://spring.io/projects/spring-boot) framework (see also: [the Spring Initializr](https://start.spring.io/)).

### JavaScript web app

Create a simple web application using Kotlin's [JavaScript target](https://kotlinlang.org/docs/reference/js-overview.html). Let the user input data to it (text, images, etc), organize and display that data, make it editable.

This can basically be a todo app, but more interesting domain choices such as an inventory management app or student registry would be appreciated.

### DSL

Create a domain specific language using Kotlin's advanced syntax capabilities. See the [official documentation](https://kotlinlang.org/docs/reference/type-safe-builders.html), [this showcase](https://www.grokkingandroid.com/creating-kotlin-dsls/), or [this article](https://zsmb.co/kotlin-dsl-design-with-village-dsl/) as learning resources. Choose your own problem domain for the task. Some vague ideas:
 
- State machines
- Organizational structures
- Graphs
- Validation rules