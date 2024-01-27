module com.cuddlefishgames.demo {
    requires static lombok;
    requires javafx.controls;
    requires java.desktop;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.dataformat.yaml;
    requires io.vavr;
    opens com.cuddlefishgames.demo to javafx.graphics;
    exports com.cuddlefishgames.demo;
}
