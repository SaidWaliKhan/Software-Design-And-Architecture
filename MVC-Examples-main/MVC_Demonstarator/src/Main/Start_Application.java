package Main;

import Model.Data_Model;
import MVC_View.Data_View;
import MVC_Controller.Data_Controller;

public class Start_Application {
    public static void main(String[] args) {
        Data_Model model = new Data_Model(); 
        Data_View view = new Data_View();    
        Data_Controller controller = new Data_Controller(model, view); 

        controller.setData("Hello, MVC Pattern");
        controller.updateData();
    }
}
