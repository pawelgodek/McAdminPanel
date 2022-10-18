module godek.pawel.mcadminpanel {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens godek.pawel.mcadminpanel to javafx.fxml;
    exports godek.pawel.mcadminpanel;
}