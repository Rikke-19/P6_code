package dk.aau;

import java.util.Scanner;

import dk.aau.model.SafetyCriteriaModel;

public class init {

    public static void GiveValues()
    {
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
                break;
                

                default:
                System.out.println("Vi burde ikke have været her. Et navn er skrevet forkert");
                break;
            }
        }
    }

    
    public static void InitSafetyCriteria()
    {
        //Sikkerhedskriterier instantieres
        //Kvantitative
        SafetyCriteriaModel laktat = new SafetyCriteriaModel("Laktat", "Cardiovascular", true);
        SafetyCriteriaModel.AddToListSc(laktat);
        SafetyCriteriaModel fiO2 = new SafetyCriteriaModel("FiO2", "Respiratory", true);
        SafetyCriteriaModel.AddToListSc(fiO2);
        SafetyCriteriaModel peep = new SafetyCriteriaModel("PEEP", "Respiratory", true);
        SafetyCriteriaModel.AddToListSc(peep);
        SafetyCriteriaModel rass = new SafetyCriteriaModel("RASS", "Neuro", true);
        SafetyCriteriaModel.AddToListSc(rass);
        SafetyCriteriaModel respRate = new SafetyCriteriaModel("Respiratory rate", "Respiratory", true);
        SafetyCriteriaModel.AddToListSc(respRate);
        SafetyCriteriaModel saO2 = new SafetyCriteriaModel("SaO2", "Respiratory", true);
        SafetyCriteriaModel.AddToListSc(saO2);
        SafetyCriteriaModel ventriRate = new SafetyCriteriaModel("Ventricular rate", "Cardiovascular", true);
        SafetyCriteriaModel.AddToListSc(ventriRate);
        //Kvalitative
        //Respiratory
        SafetyCriteriaModel endotrachealTube = new SafetyCriteriaModel("Endotracheal Tube", "Respiratory");
        SafetyCriteriaModel.AddToListSc(endotrachealTube);
        SafetyCriteriaModel tracheostomytube = new SafetyCriteriaModel("Tracheostomy Tube", "Respiratory");
        SafetyCriteriaModel.AddToListSc(tracheostomytube);
        SafetyCriteriaModel modeHFOV = new SafetyCriteriaModel("Mode HFOV", "Respiratory");
        SafetyCriteriaModel.AddToListSc(modeHFOV);
        SafetyCriteriaModel ventilatorDysynchrony = new SafetyCriteriaModel("Ventilator Dysynchrony", "Respiratory");
        SafetyCriteriaModel.AddToListSc(ventilatorDysynchrony);
        SafetyCriteriaModel nitricOxide = new SafetyCriteriaModel("Nitric Oxide", "Respiratory");
        SafetyCriteriaModel.AddToListSc(nitricOxide);
        SafetyCriteriaModel prostacyclin = new SafetyCriteriaModel("Prostacyclin", "Respiratory");
        SafetyCriteriaModel.AddToListSc(prostacyclin);
        SafetyCriteriaModel pronePositioning = new SafetyCriteriaModel("Prone Positioning", "Respiratory");
        SafetyCriteriaModel.AddToListSc(pronePositioning);
        //Cardiovascular
        
        SafetyCriteriaModel intravenousAntihypotensive = new SafetyCriteriaModel("Intravenous antihypotensive therapy for hypotensive emergency", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(intravenousAntihypotensive);
        SafetyCriteriaModel severepulmonaryHypertension = new SafetyCriteriaModel("Known or suspected severepulmonary hypertension", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(severepulmonaryHypertension);
        SafetyCriteriaModel bradycardiaReq = new SafetyCriteriaModel("Requiring pharmacological treatment (e.g. isoprenaline) or awaiting emergency pacemaker insertion", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(bradycardiaReq);
        SafetyCriteriaModel bradycardiaNotReq = new SafetyCriteriaModel("Not requiring pharmacological treatment and not awaiting emergency pacemaker insertion", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(bradycardiaNotReq);
        SafetyCriteriaModel dependentRhythm = new SafetyCriteriaModel("Dependent Rhythm", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(dependentRhythm);
        SafetyCriteriaModel stableUnderlyingRhythm = new SafetyCriteriaModel("Stable Underlying Rhythm", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(stableUnderlyingRhythm);
        SafetyCriteriaModel femoralIABP = new SafetyCriteriaModel("Femoral IABP", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(femoralIABP);
        SafetyCriteriaModel ecmoFemoralSubclavian = new SafetyCriteriaModel("Femoral or subclavian (not single bicaval dual lumen cannulae)", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(ecmoFemoralSubclavian);
        SafetyCriteriaModel ecmoSingleBicavalDualLumen = new SafetyCriteriaModel("Single bicaval dual lumen cannulae insertedinto a central vein", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(ecmoSingleBicavalDualLumen);
        SafetyCriteriaModel ventricularAssist = new SafetyCriteriaModel("Ventricular Assist Device", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(ventricularAssist);
        SafetyCriteriaModel pulmonaryArteryCatheter = new SafetyCriteriaModel("Pulmonary Artery Catheter or other continuous cardiac output monitoring device", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(pulmonaryArteryCatheter);
        SafetyCriteriaModel acuteDVT = new SafetyCriteriaModel("Known or suspected acute DVT/PE", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(acuteDVT);
        SafetyCriteriaModel severeAorticStenosis = new SafetyCriteriaModel("Known or suspected severe aortic stenosis", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(severeAorticStenosis);
        SafetyCriteriaModel cardiacischemia = new SafetyCriteriaModel("Cardiac ischemia (defined as ongoing chest pain and/or dynamic EKG changes)", "Cardiovascular");
        SafetyCriteriaModel.AddToListSc(cardiacischemia);
        // neurological
        SafetyCriteriaModel deltool = new SafetyCriteriaModel("Delirum tool -ve", "Neuro");
        SafetyCriteriaModel.AddToListSc(deltool);
        SafetyCriteriaModel deltoolcommands = new SafetyCriteriaModel("Delirium tool +ve and able to follow simple commmands", "Neuro");
        SafetyCriteriaModel.AddToListSc(deltoolcommands);
        SafetyCriteriaModel deltoolnocommands = new SafetyCriteriaModel("Delirium tool +ve and not able to follow simple commmands", "Neuro");
        SafetyCriteriaModel.AddToListSc(deltoolnocommands);
        SafetyCriteriaModel intercranialhypotenstion = new SafetyCriteriaModel("Active management of intracranial hypertension, with ICP not in desired range", "Neuro");
        SafetyCriteriaModel.AddToListSc(intercranialhypotenstion);
        SafetyCriteriaModel intercranialpressure = new SafetyCriteriaModel("Intracranial pressure monitoring without activemanagement of intracranial hypertension", "Neuro");
        SafetyCriteriaModel.AddToListSc(intercranialpressure);
        SafetyCriteriaModel craniectomy = new SafetyCriteriaModel("Craniectomy", "Neuro");
        SafetyCriteriaModel.AddToListSc(craniectomy);
        SafetyCriteriaModel openlumbar = new SafetyCriteriaModel("Open lumbar drain (not clamped)", "Neuro");
        SafetyCriteriaModel.AddToListSc(openlumbar);
        SafetyCriteriaModel subgalealdrain = new SafetyCriteriaModel("Subgaleal drain", "Neuro");
        SafetyCriteriaModel.AddToListSc(subgalealdrain);
        SafetyCriteriaModel spinalprecautions = new SafetyCriteriaModel("Spinal precautions (pre-clearence or fixation)", "Neuro");
        SafetyCriteriaModel.AddToListSc(spinalprecautions);
        SafetyCriteriaModel asci = new SafetyCriteriaModel("Acute spinal cord injury", "Neuro");
        SafetyCriteriaModel.AddToListSc(asci);
        SafetyCriteriaModel subaracheamorrhage = new SafetyCriteriaModel("Subarachnoid haemorrhage with unclipped aneurysm", "Neuro");
        SafetyCriteriaModel.AddToListSc(subaracheamorrhage);
        SafetyCriteriaModel vasospasm = new SafetyCriteriaModel("Vasospasm post-aneurysmal clipping", "Neuro");
        SafetyCriteriaModel.AddToListSc(vasospasm);
        SafetyCriteriaModel seizures = new SafetyCriteriaModel("Uncontrolled seizures", "Neuro");
        SafetyCriteriaModel.AddToListSc(seizures);
        // others
        SafetyCriteriaModel icuaw = new SafetyCriteriaModel("ICUAW", "Other");
        SafetyCriteriaModel.AddToListSc(icuaw);
        SafetyCriteriaModel renalreptherapy = new SafetyCriteriaModel("Renal Replacement Therapy", "Other");
        SafetyCriteriaModel.AddToListSc(renalreptherapy);
        SafetyCriteriaModel femroalcath = new SafetyCriteriaModel("Venous and arterial femoral catheters", "Other");
        SafetyCriteriaModel.AddToListSc(femroalcath);
        SafetyCriteriaModel remoralsheaths = new SafetyCriteriaModel("Femoral Sheats", "Other");
        SafetyCriteriaModel.AddToListSc(remoralsheaths);
        SafetyCriteriaModel otherdrains = new SafetyCriteriaModel("Other drains and attachements", "Other");
        SafetyCriteriaModel.AddToListSc(otherdrains);
        SafetyCriteriaModel uncontrolledbleeding = new SafetyCriteriaModel("Known uncontrolled active bleedeing", "Other");
        SafetyCriteriaModel.AddToListSc(uncontrolledbleeding);
        SafetyCriteriaModel suspbleeding = new SafetyCriteriaModel("Suspicion of active bleeding or increasedbleeding risk", "Other");
        SafetyCriteriaModel.AddToListSc(suspbleeding);
        SafetyCriteriaModel febrilewtemp = new SafetyCriteriaModel("Patient is febrile with a temperature exceedingacceptable maximum despite active physicalor pharmacological cooling mangagement", "Other");
        SafetyCriteriaModel.AddToListSc(febrilewtemp);
        SafetyCriteriaModel acticehypomanagement = new SafetyCriteriaModel("Active hypothermia management", "Other");
        SafetyCriteriaModel.AddToListSc(acticehypomanagement);
        SafetyCriteriaModel unstable = new SafetyCriteriaModel("Unstable/unstabilized major fracture (Pelvic, spinal, lower limp long bone)", "Other");
        SafetyCriteriaModel.AddToListSc(unstable);
        SafetyCriteriaModel openwound = new SafetyCriteriaModel("Large open wound (Chest/Sternum, abdomen)", "Other");
        SafetyCriteriaModel.AddToListSc(openwound);     
    }

}