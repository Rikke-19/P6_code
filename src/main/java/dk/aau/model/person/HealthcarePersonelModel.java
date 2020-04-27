package dk.aau.model.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dk.aau.model.SafetyCriteriaModel;

public class HealthcarePersonelModel {
    private String name;
    private double valueNumber;
    private boolean valueBool;
    
    // Oprettelse af lister samt initialisering af disse
    private static List<HealthcarePersonelModel> enteredResultsForSC = new ArrayList<HealthcarePersonelModel>();
    private static List<HealthcarePersonelModel> mapInterval = new ArrayList<HealthcarePersonelModel>();
    private static List<HealthcarePersonelModel> checkedSC = new ArrayList<HealthcarePersonelModel>();

    // Oprettet en constructer
    public HealthcarePersonelModel(String name, double valueNumber) {
        this.name = name;
        this.valueNumber = valueNumber;
    }

    public HealthcarePersonelModel(String name, boolean valueBool) {
        this.name = name;
        this.valueBool = valueBool;
    }

    // Liste håndtering
    public static void AddToListEnteredSC(HealthcarePersonelModel hp) {
        enteredResultsForSC.add(hp);
    }

	public static void AddToListMapInterval(HealthcarePersonelModel hp) {
        mapInterval.add(hp);
    }

    public static void AddToListCheckedSC(HealthcarePersonelModel hp) {
        checkedSC.add(hp);
    }

