
package com.upao.test;

import com.upao.propuestos.Student;

public class TestStudent 
{
    public static void main(String[] args) 
    {
        Student std=new Student("Morante Chang Bryan", "Piura");
        
        Student[] GrupoEstudiantil=new Student[35];
        
        std.addCoursesGrades("\nMetodologia de la Programacion", 2);
        std.addCoursesGrades("\nPsicologia", 2);
        std.addCoursesGrades("\nACtividad Formativa III", 3);
        std.addCoursesGrades("\nCalculo Numerico y Simbolico", 3);
        
        std.printGrades();
        
        System.out.print("\nThe average grade is : "+
                    std.getAverageGrade());
        System.out.println("\n");
    }
    
}
