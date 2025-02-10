/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Controller;

import MVC_View.Data_View;
import Model.Data_Model;

public class Data_Controller
{
    private Data_Model model;
    private Data_View view;

    public Data_Controller(Data_Model model, Data_View view) {
        this.model = model;
        this.view = view;
    }

    public void setData(String data) {
        model.setData(data);
    }

    public String getData() {
        return model.getData();
    }

    public void updateData() {
        view.printData(model.getData());
    }
}
 

