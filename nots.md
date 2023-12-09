# CascadeType:

* The CascadeType enumeration in Spring Data JPA defines different cascade options that you can use to specify the cascade behavior. These options include:

ALL: Cascades all operations (persist, merge, remove, refresh, detach) to the associated entities.

PERSIST: Cascades the persist operation to the associated entities.

MERGE: Cascades the merge operation to the associated entities.

REMOVE: Cascades the remove operation to the associated entities.

REFRESH: Cascades the refresh operation to the associated entities.

DETACH: Cascades the detach operation to the associated entities.


# In the context of Spring Data JPA and Hibernate (the underlying JPA provider), "lazy" and "eager" refer to the fetching strategy used for associations between entities. These strategies determine when related entities should be loaded from the database. Let's explore both concepts:

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

name: The name of the foreign key column in the database.
referencedColumnName: The name of the primary key column in the referenced table (by default, it is assumed to be the primary key of the referenced table).
nullable: Specifies whether the foreign key column can contain null values (default is true).
unique: Specifies whether the foreign key column should be part of a unique constraint (default is false).

# fetch type

OneToMany: LAZY
ManyToOne: EAGER
ManyToMany: LAZY
OneToOne: EAGER