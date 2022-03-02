module com.ent.umldesigner {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires antlr;

    opens com.ent.umldesigner to javafx.fxml;
    exports com.ent.umldesigner;
}