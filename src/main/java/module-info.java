/* Configuration du module
    Modifier le package selon vos besoins
 */
module javafx {
	//utilisation des modules de javafx
	requires javafx.controls;
	requires javafx.fxml;
	opens be.ifosupwavre.info.javafx.controllers to javafx.fxml; //ouverture du package de notre application à fxml pour accéder aux fonctions de JavaFX.
	exports be.ifosupwavre.info.javafx; //exportation du package.
}