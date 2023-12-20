https://docs.google.com/document/d/1_RzSrQ3xbE-qH9OmvFMVbe09_w4MuqIbbWBUutRX1SE/edit

# CascadeType:

In Hibernate, cascade types are used to specify how changes to a parent entity should affect its child entities. 
There are several cascade types available, each with its own purpose.

* Cascade types in JPA are used to define how changes made to a parent entity are automatically 
propagated to its related child entities. This helps to simplify data management and maintain 
data consistency within your application.

Here's a breakdown of the different cascade types in JPA:

1. CascadeType.PERSIST:

When the parent entity is persisted (saved to the database), all its related child entities are also persisted.
This is useful for ensuring that all newly created child entities are properly saved along with their parent.
2. CascadeType.MERGE:

When the parent entity is merged (updated in the database), the changes are also applied to its related child entities.
This ensures that any updates to the parent are reflected in its associated child entities.
3. CascadeType.REMOVE:

When the parent entity is removed (deleted from the database), all its related child entities are also removed.
This helps to prevent orphaned child entities from being left in the database after their parent is deleted.
4. CascadeType.REFRESH:

When the parent entity is refreshed (its state is synchronized with the database), the changes are also reflected in its related child entities.
This can be useful for ensuring that your application always has the latest data for both the parent and child entities.
5. CascadeType.DETACH:

When the parent entity is detached (removed from the persistence context), all its related child entities are also detached.
This is useful for freeing up memory and preventing unnecessary updates to the database.
6. CascadeType.REPLICATE:

This cascade type is specific to Hibernate and indicates that the entity should be replicated across a cluster.
This is not commonly used in most applications.
7. CascadeType.SAVE_UPDATE:

This cascade type is also specific to Hibernate and combines the functionality of both CascadeType.PERSIST and CascadeType.MERGE.
This means that the entity will be saved if it is new and updated if it already exists.
Additional Points:

You can combine multiple cascade types together using an array.
By default, no cascade type is applied. You need to explicitly specify which cascade types you want to use.
Cascade types can be applied to both one-to-many and many-to-one relationships.

# Fetch type

* In the context of Spring Data JPA and Hibernate (the underlying JPA provider), "lazy" and "eager" refer to the fetching strategy used for associations between entities. These strategies determine when related entities should be loaded from the database. Let's explore both concepts:

Lazy Loading:

Definition: Lazy loading means that the associated entities are not loaded from the database until they are explicitly accessed. In other words, the data is fetched on-demand.

Advantages: It can improve performance by loading only the necessary data when needed, especially in situations where not all associated entities are always required.

Disadvantages: Lazy loading may lead to the "LazyInitializationException" if the associated entities are accessed outside the scope of an active Hibernate session. This exception occurs when trying to access unloaded data outside the transactional boundaries.


Eager Loading:


Definition: Eager loading means that the associated entities are loaded from the database along with the main entity. This happens immediately when the main entity is loaded.

Advantages: Eager loading can be convenient when you know that you will frequently access the associated entities, as it avoids additional database queries during subsequent access.

Disadvantages: It may lead to performance issues, especially when dealing with large datasets or when not all associated entities are always needed.

# JoinColumn

The @JoinColumn annotation in JPA (Java Persistence API) is used to specify the mapping of a foreign key column in a relationship between two entities.

Here's a brief explanation of some commonly used attributes of @JoinColumn:

1. name: The name of the foreign key column in the database.
2. referencedColumnName: The name of the primary key column in the referenced table (by default, it is assumed to be the primary key of the referenced table).
3. nullable: Specifies whether the foreign key column can contain null values (default is true).
4. unique: Specifies whether the foreign key column should be part of a unique constraint (default is false).

# default  fetch type

1. OneToMany: LAZY
2. ManyToOne: EAGER
3. ManyToMany: LAZY
4. OneToOne: EAGER

# jackson
Here are some of the most commonly used JSON property annotations in Java:

@JsonProperty:
This annotation is used to specify the name of a field in the JSON output or input that differs from the name of the corresponding Java field. This can be useful when working with JSON data from external sources that use different naming conventions.

@JsonIgnore:
This annotation can be used to ignore a field during serialization and deserialization. Any field marked with this annotation will not be included in the JSON output or read from the JSON input.

@JsonFormat:
This annotation can be used to specify the format of a date or other value during serialization and deserialization. For example, you can use this annotation to specify that a date should be serialized in the format "yyyy-MM-dd".

@JsonGetter:
This annotation is used to mark a method as a getter method. This can be useful when working with JSON data from external sources that use different naming conventions.

@JsonSetter:
This annotation is used to mark a method as a setter method. This can be useful when working with JSON data from external sources that use different naming conventions.

@JsonAlias:
This annotation defines one or more alternative names for a property during deserialization. This can be useful when working with JSON data from external sources that use different naming conventions.

@JsonCreator:
This annotation is used to mark a constructor that should be used to create a Java object from JSON data. This can be useful when working with JSON data from external sources that use different naming conventions.

@JsonTypeName:
This annotation is used to specify the logical name that the annotated class has. This can be useful when working with JSON data from external sources that use different naming conventions.

@JsonTypeInfo:
This annotation is used to specify the type information that should be used to serialize and deserialize a Java object. This can be useful when working with JSON data from external sources that use different naming conventions.