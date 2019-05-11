### 資料庫連線 ###
JDBC與Hibernate在性能上相比，JDBC靈活性有優勢。而Hibernate在易學性，易用性上有些優勢。當用到很多復雜的多表聯查和復雜的數據庫操作時，JDBC有優勢。

https://www.itread01.com/content/1496672524.html

== Test the service

Now that the service is up, visit http://localhost:8080/greeting, where you see:

[source,json]
----
{"id":1,"content":"Hello, World!"}
----

Provide a `name` query string parameter with http://localhost:8080/greeting?name=User. Notice how the value of the `content` attribute changes from "Hello, World!" to "Hello, User!":

[source,json]
----
{"id":2,"content":"Hello, User!"}
----

This change demonstrates that the `@RequestParam` arrangement in `GreetingController` is working as expected. The `name` parameter has been given a default value of "World", but can always be explicitly overridden through the query string.

Notice also how the `id` attribute has changed from `1` to `2`. This proves that you are working against the same `GreetingController` instance across multiple requests, and that its `counter` field is being incremented on each call as expected.

