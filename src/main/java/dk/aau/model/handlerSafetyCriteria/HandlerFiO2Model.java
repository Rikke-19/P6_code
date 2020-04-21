package dk.aau.model.handlerSafetyCriteria;

import dk.aau.database.*;
//import dk.aau.model.person.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import dk.aau.*;

public class HandlerFiO2Model implements Queryable {

    @Override
    public void processResultSet(ResultSet rs) throws SQLException {
        while(rs.next()){
            String navn = rs.getString("SafetyCriteria");
            double value = rs.getDouble("Value");
            String time = rs.getString("Timestamp");
          //  BiomarkerInfo.bilirubin = value;
          //  BiomarkerInfo.bilirubinTime = time;
            System.out.println(navn);
            System.out.println(value);
            System.out.println(time);
        }
    }
    
    @Override
    public String returnSqlQuery() {
        String sqlStatement = "SELECT * FROM Result";// SafetyCriteria, Value, Timestamp FROM Result WHERE SafetyCriteria = 'FiO2' AND Timestamp = (SELECT MAX(Timestamp) FROM Result WHERE SafetyCriteria = 'FiO2' AND Timestamp BETWEEN "+"'"+App.previousDate+"' AND '"+ App.currentDate+"')";// AND CPRnumber="+Patient.getCprNummer();
        return sqlStatement;
    }
}