Introduction
Il sagit d'une application cote back utilisé dans le cadre d'un test d'entré chez modelsis dont l'objectif est d'implementer les fonctions d'ajout, d'update,de recherche de produits
depuis spring boot.

2)
 Le backend ,qui est ici, est developpé avec springBoot en sa version 2.7.0  et est  composé de controlleur ,de services ,de repository
 les dependances sont :spring web, spring data JPA
  Jdk:1.8
- le controleur communique avec les services de angular
 - les services sont des classes d'implementations de fonctions  que les controleurs vont appeler et reutiliser
 - les repository vont se charge de la persistence des donnees et d'acceder à la base de données 

3)
Pour executer le projet il faut le cloner en local ,se placer dans le dossier du projet 
 Il faut  l'ouvrir avec l'editeur Eclipse et faire un Run AS Spring Boot pour creer les tables dans la base de donnees 
 Mes tests sont effectues avec le SGBD Mysql mais il est possible de le faire avec PostgreSQL en decommentant la partie 
 commentée dans application properties.
 
 Si vous avez des problemes d'executions ,vous pouvez me faire part.
