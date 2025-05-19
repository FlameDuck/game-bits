module com.cuddlefishgames.demo {
    requires static lombok;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.dataformat.yaml;
    requires io.vavr;
    requires org.fxyz3d.core;
    opens com.cuddlefishgames.demo to javafx.graphics;
    exports com.cuddlefishgames.demo;
}
