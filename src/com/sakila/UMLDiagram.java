/*DIAGRAMA UML DE MANERA TEXTUAL:

 * Universidad Autónoma de Santo Domingo
 * Facultad de Ciencias - Escuela de Informática
 * Proyecto Sakila CRUD
 * Autor: YINET VALDEZ IBERT
 * Matricula: 100597131
 * Fecha: 10/12/2025
 *
 * Diagrama UML textual del sistema:
 *
 * +-------------------+
 * | <<interface>>     |
 * | iDatapost<T, K>   |
 * +-------------------+
 * | +get(K id)        |
 * | +getAll()         |
 * | +post(T entity)   |
 * | +put(K id, T e)   |
 * | +delete(K id)     |
 * +-------------------+
 *            ^
 *            |
 * +-----------------------------+
 * | <<abstract>>                |
 * | DataContext<T, K>           |
 * +-----------------------------+
 * | -dataStore: Map<K, T>       |
 * | -autoIncrement: int         |
 * | +get(K id)                  |
 * | +getAll()                   |
 * | +post(T entity)             |
 * | +put(K id, T entity)        |
 * | +delete(K id)               |
 * | #generatePrimaryKey(): K    |
 * | #setPrimaryKey(T, K): void  |
 * +-----------------------------+
 *            ^
 *            |
 * +-------------------+      +-------------------+      +-------------------+      +-------------------+
 * | FilmController    |      | ActorController   |      | CustomerController|      | RentalController  |
 * +-------------------+      +-------------------+      +-------------------+      +-------------------+
 * | (final)           |      | (final)           |      | (final)           |      | (final)           |
 * +-------------------+      +-------------------+      +-------------------+      +-------------------+
 *
 * +-------------------+      +-------------------+      +-------------------+      +-------------------+
 * | Film              |      | Actor             |      | Customer          |      | Rental            |
 * +-------------------+      +-------------------+      +-------------------+      +-------------------+
 * | -id: Integer      |      | -id: Integer      |      | -id: Integer      |      | -id: Integer      |
 * | -title: String    |      | -name: String     |      | -name: String     |      | -film: Film       |
 * | -year: int        |      +-------------------+      | -phone: String    |      | -customer: Cust.  |
 * | -genre: String    |                                 | -email: String    |      | -rentalDate: Date |
 * | -actors: List<Actor>                              +-------------------+      | -returnDate: Date |
 * +-------------------+                                                         +-------------------+
 *
 * Relaciones:
 * - Film tiene una lista de Actor (composición).
 * - Rental tiene una relación con Film y Customer (composición).
 */
package com.sakila;

public class UMLDiagram {

}
