# 🚗 Projet Java – Gestion d'une Auto-École

## 📖 Description
Ce projet est un exercice complet de **programmation orientée objet (POO)** en Java.  
Il simule une petite application de gestion d'auto-école : ajout d'élèves, de moniteurs, de voitures et affichage des informations générales.

L’objectif est de **pratiquer les notions de base de la POO** :
- Classes, objets, instances  
- Héritage et classes abstraites  
- Encapsulation, getters/setters et `this`  
- Interface et polymorphisme  
- Variables et méthodes statiques  
- Collections (`ArrayList`)  

---

## 🧩 Structure du projet

```
src/
 ├── Personne.java         # Classe abstraite de base
 ├── Eleve.java            # Hérite de Personne
 ├── Moniteur.java         # Hérite de Personne
 ├── Roulable.java         # Interface (méthode demarrer)
 ├── Voiture.java          # Implémente Roulable, contient un compteur statique
 ├── AutoEcole.java        # Contient les collections de personnes et voitures
 └── Main.java             # Point d’entrée du programme
```

---

## ⚙️ Fonctionnalités

### 👤 Gestion des personnes
- `Personne` est une classe abstraite avec les attributs `nom` et `age`.
- `Eleve` et `Moniteur` héritent de `Personne` et définissent leur rôle respectif.
- Chaque personne peut afficher ses informations via `afficherInfo()`.

### 🚙 Gestion des voitures
- Chaque voiture possède un modèle (`modele`) et un **compteur statique** partagé.
- Méthode `demarrer()` (interface `Roulable`) qui affiche un message personnalisé.
- `Voiture.getCompteur()` permet de connaître le nombre total de voitures créées.

### 🏫 Auto-école
- La classe `AutoEcole` contient :
  - Une liste de `Personne` (élèves et moniteurs)
  - Une liste de `Voiture`
- Méthodes principales :
  - `ajouterPersonne(Personne p)`
  - `ajouterVoiture(Voiture v)`
  - `afficherTout()` → affiche tout le contenu de l’école

---

## ▶️ Exemple d’exécution

```bash
Auto-école : Permis+ Montréal
--- Personnes ---
Élève : Sami (19 ans)
Moniteur : Julie (34 ans)
--- Voitures ---
Toyota Yaris démarre...
Honda Civic démarre...
Total de voitures : 2
```

---

## 🧠 Concepts Java révisés

| Concept | Exemple |
|----------|----------|
| Classe & Objet | `new Eleve("Sami", 19, "Débutant")` |
| `this` | Utilisé dans les constructeurs et setters |
| Getters & Setters | Accès sécurisé aux attributs |
| Encapsulation | Attributs `private`, méthodes `public` |
| Classe abstraite | `Personne` |
| Héritage | `Eleve extends Personne` |
| Polymorphisme | `afficherInfo()` utilise `getRole()` |
| Interface | `Roulable` |
| Statique | `Voiture.getCompteur()` |
| Collection | `ArrayList<Personne>` et `ArrayList<Voiture>` |

---

## 🧪 Exécution

1. Compiler :
   ```bash
   javac *.java
   ```
2. Exécuter :
   ```bash
   java Main
   ```

---

## 📁 Auteur
**Massy Hamrouni.**  
Étudiant au baccalauréat en systèmes informatiques et électroniques – UQAM 

Cours : **INF1120 -- Programmation (Java) I & INF2120 – Programmation II (Java / suite)**  

---

## 🏷️ Licence
Projet académique libre – utilisation et modification autorisées à des fins d’apprentissage uniquement.
