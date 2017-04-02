package com.example.android.reportcard;


public class ReportCard
{

    //declaring a constant variable whose content doesn't needs to be altered
    public final String University_name="Oxford University";

    //declaring variables as private so that no outside user can alter the value by simply creating an object of the class and referencing to the variable
    private String grade;
    private String student_name;
    private int roll_no;
    private int english_marks;
    private int science_marks;
    private int maths_marks;
    private int computer_marks;
    private int total_marks;

    //constructor of the ReportCard Class receives student name and roll no from user at the time of creation of new object
    public ReportCard(String studentname,int rollno,int engmarks,int sciencemarks,int mathsmarks,int computermarks)
    {
        this.student_name=studentname;
        this.roll_no=rollno;
        this.english_marks=engmarks;
        this.science_marks=sciencemarks;
        this.maths_marks=mathsmarks;
        this.computer_marks=computermarks;
    }


    //this method is setter method for receiving students marks in English subject
    public void setEnglish_marks(int englishmarks)
    {
        //condition for checking that marks are positive
        if(englishmarks>=0)
            this.english_marks=englishmarks;
    }
    //this method is a getter method which returns student marks in English subject
    public int getEnglish_marks()
    {
        return english_marks;
    }

    //this method is setter method for receiving students marks in Science subject
    public void setScience_marks(int sciencemarks)
    {
        //condition for checking that marks are positive
        if(sciencemarks>=0)
            this.science_marks=sciencemarks;
    }
    //this method is a getter method which returns student marks in Science subject
    public int getScience_marks()
    {
        return science_marks;
    }

    //this method is setter method for receiving students marks in Maths subject
    public void setMaths_marks(int mathsmarks)
    {
        //condition for checking that marks are positive
        if(mathsmarks>=0)
            this.maths_marks=mathsmarks;
    }
    //this method is a getter method which returns student marks in Maths subject
    public int getMaths_marks()
    {
        return maths_marks;
    }


    //this method is setter method for receiving students marks in Computer subject
    public void setComputer_marks(int computermarks)
    {
        //condition for checking that marks are positive
        if(computermarks>=0)
            this.computer_marks=computermarks;
    }
    //this method is a getter method which returns student marks in Computer subject
    public int getComputer_marks()
    {
        return computer_marks;
    }

    //this method returns the total of the marks obtained by the student
    public int total_marks()
    {
        return (english_marks+science_marks+maths_marks+computer_marks);
    }

    //this method returns the Grade obtained by the Student
    public String getGrade(int rollno)
    {
        total_marks=(english_marks+science_marks+maths_marks+computer_marks);
        if(total_marks>=90)
        {
            grade="A";
        }
        else if(total_marks>=75 && total_marks<90)
        {
            grade="B";
        }
        else if(total_marks>60 && total_marks<75)
        {
            grade="C";
        }
        else if(total_marks >40 && total_marks<60)
        {
            grade="D";
        }
        return grade;
    }

    //this is a toString method to return the contents of the report card

    @Override
    public String toString() {
        return "University name :"+University_name+"\nStudent Name :"+student_name+
                "\nRoll Number :"+roll_no+"\nEnglish :"+english_marks+"\nScience :"+science_marks
                +"\nMaths :"+maths_marks+"\nComputer Marks :"+computer_marks+"\nTotal Marks :"+total_marks+"\nGRADE :"+grade;


    }
}
