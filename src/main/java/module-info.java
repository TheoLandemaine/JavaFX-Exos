module com.coding.javafxexos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.coding.javafxexos to javafx.fxml;
    exports com.coding.javafxexos;
}