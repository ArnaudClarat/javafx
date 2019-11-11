/* Configuration du module
    Modifier le package selon vos besoins
 */
module javafx {
    //utilisation des modules de javafx
    requires javafx.controls;
    requires javafx.fxml;
    opens com.github.raylemon.javafx.controllers to javafx.fxml; //ouverture du package de notre application à fxml pour accéder aux fonctions de JavaFX.
    exports com.github.raylemon.javafx; //exportation du package.
}