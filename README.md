# Spotizer

## Description du Projet

Ce projet a été développé dans le cadre d'un travail pratique (TP) pour le cours de programmation avancée en Java lors de la troisième année de la licence Sciences Pour l'Ingénieur (SPI). L'objectif principal est de concevoir une application simulant un système de gestion de musique incluant des fonctionnalités pour gérer des albums, des musiques, des artistes, et des utilisateurs avec leurs abonnements et facturations.

## Fonctionnalités

- **Gestion des Artistes** : Permet d'ajouter, modifier, et consulter des artistes.
- **Gestion des Musiques** : Permet de créer des musiques, de les associer à des artistes et des albums, et de gérer des détails comme le tempo, le genre, et le statut de publication.
- **Gestion des Albums** : Création et modification d'albums, ajout de musiques, et gestion des visuels associés.
- **Gestion des Utilisateurs et Abonnements** : Inscription et gestion des utilisateurs, gestion des types d'abonnements, et simulation de l'écoute de musiques.
- **Facturation** : Calcul automatique des factures basées sur l'écoute des musiques selon l'abonnement de l'utilisateur.

## Technologies Utilisées

- **Java** : Langage de programmation principal.
- **draw.io** : Utilisé pour la conception du modèle conceptuel de données (MCD).

## Structure du Projet

Le projet est structuré en plusieurs classes Java, chacune représentant une entité du domaine de l'application :
- `Artiste.java` : Gère les informations et les fonctions liées aux artistes.
- `Musique.java` : Représente les musiques avec toutes les caractéristiques pertinentes.
- `Album.java` : Encapsule les détails et la logique associée aux albums de musique.
- `Utilisateur.java` : Gère les utilisateurs et leur interaction avec l'application.
- `Abonnement.java` : Définit les différents types d'abonnements disponibles.
- `Facture.java` : Responsable de la création des factures basées sur l'utilisation du service par les utilisateurs.

## Comment Démarrer

1. **Installation de Java** : Assurez-vous que Java est correctement installé sur votre machine.
2. **Compilation du code** : Utilisez la commande `javac` pour compiler les fichiers `.java`.
3. **Exécution** : Lancez l'application en exécutant la classe principale avec `java NomDeLaClassePrincipale`.

## Auteurs

- [Frédéric Turcq-santucci](https://github.com/fturcq-santucci)
- [Stéphane Thiry](https://github.com/Stephanethr)

## Licence

Ce projet est sous licence MIT - voir le fichier `LICENSE` pour plus de détails.