    // Getters og setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValueNumber() {
        return valueNumber;
    }

    public void setValueNumber(double valueNumber) {
        this.valueNumber = valueNumber;
    }

    public boolean isValueBool() {
        return valueBool;
    }

    public void setValueBool(boolean valueBool) {
        this.valueBool = valueBool;
    }

    public static List<HealthcarePersonelModel> getMapInterval() {
        return mapInterval;
    }



    //Metoder
    private void enterResultsForSC() {
        Scanner input = new Scanner(System.in);
    for(SafetyCriteriaModel sc : SafetyCriteriaModel.getScEPJ())
    {              
        
        System.out.print("Insert the value of ");
        boolean savedValue;
        switch (sc.getName()) {
            
            // case name
            case "Laktat":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") ||inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "FiO2":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") ||inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            
            break;
            
            case "PEEP":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "RASS":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Respiratory rate":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "SaO2":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Ventricular rate":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Endotracheal Tube":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;

            case "Any stable tachyarrhythmia":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") ||inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setStableTachy(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setStableTachy(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Tracheostomy Tube":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Mode HFOV":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Ventilator Dysynchrony":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Nitric Oxide":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Prostacyclin":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Prone Positioning":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;

            case "Is MAP causing symptoms":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setMAPCausingSymptoms(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No")) {
                                sc.setMAPCausingSymptoms(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;

            case "MAP level of support":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert low/moderate/high]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("low") || inputString.equals("Low")) {
                                sc.setLevelOfMAPSupport("Low");
                                savedValue = true;
                            } else if (inputString.equals("moderate") || inputString.equals("Moderate")) {
                                sc.setLevelOfMAPSupport("Moderate");
                                savedValue = true;
                            } else if (inputString.equals("high") || inputString.equals("High")){
                                sc.setLevelOfMAPSupport("High");
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Intravenous antihypotensive therapy for hypotensive emergency":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Known or suspected severepulmonary hypertension":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Requiring pharmacological treatment (e.g. isoprenaline) or awaiting emergency pacemaker insertion":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Not requiring pharmacological treatment and not awaiting emergency pacemaker insertion":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Dependent Rhythm":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Stable Underlying Rhythm":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Femoral IABP":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Femoral or subclavian (not single bicaval dual lumen cannulae)":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Single bicaval dual lumen cannulae insertedinto a central vein":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Ventricular Assist Device":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Pulmonary Artery Catheter or other continuous cardiac output monitoring device":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Known or suspected acute DVT/PE":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Known or suspected severe aortic stenosis":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Cardiac ischemia (defined as ongoing chest pain and/or dynamic EKG changes)":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Delirum tool -ve":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Delirium tool +ve and able to follow simple commmands":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Delirium tool +ve and not able to follow simple commmands":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Active management of intracranial hypertension, with ICP not in desired range":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Intracranial pressure monitoring without activemanagement of intracranial hypertension":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Craniectomy":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Open lumbar drain (not clamped)":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Subgaleal drain":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Spinal precautions (pre-clearence or fixation)":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Acute spinal cord injury":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Subarachnoid haemorrhage with unclipped aneurysm":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Vasospasm post-aneurysmal clipping":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Uncontrolled seizures":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "ICUAW":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Renal Replacement Therapy":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Venous and arterial femoral catheters":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Femoral Sheats":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Other drains and attachements":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Known uncontrolled active bleedeing":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Suspicion of active bleeding or increasedbleeding risk":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Patient is febrile with a temperature exceedingacceptable maximum despite active physicalor pharmacological cooling mangagement":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Active hypothermia management":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Unstable/unstabilized major fracture (Pelvic, spinal, lower limp long bone)":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            case "Large open wound (Chest/Sternum, abdomen)":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;

            case "MAP":
            System.out.print(sc.getName());
            savedValue = false;
            while(savedValue == false)
            {
                if (sc.getTakesNumber()) {
                    System.out.println(" [insert number]: ");
                    String inputString = input.nextLine();
                    try {
                        if (inputString == "exit" ||inputString == "Exit") {
                            savedValue = true;
                        } else
                        {  
                            sc.setValueNumber(Double.parseDouble(inputString));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                } else 
                {
                    if (sc.getTakesNumber()) {
                        System.out.println(" [insert number]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else
                            {  
                                sc.setValueNumber(Double.parseDouble(inputString));
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    } else 
                    {
                        System.out.println(" [insert yes/no]: ");
                        String inputString = input.nextLine();
                        try {
                            if (inputString.equals("exit") || inputString.equals("Exit")) {
                                savedValue = true;
                            } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                sc.setValueBool(true);
                                savedValue = true;
                            } else if (inputString.equals("no") || inputString.equals("No"))
                            {
                                sc.setValueBool(false);
                                savedValue = true;
                            } 
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
            break;
            
            
            default:
            System.out.println("Vi burde ikke have været her. Et navn er skrevet forkert");
            break;
        }
    }
    input.close();
    }

    private void enterMAPInterval() {
        Scanner input = new Scanner(System.in);
        boolean savedValue = false;
        boolean isMapMinSet = false;
        
        while (savedValue == false) {
            for(SafetyCriteriaModel sc : SafetyCriteriaModel.getScEPJ()) {
                if (sc.getName().equals("MAP") && sc.getTakesNumber() == true) {
                    System.out.println(" [Insert lower limit of the target range]: ");
                    String inputValueMin = input.nextLine();
                    try {
                        if (inputValueMin.equals("exit") || inputValueMin.equals("Exit")) {
                            isMapMinSet = true;
                            savedValue = true;
                        } else {
                            sc.setMapMin(Double.parseDouble(inputValueMin));
                            isMapMinSet = true;
                            
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                }
                if (sc.getName().equals("MAP") && sc.getTakesNumber() == true && isMapMinSet == true) {
                    System.out.println(" [Insert higher limit of the target range]: ");
                    String inputValueMax = input.nextLine();
                    try {
                        if (inputValueMax.equals("exit") || inputValueMax.equals("Exit")) {
                            savedValue = true;                       
                        } else {
                            sc.setMapMax(Double.parseDouble(inputValueMax));
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                }
            }
        }
        input.close();
    }

    private void checkSC() {

    }
    public static void setMapInterval(List<HealthcarePersonelModel> mapInterval) {
        HealthcarePersonelModel.mapInterval = mapInterval;
    }

    public static List<HealthcarePersonelModel> getEnteredResultsForSC() {
        return enteredResultsForSC;
    }

    public static void setEnteredResultsForSC(List<HealthcarePersonelModel> enteredResultsForSC) {
        HealthcarePersonelModel.enteredResultsForSC = enteredResultsForSC;
    }

    public static List<HealthcarePersonelModel> getCheckedSC() {
        return checkedSC;
    }

    public static void setCheckedSC(List<HealthcarePersonelModel> checkedSC) {
        HealthcarePersonelModel.checkedSC = checkedSC;
    }
}