/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

import auth.Auth.course;
import auth.Auth.equiv;
import java.util.ArrayList;
import javax.swing.JScrollPane;

/**
 *
 * @author pontios
 */
public class DegreeAudit extends javax.swing.JDialog {

    static ArrayList<course> core,mathMinor,csElectives,engElectives, oralElectives,
                             singleClassElectives, languagesElectives, theoElectives,
                             philoElectives, humElectives, fineArtsElectives, scienceElectives,
                             mathSuggested;
    static ArrayList<course> coreTaken,mathMinorTaken,scienceElectivesTaken,mathSuggestedTaken;
    static ArrayList<course> validCore = new ArrayList<course>();
    static ArrayList<equiv> equivalences = new ArrayList();
    
    
    public void printArrayList(ArrayList<course> c)
    {
        for (int i=0;i<c.size();i++)
        {
            c.get(i).print();
            System.out.println();
        }
    }
    public ArrayList<course> createMathMinor()
    {
        ArrayList<course> c = new ArrayList();
        c.add(new course("MAT","211","","Calculus I","","4",""));
        c.add(new course("MAT","212","","Calculus II","","4",""));
        c.add(new course("MAT","253","","Discrete Mathematics I","","3",""));
        c.add(new course("MAT","354","","Discrete Mathematics II","","3",""));
        c.add(new course("MAT","356","","Statistics for Science","","3",""));
        return c;
    }
    public ArrayList<course> createMathSuggested()
    {
        ArrayList<course> c = new ArrayList();
        c.add(new course("MAT","213","","Calculus III","","4",""));
        c.add(new course("MAT","314","","Differential Equations","","4",""));
        c.add(new course("MAT","332","","Linear Algebra","","3",""));
        c.add(new course("MAT","374","","Theory of Computation","","3",""));
        c.add(new course("MAT","451","","Probability Theory","","3",""));
        c.add(new course("MAT","452","","Mathematical Statistics","","3",""));
        c.add(new course("MAT","456","","Numerical Analysis","","3",""));
        return c;
    }
    public ArrayList<course> createCSElectives()
    {
        ArrayList<course> c = new ArrayList();
        c.add(new course("CS","328","","Unix and System Concepts","","3",""));
        c.add(new course("CS","338","","Web Design, Authoring, and Publishing","","3",""));
        c.add(new course("CS","341","","Interactive Multimedia Systems","","3",""));
        c.add(new course("CS","428","","Object-Oriented Design and Software Development","","3",""));
        c.add(new course("CS","437","","Computer Graphics","","3",""));
        c.add(new course("CS","438","","Statistics for Science","","3",""));
        c.add(new course("CS","453","","Artificial Intelligence","","3",""));
        c.add(new course("CS","454","","Robotics","","3",""));
        c.add(new course("CS","456","","Introduction to Expert Systems","","3",""));
        c.add(new course("CS","473","","Network Programming","","3",""));
        c.add(new course("CS","478","","Applied Cryptography","","3",""));
        return c;
    }
    public ArrayList<course> createCore()
    {
        ArrayList<course> c = new ArrayList();
        c.add(new course("CS","231","","Computer Science I","","4",""));
        c.add(new course("CS","232","","Computer Science II","","4",""));
        c.add(new course("CS","311","","Assembly Language","","3",""));
        c.add(new course("CS","331","","Data Structures & Algorithms","","3",""));
        c.add(new course("CS","332","","Computer Hardware Organization","","3",""));
        c.add(new course("CS","372","","Software Engineering","","3",""));
        c.add(new course("CS","413","","Operating Systems","","3",""));
        c.add(new course("CS","414","","Computer Architecture","","3",""));
        c.add(new course("CS","426","","Databases","","3",""));
        c.add(new course("CS","431","","Concepts of Programming Languages","","3",""));
        c.add(new course("CS","471","","Computer Networks","","3",""));
        c.add(new course("CS","477","","Computer Security","","3",""));
        c.add(new course("CS","487","","Seminar","","1",""));
        return c;
    }
    public ArrayList<equiv> createEquivalences()
    {
        //Array list that will hold the cs equivalences
        ArrayList<equiv> eqv = new ArrayList<equiv>();
        
        //Array list that will hold the courses that can replace CS 412
        ArrayList<course> ac = new ArrayList<course>();
        //Adds CS 311 and 414 into the list that designates CS 412's equivalent courses
        ac.add(new course("CS", "414"));
        ac.add(new course("CS", "311"));
        
        //Adds CS 412 and a list of its equivalences to the equiv array list
        eqv.add(new equiv(new course("CS", "412"), ac));
        
        //Array list that will hold the courses that can replace CS 471
        ac = new ArrayList<course>();
        ac.add(new course("CS", "471"));
        eqv.add(new equiv(new course("CS", "440"), ac));
        
        //Array list that will hold the courses that can replace CS 426
        ac = new ArrayList<course>();
        ac.add(new course("CS", "426"));
        eqv.add(new equiv(new course("CS", "306"), ac));
        
        //Array list that will hold the courses that can replace CS 413 and 414
        ac = new ArrayList<course>();
        ac.add(new course("CS", "413"));
        eqv.add(new equiv(new course("CS", "406"), ac));
        
        //Array list that will hold the courses that can replace PHY 201
        ac = new ArrayList<course>();
        ac.add(new course("PHY", "201"));
        eqv.add(new equiv(new course("PHY", "211"), ac));
        
        //Array list that will hold the courses that can replace PHY 201L
        ac = new ArrayList<course>();
        ac.add(new course("PHY", "201L"));
        eqv.add(new equiv(new course("PHY", "211L"), ac));
        
        //Array list that will hold the courses that can replace PHY 202
        ac = new ArrayList<course>();
        ac.add(new course("PHY", "202"));
        eqv.add(new equiv(new course("PHY", "212"), ac));
        
        //Array list that will hold the courses that can replace PHY 202L
        ac = new ArrayList<course>();
        ac.add(new course("PHY", "202L"));
        eqv.add(new equiv(new course("PHY", "212L"), ac));
        
        //Array list that will hold the courses that can replace CS 231
        ac = new ArrayList<course>();
        ac.add(new course("CS", "231"));
        eqv.add(new equiv(new course("CS", "211"), ac));
        
        //Array list that will hold the courses that can replace CS 232
        ac = new ArrayList<course>();
        ac.add(new course("CS", "232"));
        eqv.add(new equiv(new course("CS", "212"), ac));

        return eqv;
    }
    public ArrayList<course> createRemainingCSCore()
    {
        ArrayList<course> c = createCore();
        
        for(course current: validCore){
            for(int i = 0; i < c.size(); i++)
            {
                if(current.prefixNum().equals(c.get(i).prefixNum())){
                    c.remove(i); break;
                }
            }
        }
        return c;
    }
    public ArrayList<course> createEnglishElectives()
    {
        ArrayList<course> c = new ArrayList<course>();

        c.add(new course("ENG", "111", "","FIRST YEAR COMP/LIT","","3","" ));
        c.add(new course("ENG", "112", "","TECHNIQUES OF RESEARCH","","3","" ));
        c.add(new course("ENG", "199", "","HONORS SPECIAL TOPICS","","3","" ));
        c.add(new course("ENG", "210", "","WRITING ABOUT LITERATURE","","3","" ));

        return c;
    }
    public ArrayList<course> createOralElectives()
    {
        ArrayList<course> c = new ArrayList<course>();

        c.add(new course("SPE", "101", "","FUNDAMENTALS OF SPEECH","","3","" ));
        c.add(new course("COM", "104", "","INTERPERSONAL COMMUNICATION","","3","" ));

        return c;
    }
    public static ArrayList<course> createSingleClassElectives()
    {
        ArrayList<course> c = new ArrayList<course>();

        c.add(new course("HIS", "150", "","THE MEANING OF HISTORY","","3","" ));
        c.add(new course("SOC", "200", "","PRSPTV CNSCNS & SOC JSTC","","3","" ));
        c.add(new course("PSY", "281", "","INTRO TO PSYCHOLOGY","","3","" ));
        c.add(new course("POS", "201", "","AMERICAN GOVERNMENT","","3","" ));

        return c;
    }
    public ArrayList<course> createLanguagesElectives()
    {
        ArrayList<course> c = new ArrayList<course>();

        c.add(new course("FRE", "101", "","Elementary French I","","3","" ));
        c.add(new course("FRE", "102", "","Elementary French II","","3","" ));
        c.add(new course("FRE", "203", "","Intermediate French I","","3","" ));
        c.add(new course("FRE", "204", "","Intermediate French II","","3","" ));
        c.add(new course("FRE", "250", "","Conversation and Composition","","3","" ));

        c.add(new course("SPA", "101", "","Elementary Spanish I","","3","" ));
        c.add(new course("SPA", "102", "","Elementary Spanish II","","3","" ));
        c.add(new course("SPA", "203", "","Intermediate Spanish I","","3","" ));
        c.add(new course("SPA", "204", "","Intermediate Spanish II","","3","" ));

        return c;
    }
    public ArrayList<course> createTheoElectives()
    {
        ArrayList<course> c = new ArrayList<course>();
        c.add(new course("THE", "191", "","JUDEO-CHRISTIAN DOCTRINE","","3","" ));
        c.add(new course("THE", "201", "","THEOLOGY: FAITH, BELIEFS AND TRADITIONS","","3","" ));
        c.add(new course("THE", "300", "","SPECIAL TOPICS","","3","" ));
        c.add(new course("THE", "303", "","COMPARATIVE RELIGION","","3","" ));
        c.add(new course("THE", "304", "","THEOLOGY THROUGH FILM","","3","" ));
        c.add(new course("THE", "306", "","DYNAMICS OF FAITH, BELIEFS, AND THEOLOGY","","3","" ));
        c.add(new course("THE", "307", "","CHRISTOLOGY","","3","" ));
        c.add(new course("THE", "309", "","THE OLD TESTAMENT AND ITS INTERPRETERS","","3","" ));
        c.add(new course("THE", "311", "","SEXUALITY, SEX, AND MORALITY","","3","" ));
        c.add(new course("THE", "312", "","FREEDOM AND VIRTUE","","3","" ));
        c.add(new course("THE", "315", "","CHRISTIAN SPIRITUALITY AND PRAYER","","3","" ));
        c.add(new course("THE", "321", "","THE NEW TESTAMENT AS CHRISTIAN SCRIPTURE","","3","" ));
        c.add(new course("THE", "324", "","THE CATHOLIC IMAGINATION IN FILM","","3","" ));
        c.add(new course("THE", "325", "","FEMINIST PERSPECTIVES IN ETHICS","","3","" ));
        c.add(new course("THE", "327", "","PEACE AND JUSTICE","","3","" ));
        c.add(new course("THE", "330", "","APPROACHES TO GOD","","3","" ));
        c.add(new course("THE", "331", "","CHRISTIANITY AND CULTURE","","3","" ));
        c.add(new course("THE", "333", "","CHRISTIAN UNDERSTANDING OF GOD","","3","" ));
        c.add(new course("THE", "334", "","HISTORY OF CHRISTIANITY I","","3","" ));
        c.add(new course("THE", "335", "","HISTORY OF CHRISTIANITY II","","3","" ));
        c.add(new course("THE", "338", "","THE CHURCH","","3","" ));
        c.add(new course("THE", "342", "","SALVATION, LIBERATION, AND POLITICS","","3","" ));
        c.add(new course("THE", "344", "","SACRAMENTS","","3","" ));
        c.add(new course("THE", "345", "","LITURGY, FEASTS, AND DEVOTIONS TOPICS","","3","" ));
        c.add(new course("THE", "353", "","BIOETHICS","","3","" ));
        c.add(new course("THE", "360", "","Women IN THE CHURCH","","3","" ));
        c.add(new course("THE", "362", "","WOMEN IN THE NEW TESTAMENT","","3","" ));
        return c;
    }
    public ArrayList<course> createPhiloElectives()
    {
        ArrayList<course> c = new ArrayList<course>();
        
        c.add(new course("PHI", "191", "","JUDEO-CHRISTIAN DOCTRINE","","3","" ));
        c.add(new course("PHI", "220", "","INTRO TO PHILOSOPHY","","3","" ));
        c.add(new course("PHI", "300", "","SPECIAL TOPICS","","3","" ));
        c.add(new course("PHI", "302", "","SPANISH AND HISPANIC-AMERICAN PHILOSOPHERS","","3","" ));
        c.add(new course("PHI", "304", "","EPISTEMOLOGY","","3","" ));
        c.add(new course("PHI", "305", "","PROBLEMS IN PHILOSOPHY","","3","" ));
        c.add(new course("PHI", "306", "","PHILOSOPHY OF GOD AND RELIGION","","3","" ));
        c.add(new course("PHI", "308", "","PHILOSOPHY OF LAW","","3","" ));
        c.add(new course("PHI", "310", "","FORMAL LOGIC","","3","" ));
        c.add(new course("PHI", "313", "","PHILOSOPHY OF ART-AESTHETICS","","3","" ));
        c.add(new course("PHI", "314", "","METAPHYSICS","","3","" ));
        c.add(new course("PHI", "316", "","ANCIENT PHILOSOPHY","","3","" ));
        c.add(new course("PHI", "317", "","MEDIEVAL PHILOSOPHY","","3","" ));
        c.add(new course("PHI", "318", "","MODERN PHILOSOPHY","","3","" ));
        c.add(new course("PHI", "319", "","CONTEMPORARY PHILOSOPHY","","3","" ));
        c.add(new course("PHI", "320", "","AMERICAN PHILOSOPHERS","","3","" ));
        c.add(new course("PHI", "321", "","PHILOSOPHY OF PEACE AND WAR","","3","" ));
        c.add(new course("PHI", "323", "","PHILOSOPHICAL PERSPECTIVES ON CINEMA","","3","" ));
        c.add(new course("PHI", "332", "","THE THOUGHT OF ORTEGA Y GASSET","","3","" ));
        c.add(new course("PHI", "336", "","JULIAN MARIAS AND THE SCHOOL OF MADRID","","3","" ));
        c.add(new course("PHI", "353", "","BIO-MEDICAL ETHICS","","3","" ));
        c.add(new course("PHI", "354", "","ENVIRONMENTAL ETHICS","","3","" ));
        c.add(new course("PHI", "355", "","PHILOSOPHY OF POLITICS","","3","" ));
        c.add(new course("PHI", "360", "","ASIAN PHILOSOPHY","","3","" ));
        c.add(new course("PHI", "365", "","ADVANCED ARGUMENT ANALYSIS","","3","" ));

        return c;
    }
    public ArrayList<course> createHumLitElectives()
    {
        ArrayList<course> c = new ArrayList<course>();
        
        c.add(new course("HUM", "396", "", "Cultural Studies Special Topics", "", "3", ""));
        c.add(new course("HUM", "397", "", "Ethnic Studies Special Topics", "", "3", ""));
        c.add(new course("HUM", "398", "", "Gender Studies Special Topics", "", "3", ""));
        c.add(new course("HUM", "399", "", "Genre Studies Special Topics", "", "3", ""));
        
        c.add(new course("ENG", "315", "", "The Novel", "", "3", ""));
        c.add(new course("ENG", "316", "", "World Literacy Masterpieces", "", "3", ""));
        c.add(new course("ENG", "336", "", "Latino/a Literature", "", "3", ""));
        c.add(new course("ENG", "340", "", "Women and Literature", "", "3", ""));
        c.add(new course("ENG", "348", "", "Caribbean Literature", "", "3", ""));
        c.add(new course("ENG", "419", "", "Literature and Film", "", "3", ""));
        c.add(new course("ENG", "429", "", "English Studies", "", "3", ""));
        c.add(new course("FRE", "379", "", "Culture and Civilization", "", "3", ""));
        c.add(new course("FRE", "380", "", "Contemporary Culture and Civilization", "", "3", ""));
        c.add(new course("SPA", "333", "", "Spanish Culture", "", "3", ""));
        c.add(new course("SPA", "335", "", "Hispanic American Culture", "", "3", ""));
        c.add(new course("SPA", "447", "", "Contemporary Hispanic American Fiction", "", "3", ""));
        
        return c;
    }
    public ArrayList<course> createFineArtsElectives()
    {
        ArrayList<course> c = new ArrayList<course>();
        
        c.add(new course("ART", "101A", "", "BASIC DRAWING", "", "3", ""));
        c.add(new course("ART", "114", "", "ART APPRECIATION", "", "3", ""));
        c.add(new course("ART", "141", "", "BASIC HANDBUILDING", "", "3", ""));
        c.add(new course("ART", "205", "", "GRAPHIC DESIGN METHODS AND MATERIALS", "", "3", ""));
        c.add(new course("ART", "241", "", "BASIC POTTER'S WHEEL", "", "3", ""));
        c.add(new course("ART", "260", "", "BASIC PAINTING I", "", "3", ""));
        c.add(new course("ART", "319", "", "HISTORY OF WESTERN ART I", "", "3", ""));
        c.add(new course("ART", "320", "", "HISTORY OF ART II", "", "3", ""));
        c.add(new course("ART", "329", "", "ART HISTORY I: WORLD ART TO 1400", "", "3", ""));
        c.add(new course("ART", "330", "", "ART HISTORY II: WORLD ART SINCE 1400", "", "3", ""));
        
        c.add(new course("DAN", "104", "", "DANCE APPRECIATION", "", "3", ""));
        c.add(new course("DAN", "110", "", "MODERN/JAZZ 1", "", "3", ""));
        c.add(new course("DAN", "119", "", "LATIN DANCE I", "", "3", ""));
        c.add(new course("DAN", "219", "", "LATIN DANCE II", "", "3", ""));
        
        c.add(new course("MUS", "108", "", "LISTENING TO MUSIC", "", "3", ""));
        c.add(new course("MUS", "123", "", "APPLIED MUSIC", "", "3", ""));
        c.add(new course("MUS", "126", "", "APPLIED MUSIC", "", "3", ""));
        c.add(new course("MUS", "186", "", "MUSIC ENSEMBLE", "", "3", ""));
        c.add(new course("MUS", "386", "", "MUSIC ENSEMBLE", "", "3", ""));
        
        c.add(new course("PHO", "173", "", "BASIC CAMERA", "", "3", ""));
        c.add(new course("PHO", "203", "", "BASIC PHOTOGRAPHY", "", "3", ""));
        c.add(new course("PHO", "206", "", "DIGITAL PHOTOGRAPHY I", "", "3", ""));
        c.add(new course("PHO", "305", "", "COMPUTING IMAGING I", "", "3", ""));
        c.add(new course("PHO", "403", "", "COMPUTING IMAGING I", "", "3", ""));
        
        c.add(new course("TH", "100", "", "INTRODUCTION TO THEATRE", "", "3", ""));
        c.add(new course("TH", "155", "", "ACTING I", "", "3", ""));
        c.add(new course("TH", "100", "", "S/T: THEATRE OF SOUTHERN AFRICA", "", "3", ""));

        return c;
    }
    public ArrayList<course> createScienceElectives()
    {
        ArrayList<course> c = new ArrayList<course>();
        
        c.add(new course("PHY", "201", "", "GENERAL COLLEGE PHYSICS I", "", "3", ""));
        c.add(new course("PHY", "201L", "", "GENERAL COLLEGE PHYSICS LAB", "", "1", ""));
        c.add(new course("PHY", "202", "", "GENERAL COLLEGE PHYSICS II", "", "3", ""));
        c.add(new course("PHY", "202L", "", "GENERAL COLLEGE PHYSICS II LAB", "", "1", ""));
        //c.add(new course("PHY", "211", "", "UNIVERSITY PHYSICS I", "", "3", ""));
        //c.add(new course("PHY", "211L", "", "UNIVERSITY PHYSICS LAB", "", "1", ""));
        //c.add(new course("PHY", "212", "", "UNIVERSITY PHYSICS II", "", "3", ""));
        //c.add(new course("PHY", "212L", "", "UNIVERSITY PHYSICS II LAB", "", "1", ""));

        return c;
    }
    public boolean containsCourse(ArrayList<course> c, String prefix, String num)
    {
        boolean con = false;
        for (int i=0;i<c.size();i++)
        {
            if ((c.get(i).prefix.contentEquals(prefix))&&(c.get(i).number.contentEquals(num)))
            {
                con = true;
                break;
            }
        }
        return con;
    }
    public void listCoreCourses(ArrayList<course> t)
    {
        System.out.println("Core Courses");
        coreTaken = new ArrayList();
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'C')) continue;//non-passing grade for core
            if ((prefix.contentEquals("CS")) && (containsCourse(core,"CS",number)))
            {
                t.get(i).print();
                txtCSCore.append(t.get(i).printString()+"\n");
                coreTaken.add(t.remove(i--));//remove after accounting for it, update i
                System.out.println();
            }  
        }
    }
    public void listEquivalences(ArrayList<course> t)
    {
        System.out.println("Recommended substitutions");
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'C')) continue;//non-passing grade
            if (number.contains("T")) continue;
            eqvLoop: for (equiv e : equivalences)
            {
                if (e.contains(prefix, number))
                {
                    ArrayList<course> subs = e.ac;
                    for (course c : subs)
                    {
                        if ((!containsCourse(coreTaken,c.prefix,c.number)) &&
                                (!containsCourse(scienceElectivesTaken,c.prefix,c.number)))
                        {
                            t.get(i).print();
                            txtSubstitution.append(t.get(i).printString() + "   for   " + c.prefix + "-" + c.number + "\n");
                            t.remove(i--); 
                            break eqvLoop;
                        }
                    }
                }
            }
        }
    }
    public void listMathMinorCourses(ArrayList<course> t)
    {

        System.out.println("Math Minor Courses");
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'C')) continue;//non-passing grade for minor
            if (number.contains("T")) continue;
            if ((prefix.contentEquals("MAT")) && 
                    ((containsCourse(mathMinor,"MAT",number))))// || (Integer.parseInt(number) > 212)))
            {
                t.get(i).print();
                txtMathMinor.append(t.get(i).printString() +"\n");
                t.remove(i--);//remove after accounting for it, update i
                System.out.println();
            }  
        }
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            String term = t.get(i).term;
            
            if ((!grade.isEmpty())&&(grade.charAt(0)>'C')) continue;//non-passing grade for minor
            
            if (number.contains("T")) continue;
            
            if ((prefix.contentEquals("MAT")) && 
                    ((containsCourse(mathSuggested,"MAT",number)))) //|| (Integer.parseInt(number) > 212)))
            {
             
                t.get(i).print();
                txtMathMinor.append(t.get(i).printString() +"\n");
                t.remove(i--);//remove after accounting for it, update i
                System.out.println();
            }  
        }
    }
    public void listCSElectiveCourses(ArrayList<course> t)
    {
        System.out.println("CS Elective Courses");
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'C')) continue;//non-passing grade for core
            if ((prefix.contentEquals("CS")) && (containsCourse(csElectives,"CS",number)))
            {
                t.get(i).print();
                txtCSElectives.append(t.get(i).printString() +"\n");
                t.remove(i--);//remove after accounting for it, update i
                System.out.println();
            }  
        }
    }
    public void listEngElectiveCourses(ArrayList<course> t)
    {
        boolean eng111 = false;
        System.out.println("English Elective Courses");
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'C')) continue;//non-passing grade for core
            
            if(number.equals("111"))
            {
                if ((prefix.contentEquals("ENG")) && (containsCourse(engElectives,"ENG",number) ))
                {
                    t.get(i).print();
                    txtEnglish.append(t.get(i).printString() +"\n");
                    t.remove(i--);//remove after accounting for it, update i
                    System.out.println();
                    eng111 = true;
                    break;
                }  
            }
        }
        if(eng111)
        {
            for (int i=0;i<t.size();i++)
            {
                String prefix = t.get(i).prefix;
                String number = t.get(i).number;
                String grade = t.get(i).grade;
                if ((!grade.isEmpty())&&(grade.charAt(0)>'C')) continue;//non-passing grade for core

                if ((prefix.contentEquals("ENG")) && (containsCourse(engElectives,"ENG",number)|| (Integer.parseInt(number) >= 199)))
                {
                    t.get(i).print();
                    txtEnglish.append(t.get(i).printString() +"\n");
                    t.remove(i--);//remove after accounting for it, update i
                    System.out.println();
                    break;
                }  
            }
        }
        
    }
    
    public void listOralElectiveCourses(ArrayList<course> t)
    {
        System.out.println("Communication Elective Courses");
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'D')) continue;//non-passing grade for core
            if ((prefix.contentEquals("SPE") || prefix.contentEquals("COM")) && (containsCourse(oralElectives,"COM",number)
                    || containsCourse(oralElectives, "SPE", number)))
            {
                t.get(i).print();
                txtCommunications.append(t.get(i).printString() +"\n");
                t.remove(i--);//remove after accounting for it, update i
                System.out.println();
            }  
        }
    }
    public void listSocBehaveElectiveCourses(ArrayList<course> t)
    {
        System.out.println("Social and Behavioral Sciences Elective Courses");
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'D')) continue;//non-passing grade for core
            if ((prefix.contentEquals("HIS") || prefix.contentEquals("SOC") ||
                    prefix.contentEquals("PSY") || prefix.contentEquals("POS")) 
                    && (containsCourse(singleClassElectives,"HIS",number) ||
                    containsCourse(singleClassElectives,"SOC",number) ||
                    containsCourse(singleClassElectives,"PSY",number) ||
                    containsCourse(singleClassElectives,"POS",number)))
            {
                t.get(i).print();
                txtSocial.append(t.get(i).printString() +"\n");
                t.remove(i--);//remove after accounting for it, update i
                System.out.println();
            }  
        }
    }
    public void listLanguagesElectiveCourses(ArrayList<course> t)
    {
        System.out.println("Foreign Languages Elective Courses");
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'D')) continue;//non-passing grade for core
            if ((prefix.contentEquals("FRE") || prefix.contentEquals("SPA")) && 
                    (containsCourse(languagesElectives,"FRE",number) || containsCourse(languagesElectives,"SPA",number)))
            {
                t.get(i).print();
                txtForeign.append(t.get(i).printString() +"\n");
                t.remove(i--);//remove after accounting for it, update i
                System.out.println();
            }  
        }
    }
    public void listTheoElectiveCourses(ArrayList<course> t)
    {
        System.out.println("Theology Elective Courses");
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'D')) continue;//non-passing grade for core
            if ((prefix.contentEquals("THE")) && (containsCourse(theoElectives,"THE",number)))
            {
                t.get(i).print();
                txtTheoPhilo.append(t.get(i).printString() +"\n");
                t.remove(i--);//remove after accounting for it, update i
                System.out.println();
            }  
        }
    }
    public void listPhiloElectiveCourses(ArrayList<course> t)
    {
        System.out.println("Philosophy Elective Courses");
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'D')) continue;//non-passing grade for core
            if ((prefix.contentEquals("PHI")) && (containsCourse(philoElectives,"PHI",number)))
            {
                t.get(i).print();
                txtTheoPhilo.append(t.get(i).printString() +"\n");
                t.remove(i--);//remove after accounting for it, update i
                System.out.println();
            }  
        }
    }
    public void listHumElectiveCourses(ArrayList<course> t)
    {
        System.out.println("Humanities and Literature Elective Courses");
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'D')) continue;//non-passing grade for core
            if ((prefix.contentEquals("HUM") || prefix.contentEquals("ENG") ||
                    prefix.contentEquals("FRE") || prefix.contentEquals("SPA")) 
                    && (containsCourse(humElectives,"HUM",number) || 
                    containsCourse(humElectives,"ENG",number) || 
                    containsCourse(humElectives,"FRE",number) || containsCourse(humElectives,"SPA",number)))
            {
                t.get(i).print();
                txtHum.append(t.get(i).printString() +"\n");
                t.remove(i--);//remove after accounting for it, update i
                System.out.println();
            }  
        }
    }
    public void listFineArtsElectiveCourses(ArrayList<course> t)
    {
        System.out.println("Fine Arts Elective Courses");
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'D')) continue;//non-passing grade for core
            if ((prefix.contentEquals("ART") || prefix.contentEquals("DAN") ||
                    prefix.contentEquals("MUS") || prefix.contentEquals("PHO")
                    || prefix.contentEquals("TH")) 
                    && (containsCourse(fineArtsElectives,"ART",number) || 
                    containsCourse(fineArtsElectives,"DAN",number) || 
                    containsCourse(fineArtsElectives,"MUS",number) || 
                    containsCourse(fineArtsElectives,"PHO",number) || containsCourse(fineArtsElectives,"TH",number)))
            {
                t.get(i).print();
                txtFineArts.append(t.get(i).printString() +"\n");
                t.remove(i--);//remove after accounting for it, update i
                System.out.println();
            }  
        }
    }
    public void listScienceElectiveCourses(ArrayList<course> t)
    {
        System.out.println("Science Elective Courses");
        scienceElectivesTaken = new ArrayList();
        for (int i=0;i<t.size();i++)
        {
            String prefix = t.get(i).prefix;
            String number = t.get(i).number;
            String grade = t.get(i).grade;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'C')) continue;//non-passing grade for core
            if ((prefix.contentEquals("PHY")) && (containsCourse(scienceElectives,"PHY",number)))
            {
                t.get(i).print();
                txtScience.append(t.get(i).printString() +"\n");
                scienceElectivesTaken.add(t.remove(i--));//remove after accounting for it, update i
                System.out.println();
            }  
        }
    }
    public DegreeAudit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        System.out.println("\n");
        
        
        System.out.println("GENERAL EDUCATION REQUIREMENTS\n");
        
        engElectives = createEnglishElectives();
        listEngElectiveCourses(Auth.transcript);
        System.out.println("\n");
        
        oralElectives = createOralElectives();
        listOralElectiveCourses(Auth.transcript);
        System.out.println("\n");
        
        singleClassElectives = createSingleClassElectives();
        listSocBehaveElectiveCourses(Auth.transcript);
        System.out.println("\n");
        
        languagesElectives = createLanguagesElectives();
        listLanguagesElectiveCourses(Auth.transcript);
        System.out.println("\n");
        
        theoElectives = createTheoElectives();
        listTheoElectiveCourses(Auth.transcript);
        System.out.println("\n");
        
        philoElectives = createPhiloElectives();
        listPhiloElectiveCourses(Auth.transcript);
        System.out.println("\n");
        
        humElectives = createHumLitElectives();
        listHumElectiveCourses(Auth.transcript);
        System.out.println("\n");
        
        fineArtsElectives = createFineArtsElectives();
        listFineArtsElectiveCourses(Auth.transcript);
        System.out.println("\n");
        
        scienceElectives = createScienceElectives();
        listScienceElectiveCourses(Auth.transcript);
        System.out.println("\n");
        
        System.out.println("MAJOR REQUIREMENTS");
        core = createCore();
        listCoreCourses(Auth.transcript);
        System.out.println("\n");
          
        mathMinor = createMathMinor();
        mathSuggested = createMathSuggested();
        listMathMinorCourses(Auth.transcript);
        System.out.println("\n");
        
        equivalences = createEquivalences();
        listEquivalences(Auth.transcript);
        System.out.println("\n");
        
        csElectives = createCSElectives();
        listCSElectiveCourses(Auth.transcript);
        System.out.println("\n");
        
        System.out.println("OTHER COURSES");
        for (int i=0;i<Auth.transcript.size();i++)
        {
            Auth.transcript.get(i).print();
            txtOther.append(Auth.transcript.get(i).printString() +"\n");
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("CS courses needed");
        ArrayList<course> rem = createRemainingCSCore();
        for(course current: rem){
            System.out.println(current.prefixNum());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane14 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCSCore = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCSElectives = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMathMinor = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtEnglish = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtCommunications = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtSocial = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtTheoPhilo = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtHum = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtFineArts = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtScience = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtSubstitution = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtOther = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtForeign = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtCSCore.setColumns(20);
        txtCSCore.setRows(5);
        jScrollPane1.setViewportView(txtCSCore);

        jLabel1.setText(" CS Core");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel2.setText("CS Electives");

        txtCSElectives.setColumns(20);
        txtCSElectives.setRows(5);
        jScrollPane2.setViewportView(txtCSElectives);

        jLabel3.setText("Math Minor");

        txtMathMinor.setColumns(20);
        txtMathMinor.setRows(5);
        jScrollPane3.setViewportView(txtMathMinor);

        jLabel4.setText("English");

        txtEnglish.setColumns(20);
        txtEnglish.setRows(5);
        jScrollPane4.setViewportView(txtEnglish);

        jLabel5.setText("Communications");

        txtCommunications.setColumns(20);
        txtCommunications.setRows(5);
        jScrollPane5.setViewportView(txtCommunications);

        jLabel6.setText("Social and Behavioral Sciences");

        txtSocial.setColumns(20);
        txtSocial.setRows(5);
        jScrollPane6.setViewportView(txtSocial);

        jLabel7.setText("Theology and Philosophy");

        txtTheoPhilo.setColumns(20);
        txtTheoPhilo.setRows(5);
        jScrollPane7.setViewportView(txtTheoPhilo);

        jLabel8.setText("Humanities and Literature");

        txtHum.setColumns(20);
        txtHum.setRows(5);
        jScrollPane8.setViewportView(txtHum);

        jLabel9.setText("Fine Arts");

        txtFineArts.setColumns(20);
        txtFineArts.setRows(5);
        jScrollPane9.setViewportView(txtFineArts);

        jLabel10.setText("Science");

        txtScience.setColumns(20);
        txtScience.setRows(5);
        jScrollPane10.setViewportView(txtScience);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("MAJOR REQUIREMENTS");

        jLabel12.setText("Recommended substitutions");

        txtSubstitution.setColumns(20);
        txtSubstitution.setRows(5);
        jScrollPane11.setViewportView(txtSubstitution);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("General Education Requirements");

        jLabel14.setText("Other Courses");

        txtOther.setColumns(20);
        txtOther.setRows(5);
        jScrollPane12.setViewportView(txtOther);

        jLabel15.setText("Foreign Languages");

        txtForeign.setColumns(20);
        txtForeign.setRows(5);
        jScrollPane13.setViewportView(txtForeign);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(105, 105, 105))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(529, 529, 529)
                .addComponent(btnOK)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addContainerGap())
        );

        jScrollPane14.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DegreeAudit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DegreeAudit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DegreeAudit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DegreeAudit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DegreeAudit dialog = new DegreeAudit(new javax.swing.JFrame(), true);
                JScrollPane scroll = new JScrollPane(dialog,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                                         JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                dialog.add(scroll);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea txtCSCore;
    private javax.swing.JTextArea txtCSElectives;
    private javax.swing.JTextArea txtCommunications;
    private javax.swing.JTextArea txtEnglish;
    private javax.swing.JTextArea txtFineArts;
    private javax.swing.JTextArea txtForeign;
    private javax.swing.JTextArea txtHum;
    private javax.swing.JTextArea txtMathMinor;
    private javax.swing.JTextArea txtOther;
    private javax.swing.JTextArea txtScience;
    private javax.swing.JTextArea txtSocial;
    private javax.swing.JTextArea txtSubstitution;
    private javax.swing.JTextArea txtTheoPhilo;
    // End of variables declaration//GEN-END:variables
}
