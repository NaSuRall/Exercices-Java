
# Liste des exercices à réaliser le mardi 28/01/2025 de manière individuelle



# Exercice 1 : Interface de calcul

### Objectif

- Découvrir comment définir et implémenter une interface en Java.
- Manipuler des classes concrètes qui la mettent en œuvre.

### Enoncé et consignes

- Créez une interface `Calculable` contenant une méthode `double calculer(double x, double y)`.
- Créez deux classes :
  1. `Addition` qui implémente `Calculable` pour effectuer une addition.
  2. `Multiplication` qui implémente `Calculable` pour effectuer une multiplication.
- Créez une classe principale (par exemple `MainCalcul`) qui teste le fonctionnement de ces classes.

### Etapes de réalisation

1. **Définition de l’interface** : Créez un fichier `Calculable.java` et déclarez la méthode `calculer`.
2. **Implémentation** :
   - Dans `Addition.java`, implémentez l’interface et retournez la somme de `x` et `y`.
   - Dans `Multiplication.java`, implémentez l’interface et retournez le produit de `x` et `y`.
3. **Test** :
   - Dans la classe `MainCalcul`, créez des instances de `Addition` et `Multiplication`.
   - Appelez la méthode `calculer` pour vérifier le résultat.

# Exercice 2 : Interface évoluée avec constantes

### Objectif

- Renforcer la compréhension des interfaces avec des variables `static final`.
- Continuer à pratiquer l’implémentation.

### Enoncé et consignes

- Dans l’interface `CalculableAvance`, définissez une constante `PI` et ajoutez une nouvelle méthode `calculerSurfaceCercle(double rayon)`.
- Implémentez cette interface dans une classe `Cercle`.
- Dans la classe principale, testez la méthode de calcul de la surface du cercle.

### Etapes de réalisation

1. **Création de l’interface** : Définissez `CalculableAvance` avec `PI = 3.14159` et la méthode `calculerSurfaceCercle`.
2. **Implémentation** : Dans `Cercle.java`, implémentez la méthode qui calcule la surface du cercle (`PI * rayon^2`).
3. **Test** : Dans la classe `MainCalculAvance`, instanciez `Cercle` et testez la surface pour un rayon donné.



# Exercice 3 Classe abstraite : forme géométrique

### Objectif

- Apprendre à définir et manipuler une classe abstraite qui sert de modèle générique.
- Implémenter des méthodes abstraites et concrètes.

### Enoncé et consignes

- Créez une classe abstraite `Forme` avec :
  - Une méthode abstraite `double calculerSurface()`.
  - Une méthode concrète `void afficherSurface()` qui affiche la surface via `calculerSurface()`.
- Créez deux classes concrètes : `Rectangle` et `Cercle`, qui héritent de `Forme`.
- Testez le tout dans une classe principale.

### Etapes de réalisation

1. **Classe abstraite** : Dans `Forme.java`, implémentez la structure ci-dessus.
2. **Classes filles** :
   - `Rectangle` possède des attributs `longueur` et `largeur`.
   - `Cercle` possède un attribut `rayon`.
   - Implémentez la méthode `calculerSurface()` pour chaque classe.
3. **Test** : Créez une classe `MainForme` où vous déclarez un tableau de `Forme` et où vous invoquez `afficherSurface()` sur chaque instance.



# Exercice 4 Polymorphisme : gestion de véhicules

### Objectif

- Mettre en pratique le polymorphisme à travers l’héritage et l’appel de méthodes.
- Comprendre comment utiliser une référence de type parent pour accéder à des objets enfant.

### Enoncé et consignes

- Créez une classe parent abstraite `Vehicule` avec une méthode abstraite `demarrer()`.
- Créez deux classes filles : `Voiture` et `Moto`.
- Créez une méthode concrète `arreter()` dans `Vehicule` et faites-en usage dans les classes filles.
- Dans une classe principale, déclarez un tableau de `Vehicule` pour invoquer `demarrer()` et `arreter()`.

### Etapes de réalisation

1. **Classe abstraite** : `Vehicule` définit les attributs communs (ex. `marque`) et la méthode abstraite `demarrer()`.
2. **Classes filles** :
   - `Voiture` : implémente `demarrer()` (ex. imprime un message spécifique).       
   - `Moto` : implémente `demarrer()` (message spécifique).
