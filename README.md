# Journal de développement de testWebFlux Project
- objectifs:    une API simple avec une seule entité au départ, pour se faire la main avec reactive programming
                packages by feature pour pouvoir ajouter des fonctionnalités sans trop toucher au package initial, qui, on croise les doigts, va fonctionner à merveille
                lier avec h2 database pour les tests
Pour plus de détails voir: https://www.baeldung.com/spring-webflux

# Mon premier essaie :
1) initialiser le projet avec les starters Reactive Web, Spring Security et Spring Data JPA (pour pouvoir implémenter les relations dans les projets plus complexes).
2) l'ouvrir dans un IDE ;-)
3) créer le RestController
4) créer le Repository (ici ReactiveWebRepository)
5) créer l'entité Employee
6) lancer l'application

J'ai eu l'erreur : Reactive Crud Repositories are not supported by JPA. BOOM.

# Recherches sur le net: 
h2 n'est pas une base de donnée réactive. Voici les solutions possibles: Cassandra, MongoDB, Couchbase, Redis.
La solution dans Hibernate ? https://hibernate.org/reactive/
