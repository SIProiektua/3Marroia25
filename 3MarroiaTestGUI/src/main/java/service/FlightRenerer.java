package service;
import javax.swing.*;

import java.awt.*;

public class FlightRenerer extends DefaultListCellRenderer{
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean CellHasFocus){
        super.getListCellRendererComponent(list, value, index, isSelected, CellHasFocus);
        if(value instanceof ConcreteFlight){
           ConcreteFlight cf = (ConcreteFlight) value;
           setText(falseToString(cf));
        }
        return this;
    }
    
	private String falseToString(ConcreteFlight cf) {
		return  falseFlightToString((Flight) cf.getFlight())+  "-" + cf.getDate().getYear() + "/" + cf.getDate().getMonth() + "/" + cf.getDate().getDay() + "/" + cf.getDate().getHour() + ":" + cf.getDate().getMinute() + ":" + cf.getDate().getSecond() + "-->" + cf.getBussinesNumber() + "/"
                + cf.getFirstNumber() + "/" + cf.getTouristNumber();
	}

	private String falseFlightToString(Flight f) {
		return f.getFlightCode() + " " + f.getDepartingCity() + " " + f.getArrivingCity();
	}
}