3. **Test** : Dans `MainVehicule`, créez un tableau `Vehicule[]` qui contient des `Voiture` et des `Moto`, et appelez les méthodes en boucle.





# Exercice 5 Composition : maison et pièces

### Objectif

- Comprendre la différence entre composition et agrégation (exemples concrets à venir).
- Mettre en place une relation de composition où un objet "contient" d’autres objets.

### Enoncé et consignes

- Créez une classe `Piece` avec un attribut `nom` (ex. “chambre”, “cuisine”, etc.).
- Créez une classe `Maison` qui **contient** un tableau ou une liste de `Piece`.
- Dans `Maison`, prévoyez une méthode pour lister toutes les pièces et leur nom.
- Dans une classe `MainMaison`, créez une maison avec plusieurs pièces et affichez-les.

### Etapes de réalisation

1. **Classe `Piece`** : simple, avec un constructeur pour définir le `nom`.
2. **Classe `Maison`** : possède un `List<Piece>` ou un tableau de `Piece`.
3. **Gestion des pièces** : ajoutez une méthode dans `Maison` pour ajouter des pièces.
4. **Affichage** : implémentez la méthode pour lister les pièces.
5. **Test** : Dans `MainMaison`, construisez l’objet `Maison`, ajoutez des `Piece`, et testez l’affichage.



# Exercice 6 Agrégation : université et étudiants

### Objectif

- Illustrer une relation d’agrégation où un objet fait référence à un autre objet, sans en être propriétaire exclusif.
- Gérer la distinction avec la composition (l’objet agrégé peut exister sans l’objet agrégateur).

### Enoncé et consignes

- Créez une classe `Etudiant` avec des attributs `nom` et `prenom`.
- Créez une classe `Universite` qui contient une liste d’`Etudiant`.
  - Il s’agit d’une agrégation, car un `Etudiant` peut exister hors de l’université (changement d’université, etc.).
- Dans `MainUniversite`, démontrez l’ajout/suppression d’un étudiant dans l’université.

### Etapes de réalisation

1. **Classe `Etudiant`** : simple POJO avec constructeurs/getters/setters.
2. **Classe `Universite`** : contient une `List<Etudiant>` + méthodes d’ajout et de suppression.
3. **Manipulations** : créez des étudiants et assignez-les à une université.
4. **Test** : vérifiez que si un étudiant n’est plus dans `Universite`, il peut encore exister en dehors (vous pouvez juste le stocker dans une variable en dehors).



# Exercice 7  Interface et classe abstraite : appareils électriques

### Objectif

- Mixer utilisation d’interfaces et de classes abstraites.
- Mettre en œuvre des méthodes communes et spécifiques.

### Enoncé et consignes

- Créez une interface `Connectable` avec une méthode `connecter()`.
- Créez une classe abstraite `AppareilElectrique` avec un attribut `puissance` et une méthode `allumer()`.
- Créez deux classes `Television` et `Ordinateur` qui héritent de `AppareilElectrique` et implémentent `Connectable`.
- Testez dans un `MainAppareils`.

### Etapes de réalisation

1. **Interface** : dans `Connectable.java`, déclarez `void connecter()`.
2. **Classe abstraite** : `AppareilElectrique` avec `int puissance`, un constructeur, et une méthode `allumer()`.
3. **Implémentation** :
   - `Television` et `Ordinateur` héritent de `AppareilElectrique`.
   - Elles implémentent `connecter()` (ex. message “Connexion de la TV” ou “Connexion de l’ordi”).
   - Elles redéfinissent si besoin `allumer()`.
4. **Test** : Dans la classe `MainAppareils`, déclarez un tableau mixte d’`AppareilElectrique`. Utilisez le polymorphisme pour appeler `allumer()` et l’interface pour `connecter()`.







# Exercice 8 Polymorphisme avancé : gestion d’animaux

### Objectif

- Approfondir le polymorphisme en manipulant des méthodes redéfinies.
- Observer la distinction entre la signature parent et enfant.

### Enoncé et consignes

