# Homework ideas

Here's a list of possible homework ideas. These are here to give you pointers on the kinds of applications you may choose to create. You can choose modified versions of these ideas, or completely custom ideas as well.

### Complex number class

Implement a `Complex` number type which is idiomatic Kotlin. Have it implement any applicable standard interfaces, and all operators that make sense for such a type. Cover the class with JUnit based tests.

>Optionally, make sure that your implementation is multiplatform-ready, by placing it all in a common module. Have your tests execute on multiple platforms, at least the JVM and JavaScript.

### Game of Life

Implement the classic Game of Life cellular automaton. Use JavaFX/TornadoFX for the graphical user interface, and make it interactive. Let users select and unselect cells, and start/stop/reset the simulation. 

### Data analysis

Process a freely available dataset using Kotlin's advanced File handling and collection processing features. Pay attention to the readability and performance of your code. For example, using [this](https://www.kaggle.com/datasnaek/youtube-new) data set about Trending YouTube videos from [Kaggle](https://www.kaggle.com), answer questions such as:

- What are the top 5 categories of trending videos in Germany?
- Which videos trended in more than half of the countries?
- Are there any videos that trended in almost all countries, but are missing from just one or two of them?
- Which videos with more than 100k views have the best and worst like/dislike ratios?
- How many channels had just a single highly trending video?

Come up with interesting questions that *you* would want to know about a data set, and answer those!

Another interesting source of data might be [data.world](https://data.world/datasets/open-data).

### API browser

Create a JavaFX/TornadoFX application that accesses data from a public API, and enables browsing that data. Display lists of the data from the API (with sorting/filtering options), show a details page when the user selects a specific item (with related items), load images, etc.

You can find a wide variety of free, public APIs [here](https://github.com/public-apis/public-apis). Some might require you to register for an access token to authenticate with.

For your networking needs, [Ktor](https://ktor.io/clients/http-client.html) or [Retrofit](https://square.github.io/retrofit/) are both good choices.

### Custom sequences

Implement your own [`Sequence`](https://kotlinlang.org/docs/reference/sequences.html) type, with lazily evaluated operations, and terminal operators. The implementation can build on similar concepts as the original implementation, but of course, may not be a straight copy of it. Cover your implementation with JUnit based tests.
                                                                                                                                                                                        >Optionally, make sure that your implementation is multiplatform-ready, by placing it all in a common module. Have your tests execute on multiple platforms, at least the JVM and JavaScript.

### Multiplatform hello-world

Create a simple application (for example, a basic tip calculator) that can compile to a variety different target platforms of Kotlin: the JVM, JavaScript, and at least one Native target (Windows, macOS, Linux, iOS, or WebAssembly).

>Bonus points for performing network calls or using a database in the application.

### DSLs

### Spring app

### Ktor app 

### JavaScript web app
