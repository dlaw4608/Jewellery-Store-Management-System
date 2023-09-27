module com.example.assignment1draft1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment1draft1 to javafx.fxml;
    exports com.example.assignment1draft1;
    exports com.example.assignment1draft1.ADT;
    opens com.example.assignment1draft1.ADT to javafx.fxml;
    exports com.example.assignment1draft1.Controllers;
    opens com.example.assignment1draft1.Controllers to javafx.fxml;
    exports com.example.assignment1draft1.Models;
    opens com.example.assignment1draft1.Models to javafx.fxml;
}