- Créez une classe abstraite `Animal` avec une méthode abstraite `emettreSon()`.
- Implémentez des classes concrètes : `Chat`, `Chien`, `Vache`.
- Dans une classe `Ferme`, gérez un tableau (ou une `List`) d’`Animal`.
- Chaque animal doit pouvoir “parler” (via `emettreSon()`).
- Ajoutez une interface `Mammifere` avec une méthode `allaiter()` facultative pour un ou deux animaux (ex. vache).

### Etapes de réalisation

1. **Classe abstraite `Animal`** : définir `emettreSon()`.
2. **Interface `Mammifere`** : définir `allaiter()`.
3. **Classes concrètes** : `Chat`, `Chien`, `Vache`.
   - `Chat` et `Chien` sont simplement `Animal`.
   - `Vache` implémente aussi `Mammifere`.
4. **Test** : Dans `MainFerme`, créez un tableau `Animal[]` et appelez `emettreSon()` pour chacun. Pour la `Vache`, appelez également `allaiter()`.





# Exercice 9 Composition et Polymorphisme : un zoo

### Objectif

- Allier composition (un Zoo contient des Enclos qui contiennent des Animaux) et polymorphisme (différents types d’animaux).

### Enoncé et consignes

- Reprenez l’exemple d’animaux (ou créez-en de nouveaux : `Lion`, `Zebre`…) héritant d’une classe `Animal`.
- Créez une classe `Enclos` qui contient une liste d’`Animal`.
- Créez une classe `Zoo` qui contient plusieurs `Enclos`.
- Dans `MainZoo`, on peut créer un zoo, ajouter quelques enclos, y mettre des animaux, et faire émettre le son de tous les animaux par enclos ou par zoo.

### Etapes de réalisation

1. **Classe `Animal`** : déjà faite si vous reprenez l’exercice précédent, sinon créez une version simplifiée.
2. **Classe `Enclos`** : contient un `List<Animal>` et des méthodes pour gérer les animaux.
3. **Classe `Zoo`** : contient un `List<Enclos>`.
4. **Test** : dans `MainZoo`, ajoutez un enclos “Safari” et un enclos “Reptiles”, etc. Affichez la liste des animaux et leurs sons.

# Exercice 10 Projet final : bibliothèque multimédia (interfaces + classes abstraites + composition)

### Objectif

- Mettre en pratique l’ensemble des concepts (interface, classe abstraite, polymorphisme, composition/agrégation).
- Organiser un mini-système d’inventaire de ressources multimédia dans une bibliothèque.

### Enoncé et consignes

- Créez une classe abstraite `Ressource` avec :
  - Un attribut `titre`.
  - Une méthode abstraite `afficherInfos()`.
- Créez deux interfaces : `Empruntable` (méthodes `emprunter()`, `rendre()`) et `ConsultableSurPlace` (méthode `consulterSurPlace()`).
- Créez des classes concrètes : `Livre`, `CD`, `OrdinateurEnLibreAcces`.
  - `Livre` et `CD` héritent de `Ressource` et implémentent `Empruntable`.
  - `OrdinateurEnLibreAcces` hérite de `Ressource` et implémente `ConsultableSurPlace`.
- Créez une classe `Bibliotheque` qui contient une liste de `Ressource`.
  - Proposez des méthodes pour ajouter/supprimer une ressource et pour lister toutes les ressources.
- Dans `MainBibliotheque`, testez l’emprunt, le retour et la consultation sur place.

### Etapes de réalisation

1. **Classe abstraite `Ressource`** : définit `titre` et la méthode abstraite `afficherInfos()`.
2. **Interfaces** :
   - `Empruntable` (avec `emprunter()` et `rendre()`).
   - `ConsultableSurPlace` (avec `consulterSurPlace()`).
3. **Classes concrètes** :
   - `Livre` et `CD` : implémentent `Empruntable`, donc ils doivent définir `emprunter()` et `rendre()`.
   - `OrdinateurEnLibreAcces` : implémente `ConsultableSurPlace`.
4. **Classe `Bibliotheque`** : contient une `List<Ressource>`, avec des méthodes `ajouterRessource(Ressource r)`, `supprimerRessource(Ressource r)`, etc.
5. **Test** : dans `MainBibliotheque`, vérifiez le comportement : emprunter un livre, le rendre, consulter un ordinateur sur place, etc.
