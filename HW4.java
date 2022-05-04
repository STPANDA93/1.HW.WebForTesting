// Создайте 2 класса. 1ый назовите Student. Он должен содержать в себе следующие
// атрибуты: номер студенческого, имя, фамилию, год обучения, средняя оценка по
// математике, экономике, иностранному языку. 2ой класс назовите StudentTest.
// В нем вы должны создать 3 разных обьекта класса Student, вывести на экран
// среднюю арифметическую оценку каждого студента (учитывая все 3 предмета).

package Lesson4;

public class HW4{
}

class Students {
    
    int NumberOfStudents;
    String Name;
    String Surname;
    int YearOfExpirationDate;
    double AverageMath;
    double AverageEconomic;
    double AverageEnglish;
    
}

class StudentsTest {
    public static void main(String[] args) {
        
    Students First = new Students();
    First.NumberOfStudents = 1;
    First.Name = "Evgeniy";
    First.Surname = "Petrov";
    First.YearOfExpirationDate = 2015;
    First.AverageMath = 4.35;
    First.AverageEconomic = 3.68;
    First.AverageEnglish = 4.86;
    
    System.out.println("Средняя арифметическая оценка студента " + First.Name + 
            " " + First.Surname + " = " + (First.AverageMath + 
            First.AverageEconomic + First.AverageEnglish)/3);
    
    Students Second = new Students();
    Second.NumberOfStudents = 2;
    Second.Name = "Polina";
    Second.Surname = "Nikonova";
    Second.YearOfExpirationDate = 2017;
    Second.AverageMath = 3.75;
    Second.AverageEconomic = 4.28;
    Second.AverageEnglish = 4.51;
    
    System.out.println("Средняя арифметическая оценка студента " + Second.Name +
            " " + Second.Surname + " = " + (Second.AverageMath + 
            Second.AverageEconomic + Second.AverageEnglish)/3);
    
    Students Third = new Students();
    Third.NumberOfStudents = 3;
    Third.Name = "Kira";
    Third.Surname = "Mironova";
    Third.YearOfExpirationDate = 2012;
    Third.AverageMath = 4.91;
    Third.AverageEconomic = 3.47;
    Third.AverageEnglish = 3.55;
    
    System.out.println("Средняя арифметическая оценка студента " + Third.Name +
            " " + Third.Surname + " = " + (Third.AverageMath + 
            Third.AverageEconomic + Third.AverageEnglish)/3);
    
    }
}
