module com.ent.umldesigner {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.fxmisc.richtext;
    requires antlr.runtime;

    opens com.ent.umldesigner.drawing to javafx.fxml;
    exports com.ent.umldesigner.drawing;
}